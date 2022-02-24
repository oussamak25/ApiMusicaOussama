module com.example.apimusicaoussama {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apimusicaoussama to javafx.fxml;
    exports com.example.apimusicaoussama;
}