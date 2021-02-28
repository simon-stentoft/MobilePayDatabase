package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectEksempel {
    //Making a connection between database and application.
    public static void connect() {
        Connection connection = null;
        try {
            String url = "jdbc:sqlite:D:\\IntelliJ Java projecter\\MobilepayDatabase\\db\\MobilePay.db";

            connection = DriverManager.getConnection(url);

            System.out.println("Connection established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
