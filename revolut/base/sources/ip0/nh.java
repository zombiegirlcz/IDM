package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nh extends koi.b {
    public final ShimmerConstraintLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ShimmerConstraintLayout) itemView.findViewById(R$id.extraSmallLoadingTile_shimmerLayout);
    }
}
