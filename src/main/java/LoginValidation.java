

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginValidation() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		
		if(uname.equals("saksham") && pword.equals("test@123")) 
		{
			HttpSession session  = request.getSession();
			session.setAttribute("username", uname);
			 response.sendRedirect("validuser.html");
		}
		
		else 
		{
			//response.sendRedirect("login.html");
			response.sendRedirect("Error.html");
		}
	}

	
	

}
