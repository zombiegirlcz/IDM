package x0b;

import com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends g0b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdvancedChartViewDelegate f301540c;
    public final AsyncDiffRecyclerView d;
    public final g0b.d e;

    public b(AdvancedChartViewDelegate advancedChartViewDelegate, AsyncDiffRecyclerView recyclerView, g0b.d model) {
        Intrinsics.checkNotNullParameter(advancedChartViewDelegate, "advancedChartViewDelegate");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f301540c = advancedChartViewDelegate;
        this.d = recyclerView;
        this.e = model;
    }

    @Override // yji.d
    public final void M() {
        AdvancedChartViewDelegate advancedChartViewDelegate = this.f301540c;
        yji.d.H(this, rd0.e.b(advancedChartViewDelegate.d), new a(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(advancedChartViewDelegate.f60100h), new a(this, null, 1), 3);
    }

    @Override // yji.d
    public final void onCreate() {
        this.d.getRecycledViewPool().setMaxRecycledViews(this.f301540c.f98535a, 1);
    }
}
