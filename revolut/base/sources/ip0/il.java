package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class il extends koi.b {
    public final BarChartView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.groupedBarLineChart_barChartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (BarChartView) viewFindViewById;
    }
}
