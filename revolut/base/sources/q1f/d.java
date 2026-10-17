package q1f;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f241438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f241439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f241440c;

    public d(LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f241438a = controllerContainerCoordinatorLayout;
        this.f241439b = largeActionButton;
        this.f241440c = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f241438a;
    }
}
