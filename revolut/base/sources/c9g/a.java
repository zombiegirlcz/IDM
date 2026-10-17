package c9g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f22379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingBottomBarView f22380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f22381c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FloatingBottomBarView floatingBottomBarView, NavBarWithToolbar navBarWithToolbar) {
        this.f22379a = controllerContainerCoordinatorLayout;
        this.f22380b = floatingBottomBarView;
        this.f22381c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f22379a;
    }
}
