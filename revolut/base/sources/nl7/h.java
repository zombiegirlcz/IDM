package nl7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f217065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f217066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f217067c;

    public h(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f217065a = controllerContainerCoordinatorLayout;
        this.f217066b = largeActionButton;
        this.f217067c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f217065a;
    }
}
