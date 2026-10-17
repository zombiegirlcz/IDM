package iu7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f168530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f168531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FixedTabs f168532c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, FixedTabs fixedTabs) {
        this.f168530a = controllerContainerCoordinatorLayout;
        this.f168531b = navBarWithToolbar;
        this.f168532c = fixedTabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f168530a;
    }
}
