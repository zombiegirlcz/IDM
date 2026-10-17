package gr9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f145952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f145953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f145954c;

    public b(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f145952a = controllerContainerCoordinatorLayout;
        this.f145953b = largeActionButton;
        this.f145954c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f145952a;
    }
}
