package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f174533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f174534c;
    public final ScreenContentRecyclerView d;

    public k(ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f174532a = controllerContainerCoordinatorLayout;
        this.f174533b = actionFooterView;
        this.f174534c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    public static k a(View view) {
        int i = R$id.screenRecyclerNavbarActionFooter_actionFooterView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(view, i);
        if (actionFooterView != null) {
            i = R$id.screenRecyclerNavbarActionFooter_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new k(actionFooterView, navBarWithToolbar, (ControllerContainerCoordinatorLayout) view, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174532a;
    }
}
