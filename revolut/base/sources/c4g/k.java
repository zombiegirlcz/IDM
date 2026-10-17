package c4g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f21276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f21277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f21278c;

    public k(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f21276a = controllerContainerCoordinatorLayout;
        this.f21277b = largeActionButton;
        this.f21278c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f21276a;
    }
}
