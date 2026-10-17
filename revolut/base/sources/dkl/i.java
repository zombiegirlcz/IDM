package dkl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f115654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f115655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f115656c;
    public final LargeActionButton d;

    public i(LargeActionButton largeActionButton, LargeActionButton largeActionButton2, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f115654a = controllerContainerCoordinatorLayout;
        this.f115655b = navBarWithToolbar;
        this.f115656c = largeActionButton;
        this.d = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f115654a;
    }
}
