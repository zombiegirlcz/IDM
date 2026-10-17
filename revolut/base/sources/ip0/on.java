package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class on extends koi.b {
    public final HistogramView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChartHeaderView f165693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ifm.c f165694h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.histogamDelegate_histogramView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (HistogramView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.histogramDelegate_headerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ChartHeaderView chartHeaderView = (ChartHeaderView) viewFindViewById2;
        this.f165693g = chartHeaderView;
        chartHeaderView.setOnClickListener(new g0(new ad(this, 12), 4));
    }
}
