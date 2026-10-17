package n31;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hx0.r;
import java.util.Iterator;
import koi.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import nkm.d0;
import nkm.y;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final void a(RecyclerView recyclerView, Function1 block) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        d0 d0VarX = y.x(zhm.d0.Q(f.o(0, recyclerView.getChildCount())), new r(recyclerView, 1));
        Iterator it8 = d0VarX.f216835a.iterator();
        while (it8.hasNext()) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder((View) d0VarX.f216836b.invoke(it8.next()));
            b bVar = childViewHolder instanceof b ? (b) childViewHolder : null;
            if (bVar != null) {
                block.invoke(bVar);
            }
        }
    }
}
