package op0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ResizableTileHeaderView f227345j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f227346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HistogramView f227347m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.barChartWidget_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227345j = (ResizableTileHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.barChartWidget_footerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.barChartWidget_footerSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227346l = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.barChartWidget_chart);
        HistogramView histogramView = (HistogramView) viewFindViewById4;
        histogramView.setRoundedCorners(true);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "also(...)");
        this.f227347m = histogramView;
    }
}
