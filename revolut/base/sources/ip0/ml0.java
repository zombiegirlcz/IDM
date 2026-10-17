package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerLinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ml0 extends koi.b {
    public final ShimmerLinearLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ShimmerLinearLayout) itemView;
    }
}
