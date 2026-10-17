package q43;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.feature.card_payment_method.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, a43.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_payment_method/impl/databinding/ScreenCardPaymentMethodSelectorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cardPaymentMethodSelector_confirmFooter;
        FooterActionButtonView footerActionButtonView = (FooterActionButtonView) ViewBindings.findChildViewById(p0, i);
        if (footerActionButtonView != null) {
            i = R$id.cardPaymentMethodSelector_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.cardPaymentMethodSelector_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.cardPaymentMethodSelector_sectionTabs;
                    Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                    if (tabs != null) {
                        i = R$id.cardPaymentMethodSelector_slidingContainer;
                        SlidingFromTopViewContainer slidingFromTopViewContainer = (SlidingFromTopViewContainer) ViewBindings.findChildViewById(p0, i);
                        if (slidingFromTopViewContainer != null) {
                            return new a43.a((ControllerContainerCoordinatorLayout) p0, footerActionButtonView, navBarWithToolbar, screenContentRecyclerView, tabs, slidingFromTopViewContainer);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
