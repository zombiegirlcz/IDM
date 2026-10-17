package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gk extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShimmerFrameLayout f164431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShimmerFrameLayout f164432h;
    public final fk i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.fullScreenStateLoading_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.fullScreenStateLoading_shimmeringViewTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164431g = (ShimmerFrameLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.fullScreenStateLoading_shimmeringViewSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164432h = (ShimmerFrameLayout) viewFindViewById3;
        this.i = new fk();
    }
}
