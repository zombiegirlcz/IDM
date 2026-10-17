package l9k;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, u8k.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/payments/peer_to_peer/impl/databinding/ScreenTransferPeerToPeerReviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.transferScreenReview_footerText;
        FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
        if (footerTextView != null) {
            i = R$id.transferScreenReview_navigationBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.transferScreenReview_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.transferScreenReview_submitButton;
                    LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                    if (largeActionButton != null) {
                        return new u8k.b(footerTextView, largeActionButton, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
