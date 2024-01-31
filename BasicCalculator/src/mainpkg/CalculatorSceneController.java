/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CalculatorSceneController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Label resultLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addOnClick(ActionEvent event) {
        resultLabel.setText(
                Integer.toString(
                Integer.parseInt(xTextField.getText())
                        +
                  Integer.parseInt(yTextField.getText())
                  
                          )
                          
                );
        
    }

    @FXML
    private void subOnClick(ActionEvent event) {
        resultLabel.setText(
                Integer.toString(
                Integer.parseInt(xTextField.getText())
                        -
                  Integer.parseInt(yTextField.getText())
                  
                          )
                          
                );
    }

    @FXML
    private void MultOnClick(ActionEvent event) {
                resultLabel.setText(
                Integer.toString(
                Integer.parseInt(xTextField.getText())
                        *
                  Integer.parseInt(yTextField.getText())
                  
                          )
                          
                );
    }

    @FXML
    private void DivOnClick(ActionEvent event) {
                resultLabel.setText(
                Integer.toString(
                Integer.parseInt(xTextField.getText())
                        /
                  Integer.parseInt(yTextField.getText())
                  
                          )
                          
                );
    }
    
}
