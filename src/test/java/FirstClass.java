import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void test0001 () {
        System.out.println("This will be printed");

    }

    @Test
    public void test0002() {
        int myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void test0003() {

        String messageOne = new String("Who let the dogs out?");

        String messageTwo = "Who who who who!";

        String compeleteMessage = messageOne + messageTwo;
        System.out.println(compeleteMessage);
    }

    @Test
    public void test0004 () {
        int num = 5;
        String message = "I have " + num + " cookies";
        System.out.println(message);
    }

    @Test
    public void test0005() {
        boolean toBe = false;

        boolean b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

        int children = 0;
        int a = 0;
        b = true;
        boolean c = false;

        System.out.println(a);
    }

    //TO DO: change to accept parametersso it will always print correct message
    @Test
    public void test0006() {
        int a = 5;

        if (a == 5) {
            System.out.println("Ohhh! So a is 4!");
        }  else {
                System.out.println("A IS NOT EQUAL TO 4");
        }
    }

    @Test
    public void test0007() {
        int[] arrayOfIntegers = {1, 9, 9, 5};

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int currentElement = arrayOfIntegers[i];
            System.out.println(currentElement);
        }
    }
}







