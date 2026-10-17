package vyl;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.revolut.uicomponent.recycler.LayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o31.b;
import yy9.s;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static void a(RecyclerView recyclerView, j adapter, RecyclerView.ItemAnimator itemAnimator, List decorations, s sVar, int i) {
        if ((i & 2) != 0) {
            itemAnimator = null;
        }
        if ((i & 16) != 0) {
            sVar = null;
        }
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(decorations, "decorations");
        recyclerView.setItemAnimator(itemAnimator);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new LayoutManager(context));
        Iterator it8 = decorations.iterator();
        while (it8.hasNext()) {
            recyclerView.addItemDecoration((RecyclerView.ItemDecoration) it8.next());
        }
        recyclerView.setAdapter(adapter);
        if (sVar != null) {
            sVar.invoke(recyclerView);
        }
    }

    public static void b(RecyclerView recyclerView, j adapter, SimpleItemAnimator simpleItemAnimator, b bVar, int i) {
        if ((i & 2) != 0) {
            simpleItemAnimator = null;
        }
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        a(recyclerView, adapter, simpleItemAnimator, v.l(bVar), null, 8);
    }
}
