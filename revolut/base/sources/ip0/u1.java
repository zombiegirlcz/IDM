package ip0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u1 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f166574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f166575h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.attributeSelectorSmallLoading_shimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.attributeSelectorSmallLoading_fakeTitleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166574g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.attributeSelectorSmallLoading_fakeImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166575h = viewFindViewById3;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((SecondaryBackgroundConstraintLayout) itemView.findViewById(R$id.attributeSelectorSmallLoading_root)).setSecondaryBackground(new ColorDrawable(kli.a.s(R$attr.uikit_colorActionBackgroundNeutral, context)));
    }
}
