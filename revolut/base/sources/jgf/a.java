package jgf;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tabs f174034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f174035c;
    public final SlidingFromTopViewContainer d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, Tabs tabs, NavBarWithToolbar navBarWithToolbar, SlidingFromTopViewContainer slidingFromTopViewContainer) {
        this.f174033a = controllerContainerCoordinatorLayout;
        this.f174034b = tabs;
        this.f174035c = navBarWithToolbar;
        this.d = slidingFromTopViewContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174033a;
    }
}
