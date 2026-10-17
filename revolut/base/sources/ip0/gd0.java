package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.ChartButtonHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.InternalLegendView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gd0 extends koi.b {
    public final SegmentedGaugeChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChartButtonHeaderView f164400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InternalLegendView f164401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.segmentedGaugeChart_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (SegmentedGaugeChartView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.segmentedGaugeChart_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ChartButtonHeaderView chartButtonHeaderView = (ChartButtonHeaderView) viewFindViewById2;
        this.f164400g = chartButtonHeaderView;
        View viewFindViewById3 = itemView.findViewById(R$id.segmentedGaugeChart_internalLegend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        InternalLegendView internalLegendView = (InternalLegendView) viewFindViewById3;
        this.f164401h = internalLegendView;
        chartButtonHeaderView.setTitleSingleLineEllipsize(true);
        internalLegendView.setTitleSingleLineEllipsize(true);
    }
}
