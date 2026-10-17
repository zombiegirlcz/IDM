package xc3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f304094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f304095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarVaults f304096c;
    public final NavBarWithToolbar d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, NavBarVaults navBarVaults, NavBarWithToolbar navBarWithToolbar) {
        this.f304094a = controllerContainerCoordinatorLayout;
        this.f304095b = controllerContainerCoordinatorLayout2;
        this.f304096c = navBarVaults;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f304094a;
    }
}
