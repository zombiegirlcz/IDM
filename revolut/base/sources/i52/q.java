package i52;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.q implements Function1 {
    public static final q f = new q();

    public q() {
        super(1, m12.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenApmTransferReviewBinding;", 0);
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
                        return new m12.e(footerTextView, largeActionButton, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
