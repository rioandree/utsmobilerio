package com.example.utsmobilerio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val listReview: ArrayList<String>) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvList.text = listReview[position]
    }
    override fun getItemCount(): Int {
        return listReview.size
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvList: TextView = view.findViewById(R.id.tvList)
    }
}