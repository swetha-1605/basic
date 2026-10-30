/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sample;

/**
 *
 * @author skali
 */
public class Sample {

package com.mycompany.sample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>My First Web App</title></head>");
        out.println("<body style='text-align:center; font-family:Arial;'>");

        out.println("<h1>Welcome to My Java Web Application!</h1>");
        out.println("<h2>Hello World!</h2>");
        out.println("<p>Successfully deployed using Jenkins CI/CD Pipeline.</p>");

        out.println("</body>");
        out.println("</html>");
    }
}

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
