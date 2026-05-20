package org.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio_12 extends Application {

    @Override
    public void start(Stage stage) {

        // ComboBox con lista de países
        ComboBox<String> comboPaises = new ComboBox<>();
        comboPaises.setItems(FXCollections.observableArrayList(
                "España", "México", "Argentina", "Colombia", "Francia"
        ));

        Button btnMostrar = new Button("Mostrar país");
        Label lblMensaje  = new Label("");

        btnMostrar.setOnAction(event -> {
            String pais = comboPaises.getValue(); // getValue() devuelve lo seleccionado, o null si no hay nada

            if (pais == null) {
                lblMensaje.setText("Selecciona un país");
            } else {
                lblMensaje.setText("País seleccionado: " + pais);
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                new Label("Selecciona un país:"),
                comboPaises, btnMostrar, lblMensaje
        );

        Scene scene = new Scene(layout, 300, 180);
        stage.setTitle("Ejercicio 12");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}