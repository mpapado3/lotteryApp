/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainApp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author michael_papado
 */
public class LotteryTableModel extends AbstractTableModel {
    
    private List gifts;
    
    private String[] columnNames;

    public LotteryTableModel(List gifts, String[] columnNames) {
        this.gifts = new ArrayList();
        this.gifts = gifts;
        this.columnNames = columnNames;
    }   

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return gifts.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int gift = (int)gifts.get(rowIndex);
        
        switch(columnIndex){
            case 0: return rowIndex+1;
            case 1: return gift;
            default: return "ERROR";
        }
    }
    
}
