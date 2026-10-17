package tw0;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.recycler.WidgetGridLayoutManager;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 {
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(x0 x0Var, RecyclerView recyclerView, koi.h adapter, boolean z, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = (i & 8) == 0;
        if ((i & 16) != 0) {
            spanSizeLookup = null;
        }
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        v0 v0Var = new v0(recyclerView.getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_with_container_toolbar_height) * 2, recyclerView.getContext());
        Context context = recyclerView.getContext();
        ScreenContentRecyclerView screenContentRecyclerView = recyclerView instanceof ScreenContentRecyclerView ? (ScreenContentRecyclerView) recyclerView : null;
        boolean z4 = ((Boolean) jo0.g.f176839y.getValue()).booleanValue() && screenContentRecyclerView != null;
        t0 t0Var = new t0(adapter, z3);
        y0 y0Var = new y0(adapter, recyclerView, spanSizeLookup);
        Intrinsics.h(context);
        WidgetGridLayoutManager widgetGridLayoutManager = new WidgetGridLayoutManager(context, v0Var, t0Var, y0Var, z4);
        widgetGridLayoutManager.setSpanSizeLookup(y0Var);
        recyclerView.setLayoutManager(widgetGridLayoutManager);
        recyclerView.addItemDecoration(t0Var);
        recyclerView.setItemAnimator(z4 ? new s0(recyclerView, adapter, z, screenContentRecyclerView.getCollapsibleSectionPressFeedbackDelegate()) : new h1(recyclerView, adapter, z));
        adapter.registerAdapterDataObserver(new w0(recyclerView));
    }
}
