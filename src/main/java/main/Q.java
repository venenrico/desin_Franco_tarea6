package main;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;

public class Q {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q window = new Q();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Q() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(27, 56, 163, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(211, 215, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(200, 53, 96, 16);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(27, 79, 163, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(49, 102, 247, 87);
		frame.getContentPane().add(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(27, 0, 626, 22);
		frame.getContentPane().add(menuBar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 77, 96, 16);
		frame.getContentPane().add(passwordField);
	}
}
