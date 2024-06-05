package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutPage extends JFrame {

    public LogoutPage() {
        super("Logout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 1));

        JLabel messageLabel = new JLabel("Are you sure you want to logout?");
        panel.add(messageLabel);

        JButton logoutButton = new JButton("Yes,Logout");
        panel.add(logoutButton);

        add(panel);

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the application
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LogoutPage().setVisible(true);
            }
        });
    }
}
