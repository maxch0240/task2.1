import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        List<Info> infoList;
        Parser parser = new Parser();
        parser.parse("ОСВ для тренинга (1).xls");
        infoList = parser.returnInfo();

        int counter = 0;
        for(Info inf: infoList) {
            counter++;
            System.out.println(inf.getBAccount() + " " +
                    inf.getInActive() + " " +
                    inf.getInPassive() + " " +
                    inf.getDebit() + " " +
                    inf.getCredit() + " " +
                    inf.getOutActive() + " " +
                    inf.getOutPassive());
        }
        System.out.println(counter);
    }
}
