package n99;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f213608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f213609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f213610c;

    public b(TwinVerticalButton twinVerticalButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f213608a = controllerContainerCoordinatorLayout;
        this.f213609b = navBarWithToolbar;
        this.f213610c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f213608a;
    }
}
