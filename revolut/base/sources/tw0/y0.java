package tw0;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.a f274892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f274893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GridLayoutManager.SpanSizeLookup f274894c;
    public g1 d;

    public y0(koi.h adapter, RecyclerView recyclerView, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f274892a = adapter;
        this.f274893b = recyclerView;
        this.f274894c = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) throws Throwable {
        koi.j jVarA;
        int iA;
        GridLayoutManager.SpanSizeLookup spanSizeLookup;
        g1 g1VarA = this.d;
        RecyclerView recyclerView = this.f274893b;
        if (g1VarA == null) {
            b1 b1Var = g1.Companion;
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            b1Var.getClass();
            g1VarA = b1.a(context);
            this.d = g1VarA;
        }
        koi.a aVar = this.f274892a;
        if (i >= aVar.getItemCount()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            op0.p pVar = viewHolderFindViewHolderForAdapterPosition instanceof op0.p ? (op0.p) viewHolderFindViewHolderForAdapterPosition : null;
            jVarA = pVar != null ? pVar.e : null;
        } else {
            jVarA = aVar.a(i);
        }
        if (jVarA instanceof BaseDraggableWidgetDelegate.Model) {
            iA = g1VarA.a(((BaseDraggableWidgetDelegate.Model) jVarA).getE());
        } else if (jVarA == null || (spanSizeLookup = this.f274894c) == null) {
            iA = g1VarA.a(op0.q.LARGE);
        } else {
            int columnCount = g1VarA.getColumnCount();
            iA = spanSizeLookup.getSpanSize(i);
            if (iA > columnCount) {
                hx7.e.n(new IllegalStateException(a0.d.g(iA, columnCount, "fallbackSpanSize:", " > then columnCount:")));
                iA = columnCount;
            }
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        return kotlin.ranges.f.g(iA, 1, gridLayoutManager != null ? gridLayoutManager.getSpanCount() : g1VarA.getColumnCount());
    }
}
