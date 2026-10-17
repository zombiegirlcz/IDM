package op0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerFrameLayout f227240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f227240j = (ShimmerFrameLayout) itemView.findViewById(R$id.draggableActionWidgetLoading_shimmerContainer);
    }
}
