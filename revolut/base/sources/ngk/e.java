package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f215192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f215193c;
    public final LargeActionButton d;
    public final LargeActionButton e;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, NavBarWithToolbar navBarWithToolbar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f215191a = controllerContainerCoordinatorLayout;
        this.f215192b = animatedBackgroundView;
        this.f215193c = navBarWithToolbar;
        this.d = largeActionButton;
        this.e = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215191a;
    }
}
