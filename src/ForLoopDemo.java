public class ForLoopDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
        {
            System.out.println("DISPLAYING i's value" +i);
        }

        String[] NameArray1;
        NameArray1 = new String[5];

        NameArray1[0] = "Position 1";
        NameArray1[1] = "Position 2";
        NameArray1[2] = "Position 3";
        NameArray1[3] = "Position 4";
        NameArray1[4] = "Position 5";

        for (int j=0; j<5; j++)
        {
            System.out.println("Name at position:" +j +" is: " +NameArray1[j]);
        }
    }
}
