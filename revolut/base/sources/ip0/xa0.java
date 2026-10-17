package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xa0 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ShimmerFrameLayout) itemView.findViewById(R$id.rewardProgressLoading_shimmeringView);
    }
}
