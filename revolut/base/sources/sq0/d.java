package sq0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hx0.r;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import nkm.d0;
import nkm.y;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d {
    public static final void a(RecyclerView recyclerView, Function1 function1) {
        d0 d0VarX = y.x(zhm.d0.Q(kotlin.ranges.f.o(0, recyclerView.getChildCount())), new r(recyclerView, 2));
        Iterator it8 = d0VarX.f216835a.iterator();
        while (it8.hasNext()) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder((View) d0VarX.f216836b.invoke(it8.next()));
            koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
            if (bVar != null) {
                function1.invoke(bVar);
            }
        }
    }
}
