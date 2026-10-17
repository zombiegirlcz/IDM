package iu7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f168527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f168528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f168529c;
    public final NavBarWithBigTile d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile) {
        this.f168527a = controllerContainerCoordinatorLayout;
        this.f168528b = animatedBackgroundView;
        this.f168529c = largeActionButton;
        this.d = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f168527a;
    }
}
