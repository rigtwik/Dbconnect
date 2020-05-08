import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author Rigwik
 *
 */
public class DatabaseTest {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/demo_schema";
		String username="root";
		String password="root";
		String sql="INSERT INTO users(idusers, name,email,salary) VALUES ('5', 'Yash', 'Yash@yash.com', '4000000')";
		Connection con=null;
		try {
			Class c=Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url, username, password);
			System.out.println(con);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.execute();
			System.out.println("successfully inserted");
		
	}

}
