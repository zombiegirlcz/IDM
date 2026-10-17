package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ee extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShimmerFrameLayout f164072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShimmerFrameLayout f164073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.detailGridItemLoadingDelegate_logoShimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.detailGridItemLoadingDelegate_titleShimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164072g = (ShimmerFrameLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.detailGridItemLoadingDelegate_badgeShimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164073h = (ShimmerFrameLayout) viewFindViewById3;
    }
}
