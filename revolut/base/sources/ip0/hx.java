package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hx extends koi.b {
    public final ShimmerConstraintLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ShimmerConstraintLayout) itemView;
    }
}
