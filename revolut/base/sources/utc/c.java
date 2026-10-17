package utc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f283079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f283080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs f283081c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, Tabs tabs) {
        this.f283079a = controllerContainerCoordinatorLayout;
        this.f283080b = navBarWithToolbar;
        this.f283081c = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f283079a;
    }
}
