package op0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ResizableTileHeaderView f227182j;
    public final ComparisonLineChartView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.comparisonLineChartWidget_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227182j = (ResizableTileHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.comparisonLineChartWidget_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (ComparisonLineChartView) viewFindViewById2;
    }
}
