package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.views.FixedTabs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class si extends koi.b {
    public final FixedTabs f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShimmerFrameLayout f166358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.fixedTabsLoading_tabs);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (FixedTabs) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.fixedTabsLoading_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166358g = (ShimmerFrameLayout) viewFindViewById2;
        UIKitFrameLayout uIKitFrameLayout = itemView instanceof UIKitFrameLayout ? (UIKitFrameLayout) itemView : null;
        if (uIKitFrameLayout != null) {
            uIKitFrameLayout.setTouchingEnabled(false);
        }
    }
}
