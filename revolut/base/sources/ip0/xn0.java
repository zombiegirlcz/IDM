package ip0;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xn0 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f167201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f167202h;
    public final View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.extraSmallVoucherLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.extraSmallVoucherLoading_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167201g = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.extraSmallVoucherLoading_constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167202h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.extraSmallVoucherLoading_cardBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
    }
}
