package w0g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f293737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f293738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f293739c;

    public s(LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f293737a = controllerContainerCoordinatorLayout;
        this.f293738b = largeActionButton;
        this.f293739c = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293737a;
    }
}
