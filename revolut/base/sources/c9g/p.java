package c9g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f22417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithBigTile f22418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f22419c;

    public p(LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f22417a = controllerContainerCoordinatorLayout;
        this.f22418b = navBarWithBigTile;
        this.f22419c = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f22417a;
    }
}
