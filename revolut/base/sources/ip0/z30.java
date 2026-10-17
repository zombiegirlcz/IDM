package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z30 extends koi.b {
    public final ShimmerConstraintLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.progressStepHorizontalLoading_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerConstraintLayout) viewFindViewById;
    }
}
