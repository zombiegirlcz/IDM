package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tg0 extends koi.b {
    public final ShimmerConstraintLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.smartTileSendMoneyLoading_shimmerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.smartTileSendMoneyLoading_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        LargeActionButton largeActionButton = (LargeActionButton) viewFindViewById2;
        largeActionButton.G = null;
        largeActionButton.n(largeActionButton.f58720s);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
    }
}
