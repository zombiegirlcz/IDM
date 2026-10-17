package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.productintro.view.FullscreenProductIntroView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f215201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FullscreenProductIntroView f215202c;
    public final AccountSelectionNavBarContentView d;
    public final NavBarWithBigTile e;
    public final NavBarWithContainer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarWithToolbar f215203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScreenContentRecyclerView f215204h;
    public final ControllerContainerCoordinatorLayout i;

    public h(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, FullscreenProductIntroView fullscreenProductIntroView, AccountSelectionNavBarContentView accountSelectionNavBarContentView, NavBarWithBigTile navBarWithBigTile, NavBarWithContainer navBarWithContainer, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2) {
        this.f215200a = controllerContainerCoordinatorLayout;
        this.f215201b = animatedBackgroundView;
        this.f215202c = fullscreenProductIntroView;
        this.d = accountSelectionNavBarContentView;
        this.e = navBarWithBigTile;
        this.f = navBarWithContainer;
        this.f215203g = navBarWithToolbar;
        this.f215204h = screenContentRecyclerView;
        this.i = controllerContainerCoordinatorLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215200a;
    }
}
