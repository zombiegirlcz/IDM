package l8j;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.crypto.asset_details.impl.R$id;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f192997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ButtonsActionsView f192998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f192999c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ButtonsActionsView buttonsActionsView, NavBarWithToolbar navBarWithToolbar) {
        this.f192997a = controllerContainerCoordinatorLayout;
        this.f192998b = buttonsActionsView;
        this.f192999c = navBarWithToolbar;
    }

    public static a a(View view) {
        int i = R$id.cryptoInvestmentDetails_buttonsActions;
        ButtonsActionsView buttonsActionsView = (ButtonsActionsView) ViewBindings.findChildViewById(view, i);
        if (buttonsActionsView != null) {
            i = R$id.cryptoInvestmentDetails_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.cryptoInvestmentDetails_recycler;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new a((ControllerContainerCoordinatorLayout) view, buttonsActionsView, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f192997a;
    }
}
