import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

     ArrayList<String> list = new ArrayList<String>();
     list.add("aa");
     list.add("bb");
     list.add("cc");
     list.add("dd");

        for (int i = 0; i < list.size(); i++) {
            String variable = list.get(i);
            System.out.println("list[i] = " + variable);
        }
        System.out.println(list.size());




        }
    }

