package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class id0 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SegmentedGaugeChartView f164682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SmallActionButton f164683h;
    public final AppCompatTextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.segmentedGaugeChartLoading_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.segmentedGaugeChartLoading_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164682g = (SegmentedGaugeChartView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.segmentedGaugeChartLoading_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164683h = (SmallActionButton) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.segmentedGaugeChartLoading_display);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
    }
}
