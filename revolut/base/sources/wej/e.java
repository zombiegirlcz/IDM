package wej;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f296808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f296809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f296810c;
    public final NavBarWithToolbar d;
    public final Tabs e;
    public final ViewPager2 f;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, TwinVerticalButton twinVerticalButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs, ViewPager2 viewPager2) {
        this.f296808a = controllerContainerCoordinatorLayout;
        this.f296809b = animatedBackgroundView;
        this.f296810c = twinVerticalButton;
        this.d = navBarWithToolbar;
        this.e = tabs;
        this.f = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f296808a;
    }
}
