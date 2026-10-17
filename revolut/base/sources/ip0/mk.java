package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendView;
import com.revolut.core.ui_kit.internal.views.gaugechart.bullethorizontal.ProgressStepHorizontalView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mk extends koi.b {
    public final HorizontalChartLegendView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressStepHorizontalView f165395g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.gaugeSteppedHorizontal_legend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (HorizontalChartLegendView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.gaugeSteppedHorizontal_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165395g = (ProgressStepHorizontalView) viewFindViewById2;
    }
}
