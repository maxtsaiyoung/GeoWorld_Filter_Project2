public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(158, 121);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());



        for (int row = 120; row < 799; row = row + 1) {
            for (int col = 155; col <866; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if(red< 195 && red>158 && green> 45 && green <70 && blue> 45 && blue<70){
                    plane.setPixelColor(166,157,209);
                }else if(red>175 && red<215 && green>180 && green<215 && blue>170 && blue<200) {
                    plane.setPixelColor(red, green/4, blue);
                }else if(red>160 && red<190 && green>45 && green<65 && blue>15 && blue<45){
                    plane.setPixelColor(red/col, green/2, blue*2);
                }
                }
                }

        plane.trailWidth = 40;
        plane.isTrail = true;
        plane.setColor(252,219,3);
        plane.teleport(114,75);
        plane.move(700);
        plane.teleport(868,793);
        plane.turn(180);
        plane.move(715);
        plane.turn(90);
        plane.move(720);

        plane.teleport(129,98);
        plane.trailWidth = 7;
        plane.turn(90);
        plane.setColor(245,116,24);
        plane.move(680);


            }
        }




/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/