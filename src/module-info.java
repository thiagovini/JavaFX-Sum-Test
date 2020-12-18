module fx {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;


    exports sample.application to javafx.graphics, javafx.fxml, javafx.controls;
    exports sample.application.gui to javafx.graphics, javafx.fxml;
    opens sample.application.gui;
}