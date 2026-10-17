package jal;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f172526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerFrameLayout f172527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f172528c;
    public final TwinVerticalButton d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ControllerContainerFrameLayout controllerContainerFrameLayout, NavBarWithToolbar navBarWithToolbar, TwinVerticalButton twinVerticalButton) {
        this.f172526a = controllerContainerCoordinatorLayout;
        this.f172527b = controllerContainerFrameLayout;
        this.f172528c = navBarWithToolbar;
        this.d = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f172526a;
    }
}
