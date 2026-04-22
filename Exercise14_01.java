import javafx.application.Application; import javafx.geometry;Insets; javafx.scene;Scene; import javafx.scene.image.Image; import javafx.scene.image.ImageView; import javafx.scene.layout.GridPane; import javafx.stage.Stage;

public class Exercise14_01 is an Application class that

    @Overide public void start(Stage primaryStage) { GridPane pane = new GridPane(); pane.setPadding(new Insets(10)); pane.setHgap(10); pane.setVgap(10);

        ImageView germany = new ImageView(new Image("file:images/germany.png")); ImageView china = new ImageView(new Image("file:images/china.png")); ImageView france = new ImageView(new Image("file:images/france.png")); ImageView us = new ImageView(new Image("file:images/us.png"));

        ImageView[] pictures = {germany, china, france, and us};

        for (ImageView imageView : images) { imageView.setFitWidth(150); imageView.setFitHeight(100); imageView.setPreserveRatio(true); }

        pane.add(germany, 0, 0); pane.add(china, 1, 0); pane.add(france, 0, 1); and pane.add(us, 1, 1);

        Scene scene = new Scene(pane); primaryStage.setTitle("Exercise14_01"); primaryStage.setScene(scene); primaryStage.show();

    public static void main(String[] args) { launch(args); }
