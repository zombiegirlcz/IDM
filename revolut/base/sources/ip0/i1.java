package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import com.revolut.core.ui_kit.internal.views.chart.SegmentedChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164622h;
    public final SegmentedChartView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HorizontalBarView f164623j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.analysisMultiChart_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.analysisMultiChart_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164621g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.analysisMultiChart_verticalBarsLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164622h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.analysisMultiChart_segmentedChart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (SegmentedChartView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.analysisMultiChart_horizontalBarView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164623j = (HorizontalBarView) viewFindViewById5;
    }
}
