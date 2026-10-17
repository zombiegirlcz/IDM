package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jt extends koi.b {
    public final ResizableTileHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LineChartView f164906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164907h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.lineChartResizableTile_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ResizableTileHeaderView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.lineChartResizableTile_lineChart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164906g = (LineChartView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.lineChartResizableTile_chartMaxValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164907h = (TextView) viewFindViewById3;
    }
}
