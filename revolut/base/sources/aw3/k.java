package aw3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f10698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f10699c;
    public final TwinVerticalButton d;

    public k(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, TwinVerticalButton twinVerticalButton) {
        this.f10697a = controllerContainerCoordinatorLayout;
        this.f10698b = navBarWithToolbar;
        this.f10699c = screenContentRecyclerView;
        this.d = twinVerticalButton;
    }

    public static k a(View view) {
        int i = R$id.creditApplication_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
        if (navBarWithToolbar != null) {
            i = R$id.creditApplication_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
            if (screenContentRecyclerView != null) {
                i = R$id.creditApplication_twinVerticalButton;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(view, i);
                if (twinVerticalButton != null) {
                    return new k((ControllerContainerCoordinatorLayout) view, navBarWithToolbar, screenContentRecyclerView, twinVerticalButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10697a;
    }
}
