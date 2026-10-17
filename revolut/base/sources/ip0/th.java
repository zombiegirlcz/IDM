package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.fanchart.FanChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class th extends koi.b {
    public final ChartHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FanChartView f166518g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.fanChart_chartHeaderView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ChartHeaderView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.fanChart_fanChartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166518g = (FanChartView) viewFindViewById2;
    }
}
