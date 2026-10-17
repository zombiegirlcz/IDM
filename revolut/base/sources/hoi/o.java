package hoi;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((RecyclerView.ViewHolder) obj2).itemView.getTop()), Integer.valueOf(((RecyclerView.ViewHolder) obj3).itemView.getTop()));
    }
}
