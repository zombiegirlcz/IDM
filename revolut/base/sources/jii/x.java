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
public final class x implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f174573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f174574c;
    public final ScreenContentRecyclerView d;
    public final LargeActionButton e;

    public x(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, LargeActionButton largeActionButton2) {
        this.f174572a = controllerContainerCoordinatorLayout;
        this.f174573b = largeActionButton;
        this.f174574c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = largeActionButton2;
    }

    public static x a(View view) {
        int i = R$id.screenRecyclerNavbarTwoButtons_firstButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.screenRecyclerNavbarTwoButtons_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.screenRecyclerNavbarTwoButtons_secondButton;
                    LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(view, i);
                    if (largeActionButton2 != null) {
                        return new x((ControllerContainerCoordinatorLayout) view, largeActionButton, navBarWithToolbar, screenContentRecyclerView, largeActionButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174572a;
    }
}
