package o8a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f222975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f222976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f222977c;
    public final LargeActionButton d;

    public e(LargeActionButton largeActionButton, LargeActionButton largeActionButton2, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f222975a = controllerContainerCoordinatorLayout;
        this.f222976b = navBarWithToolbar;
        this.f222977c = largeActionButton;
        this.d = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f222975a;
    }
}
