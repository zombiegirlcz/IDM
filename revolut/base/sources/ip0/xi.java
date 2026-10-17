package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.ChartButtonHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xi extends koi.b {
    public final HistogramView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChartButtonHeaderView f167176g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.flexibleBarChart_histogramView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (HistogramView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.flexibleBarChart_headerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ChartButtonHeaderView chartButtonHeaderView = (ChartButtonHeaderView) viewFindViewById2;
        this.f167176g = chartButtonHeaderView;
        chartButtonHeaderView.setOnClickListener(new g0(this, 3));
    }
}
