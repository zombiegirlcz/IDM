package nl7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f217076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinVerticalButton f217077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f217078c;
    public final FixedTabs d;

    public l(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, TwinVerticalButton twinVerticalButton, NavBarWithToolbar navBarWithToolbar, FixedTabs fixedTabs) {
        this.f217076a = controllerContainerCoordinatorLayout;
        this.f217077b = twinVerticalButton;
        this.f217078c = navBarWithToolbar;
        this.d = fixedTabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f217076a;
    }
}
