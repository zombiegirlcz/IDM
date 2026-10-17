package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendView;
import com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rj extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HorizontalChartLegendView f166195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CurvedFanChartView f166196h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.projectionChart_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.projectionChart_legendView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166195g = (HorizontalChartLegendView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.projectionChart_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166196h = (CurvedFanChartView) viewFindViewById3;
    }
}
