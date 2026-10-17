package zvi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f325681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormsActionButton f325682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f325683c;
    public final NavBarWithToolbar d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FormsActionButton formsActionButton, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar) {
        this.f325681a = controllerContainerCoordinatorLayout;
        this.f325682b = formsActionButton;
        this.f325683c = largeActionButton;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f325681a;
    }
}
