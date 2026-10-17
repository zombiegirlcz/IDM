package enk;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h {
    public static final int a(RecyclerView recyclerView, String listIdPrefix) {
        List listB;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
        if (hVar == null || (listB = hVar.b()) == null) {
            return -1;
        }
        Iterator it8 = listB.iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (a0.H(((koi.j) it8.next()).getF53123a(), listIdPrefix, false)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void b(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        if (i != -1) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a aVar = new a(context);
            aVar.setTargetPosition(i);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.startSmoothScroll(aVar);
            }
        }
    }
}
