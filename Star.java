package star;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


/**
Programmer: Zachary Dorow
Programming Project 8.12
Object Oriented Programming I
Star Exercise 
 */
public class Star extends Application {
    
  @Override
  public void start(Stage stage) {
        Pane root = new Pane();
        final int SCENE_WIDTH = 750;
        final int SCENE_HEIGHT = 750;
        stage.getIcons().add(new Image("file:Stars.jpg"));
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
        
        double L = 2.25; 
        double S = 0.75;
        
double[] starPoints = {40,10, 48,30, 68,30, 54,44, 62,64, 40,54, 18,64, 26,44, 14,30, 32,30};

        Polygon Star = new Polygon(starPoints);
        Star.setTranslateY(300);
        Star.setScaleY(S);
        Star.setScaleX(S);
        Star.setFill(Color.YELLOWGREEN);
        root.getChildren().add(Star);
        
        Polygon Star1 = new Polygon(starPoints);
        Star1.setTranslateY(550);
        Star1.setFill(Color.DARKGOLDENROD);
        root.getChildren().add(Star1);
        
        Polygon Star2 = new Polygon(starPoints);
        Star2.setScaleY(S);
        Star2.setScaleX(S);
        Star2.setRotate(180);
        Star2.setTranslateX(550);
        Star2.setFill(Color.DARKGOLDENROD);  
        root.getChildren().add(Star2);
        
        Polygon Star3 = new Polygon(starPoints);
        Star3.setRotate(180);
        Star3.setTranslateY(550);
        Star3.setTranslateX(200);
        Star3.setFill(Color.MAROON);
        root.getChildren().add(Star3);
        
        Polygon Star4 = new Polygon(starPoints);
        Star4.setScaleY(L);
        Star4.setScaleX(L);
        Star4.setTranslateY(425);
        Star4.setTranslateX(500); 
        Star4.setFill(Color.MAROON);    
        root.getChildren().add(Star4);
        
        Polygon Star5 = new Polygon(starPoints);
        Star5.setTranslateY(250);
        Star5.setRotate(180);
        Star5.setTranslateX(100);
        Star5.setFill(Color.WHITESMOKE);
        root.getChildren().add(Star5);
        
        Polygon Star6 = new Polygon(starPoints);
        Star6.setTranslateY(250);        
        Star6.setScaleY(.25);
        Star6.setScaleX(.25);        
        Star6.setTranslateX(175);            
        Star6.setFill(Color.WHITESMOKE);         
        root.getChildren().add(Star6);
        
        Polygon Star7 = new Polygon(starPoints);
        Star7.setRotate(180);
        Star7.setTranslateY(250);
        Star7.setTranslateX(300);
        Star7.setFill(Color.GREEN);
        root.getChildren().add(Star7);
        
        Polygon Star8 = new Polygon(starPoints);
        Star8.setTranslateY(200);
        Star8.setTranslateX(375);
        Star8.setFill(Color.GREEN);    
        root.getChildren().add(Star8);
       
        Polygon Star9 = new Polygon(starPoints);
        Star9.setRotate(180);
        Star9.setTranslateY(-150);
        Star9.setFill(Color.BLUE);
        root.getChildren().add(Star9);
        
        Polygon Star10 = new Polygon(starPoints);
        Star10.setTranslateY(-200);        
        Star10.setFill(Color.BLUE);    
        root.getChildren().add(Star10);
      
        stage.setTitle("Seeing Stars");
        stage.setScene(scene);
        stage.show();
}
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
