package Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Converter");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DEll\\Downloads\\images (1).png"));
        frame.getContentPane().setForeground(new Color(255, 255, 255));
        frame.getContentPane().setBackground(new Color(0, 0, 64));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(424, 642);

        Container pane = frame.getContentPane();

        JLabel inputLabel = new JLabel("Input: ");
        inputLabel.setForeground(new Color(255, 255, 255));
        inputLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        inputLabel.setBounds(10, 104, 99, 23);
        JTextField inputField = new JTextField(10);
        inputField.setFont(new Font("Tahoma", Font.BOLD, 16));
        inputField.setBounds(10, 53, 390, 51);
        frame.getContentPane().setLayout(null);
        pane.add(inputLabel);
        pane.add(inputField);

        JLabel outputLabel = new JLabel("Output: ");
        outputLabel.setForeground(new Color(255, 255, 255));
        outputLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        outputLabel.setBounds(10, 193, 88, 23);
        JTextField outputField = new JTextField(10);
        outputField.setFont(new Font("Tahoma", Font.BOLD, 16));
        outputField.setBounds(10, 137, 390, 51);
        outputField.setEditable(false);
        pane.add(outputLabel);
        pane.add(outputField);

        JComboBox<String> conversionType = new JComboBox<>(new String[]{"Pounds to Kilograms", "Kilograms to Pounds"});
        conversionType.setFont(new Font("Tahoma", Font.PLAIN, 16));
        conversionType.setBounds(10, 226, 191, 42);
        pane.add(conversionType);

        JButton convertButton = new JButton("Convert");
        convertButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        convertButton.setBackground(new Color(240, 240, 240));
        convertButton.setForeground(new Color(64, 0, 64));
        convertButton.setBounds(211, 225, 189, 44);
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(inputField.getText());
                    double outputValue;
                    if (conversionType.getSelectedIndex() == 0) {
                        outputValue = inputValue * 0.45359237;
                    } else {
                        outputValue = inputValue / 0.45359237;
                    }
                    outputField.setText(String.valueOf(outputValue));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        pane.add(convertButton);

        JButton clearButton = new JButton("CE");
        clearButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        clearButton.setBounds(139, 288, 125, 51);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                outputField.setText("");
            }
        });
        pane.add(clearButton);
        
        JLabel lblWeightAndMass = new JLabel("Weight and Mass Calculator");
        lblWeightAndMass.setForeground(new Color(255, 255, 255));
        lblWeightAndMass.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblWeightAndMass.setBounds(56, 20, 294, 23);
        frame.getContentPane().add(lblWeightAndMass);
        
        JButton btnBackspace = new JButton("B");
        btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnBackspace.setBounds(274, 288, 122, 51);
        frame.getContentPane().add(btnBackspace);
        
        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
        	private JLabel textField;

			public void actionPerformed(ActionEvent e) {
        		String number =textField.getText()+btn1.getText();
				textField.setText(number);
        	}
        });
        btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn1.setBounds(274, 471, 122, 51);
        frame.getContentPane().add(btn1);
        
        JButton btn9 = new JButton("9");
        btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn9.setBounds(10, 349, 122, 51);
        frame.getContentPane().add(btn9);
        
        JButton btn8 = new JButton("8");
        btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn8.setBounds(142, 349, 122, 51);
        frame.getContentPane().add(btn8);
        
        JButton btn7 = new JButton("7");
        btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn7.setBounds(274, 349, 122, 51);
        frame.getContentPane().add(btn7);
        
        JButton btn6 = new JButton("6");
        btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn6.setBounds(10, 410, 122, 51);
        frame.getContentPane().add(btn6);
        
        JButton btn5 = new JButton("5");
        btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn5.setBounds(142, 410, 122, 51);
        frame.getContentPane().add(btn5);
        
        JButton btn4 = new JButton("4");
        btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn4.setBounds(274, 410, 122, 51);
        frame.getContentPane().add(btn4);
        
        JButton btn2 = new JButton("2");
        btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn2.setBounds(142, 471, 122, 51);
        frame.getContentPane().add(btn2);
        
        JButton btn3 = new JButton("3");
        btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn3.setBounds(10, 471, 122, 51);
        frame.getContentPane().add(btn3);
        
        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn0.setBounds(142, 532, 122, 51);
        frame.getContentPane().add(btn0);
        
        JButton btnDot = new JButton(".");
        btnDot.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnDot.setBounds(274, 532, 122, 51);
        frame.getContentPane().add(btnDot);

        frame.setVisible(true);
    }
}