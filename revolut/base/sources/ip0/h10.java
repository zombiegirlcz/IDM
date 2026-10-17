package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.PieChartView;
import com.revolut.core.ui_kit.internal.views.chart.VerticalChartLegendView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h10 extends koi.b {
    public final PieChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VerticalChartLegendView f164491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.pieChartLegend_pieChartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (PieChartView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.pieChartLegend_legendView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164491g = (VerticalChartLegendView) viewFindViewById2;
    }
}
