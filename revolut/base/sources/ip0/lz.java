package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartLabelsView;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lz extends koi.b {
    public final OrderBookChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OrderBookChartLabelsView f165281g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.orderBookChart_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (OrderBookChartView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.orderBookChart_labels);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165281g = (OrderBookChartLabelsView) viewFindViewById2;
    }
}
