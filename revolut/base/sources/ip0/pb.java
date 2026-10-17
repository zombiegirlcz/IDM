package ip0;

import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pb extends koi.b {
    public final ComparisonLineChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(FrameLayout itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View childAt = itemView.getChildAt(0);
        Intrinsics.i(childAt, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView");
        this.f = (ComparisonLineChartView) childAt;
        this.f165803g = Integer.MIN_VALUE;
    }
}
