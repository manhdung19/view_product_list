/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.mavenproject2.resources;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<style>");
        out.println(".card {"
                + "border: 1px solid #ddd; padding: 16px; border-radius: 8px; width: 300px;"
                + "box-shadow: 2px 2px 10px rgba(0,0,0,0.1); text-align: center;"
                + "margin: 20px auto; font-family: Arial, sans-serif;}");
        out.println(".card h2 {color: #04AA6D;}");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<div class='card'>");
        out.println("<img src='https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m0ohi06zj6ctd6' alt='Quần jeans' style='width:100%; border-radius: 8px;'>");
        out.println("<h2>" + name + "</h2>");
        out.println("<p><strong>Giá:</strong> " + price + "</p>");
        out.println("<p><strong>Số lượng:</strong> " + quantity + "</p>");
        out.println("</div>");
        out.println("</body></html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
