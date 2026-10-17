package wej;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f296805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f296806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f296807c;
    public final NavBarWithBigTile d;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile) {
        this.f296805a = controllerContainerCoordinatorLayout;
        this.f296806b = animatedBackgroundView;
        this.f296807c = largeActionButton;
        this.d = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f296805a;
    }
}
