package c9g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f22415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f22416b;

    public o(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar) {
        this.f22415a = controllerContainerCoordinatorLayout;
        this.f22416b = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f22415a;
    }
}
