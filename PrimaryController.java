package com.mycompany.numbers;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML 
    private TextField tfOne;
    @FXML 
    private TextField tfTwo;
    @FXML
    private Label sumLabel;
    @FXML
    private Button calculateClicked;
    
    @FXML
    private void calculateClicked(ActionEvent event) {
        int sum;
        sum = Integer.parseInt(tfOne.getText()) + Integer.parseInt(s)tfTwo.getText());
        
        sumLabel.setText("" + sum);
    }
}
