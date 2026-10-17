package x1j;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f302453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f302454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs f302455c;
    public final TwinVerticalButton d;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, Tabs tabs, TwinVerticalButton twinVerticalButton) {
        this.f302453a = controllerContainerCoordinatorLayout;
        this.f302454b = navBarWithToolbar;
        this.f302455c = tabs;
        this.d = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f302453a;
    }
}
