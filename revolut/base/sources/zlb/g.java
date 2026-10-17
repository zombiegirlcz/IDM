package zlb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.q implements Function1 {
    public static final g f = new g();

    public g() {
        super(1, xmb.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsOptionSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.optionSelection_ctaButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.optionSelection_footer;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.optionSelection_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.optionSelection_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.optionSelection_screenContainer;
                        if (((ControllerContainerCoordinatorLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                            return new xmb.g((ControllerContainerConstraintLayout) p0, largeActionButton, footerTextView, navBarWithToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
