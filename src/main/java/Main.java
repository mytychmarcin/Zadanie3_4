import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println( + i +  + j +   + random.nextInt(101));
            }
        }
    }
}