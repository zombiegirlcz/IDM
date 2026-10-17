package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y8 extends koi.b {
    public final ResizableTileHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearGaugeChartView f167276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HorizontalSingleLineChartLegendView f167277h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellWithLinearGauge_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ResizableTileHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellWithLinearGauge_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167276g = (LinearGaugeChartView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellWithLinearGauge_legend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167277h = (HorizontalSingleLineChartLegendView) viewFindViewById3;
    }
}
