package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class so extends koi.b {
    public final HorizontalChartLegendView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.horizontalLegendDelegate_legendView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (HorizontalChartLegendView) viewFindViewById;
    }
}
