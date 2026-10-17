package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f174564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f174565c;
    public final ScreenContentRecyclerView d;

    public u(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f174563a = controllerContainerCoordinatorLayout;
        this.f174564b = largeActionButton;
        this.f174565c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    public static u a(View view) {
        int i = R$id.goToButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new u(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) view, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174563a;
    }
}
