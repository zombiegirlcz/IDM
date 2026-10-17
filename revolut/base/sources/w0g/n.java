package w0g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f293723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingBottomBarView f293724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f293725c;

    public n(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FloatingBottomBarView floatingBottomBarView, NavBarWithToolbar navBarWithToolbar) {
        this.f293723a = controllerContainerCoordinatorLayout;
        this.f293724b = floatingBottomBarView;
        this.f293725c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293723a;
    }
}
