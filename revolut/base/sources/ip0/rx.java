package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rx extends koi.b {
    public final ChartHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MultiTargetFanChartView f166251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166252h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.multiTargetFanChart_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ChartHeaderView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.multiTargetFanChart_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166251g = (MultiTargetFanChartView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.multiTargetFanChart_legend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166252h = (TextView) viewFindViewById3;
    }
}
