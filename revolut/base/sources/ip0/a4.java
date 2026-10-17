package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a4 extends koi.b {
    public final HorizontalChartLegendView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BarChartView f163381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.barchartDelegate_legendView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (HorizontalChartLegendView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.barchartDelegate_barchartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163381g = (BarChartView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.barchartDelegate_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163382h = (TextView) viewFindViewById3;
    }
}
