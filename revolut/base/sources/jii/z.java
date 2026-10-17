package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f174578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarVaults f174579c;

    public z(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarVaults navBarVaults) {
        this.f174577a = controllerContainerCoordinatorLayout;
        this.f174578b = actionFooterView;
        this.f174579c = navBarVaults;
    }

    public static z a(View view) {
        int i = R$id.screenRecyclerNavbarVaultsActionFooter_actionFooterView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(view, i);
        if (actionFooterView != null) {
            i = R$id.screenRecyclerNavbarVaultsActionFooter_navBar;
            NavBarVaults navBarVaults = (NavBarVaults) ViewBindings.findChildViewById(view, i);
            if (navBarVaults != null) {
                i = R$id.screenRecyclerNavbarVaultsActionFooter_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new z((ControllerContainerCoordinatorLayout) view, actionFooterView, navBarVaults);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174577a;
    }
}
