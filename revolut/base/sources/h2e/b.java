package h2e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f148797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingBottomBarView f148798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f148799c;
    public final ViewPager2 d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FloatingBottomBarView floatingBottomBarView, NavBarWithToolbar navBarWithToolbar, ViewPager2 viewPager2) {
        this.f148797a = controllerContainerCoordinatorLayout;
        this.f148798b = floatingBottomBarView;
        this.f148799c = navBarWithToolbar;
        this.d = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f148797a;
    }
}
