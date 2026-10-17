package fwb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f138589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingBottomBarView f138590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f138591c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FloatingBottomBarView floatingBottomBarView, NavBarWithToolbar navBarWithToolbar) {
        this.f138589a = controllerContainerCoordinatorLayout;
        this.f138590b = floatingBottomBarView;
        this.f138591c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f138589a;
    }
}
