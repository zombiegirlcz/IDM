package c4g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f21265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingBottomBarView f21266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f21267c;

    public g(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FloatingBottomBarView floatingBottomBarView, NavBarWithToolbar navBarWithToolbar) {
        this.f21265a = controllerContainerCoordinatorLayout;
        this.f21266b = floatingBottomBarView;
        this.f21267c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f21265a;
    }
}
