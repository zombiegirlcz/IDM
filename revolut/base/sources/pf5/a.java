package pf5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f235469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f235470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f235471c;
    public final Tabs d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs) {
        this.f235469a = controllerContainerCoordinatorLayout;
        this.f235470b = largeActionButton;
        this.f235471c = navBarWithToolbar;
        this.d = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f235469a;
    }
}
