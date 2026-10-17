package op0;

import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerConstraintLayout f227473j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.comparisonLineChartLoadingWidget_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227473j = (ShimmerConstraintLayout) viewFindViewById;
    }
}
