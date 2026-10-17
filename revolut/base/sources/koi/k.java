package koi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface k {
    /* JADX INFO: renamed from: a */
    int getF98535a();

    boolean f(int i, j jVar);

    RecyclerView.ViewHolder g(ViewGroup viewGroup);

    /* JADX INFO: renamed from: h */
    void o(RecyclerView.ViewHolder viewHolder);

    /* JADX INFO: renamed from: j */
    void p(RecyclerView.ViewHolder viewHolder, j jVar, int i, List list);

    /* JADX INFO: renamed from: k */
    void n(RecyclerView.ViewHolder viewHolder);

    void onViewRecycled(RecyclerView.ViewHolder viewHolder);
}
