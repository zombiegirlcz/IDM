package mhe;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import tw0.g1;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends AdaptiveGridLayoutManager.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4l.j f205543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f205544b;

    public a(z4l.j adapter, e gridColumns) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(gridColumns, "gridColumns");
        this.f205543a = adapter;
        this.f205544b = gridColumns;
    }

    public final boolean a(int i) {
        koi.j jVarA = this.f205543a.a(i);
        SmallStockCardDelegate.Model model = jVarA instanceof SmallStockCardDelegate.Model ? (SmallStockCardDelegate.Model) jVarA : null;
        return (model != null ? model.f53388p : null) instanceof j;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        g1 g1Var = (g1) this.f205544b.f205551a.getValue();
        if (!a(i)) {
            return g1Var.a(q.LARGE);
        }
        int iA = g1Var.a(q.SMALL);
        int i2 = i + 1;
        if (i2 >= this.f205543a.getItemCount() || !a(i2)) {
            int columnCount = g1Var.getColumnCount() / iA;
            int i3 = 0;
            for (int i5 = i - 1; i5 >= 0 && a(i5); i5--) {
                i3++;
            }
            int i6 = i3 % columnCount;
            if (i6 != columnCount - 1) {
                return g1Var.getColumnCount() - (i6 * iA);
            }
        }
        return iA;
    }
}
