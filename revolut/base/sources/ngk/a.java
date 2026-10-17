package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f215177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f215178c;
    public final FooterTextView d;
    public final View e;
    public final LegacyButtonContainerConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarWithToolbar f215179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewPager2 f215180h;
    public final Tabs i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LargeActionButton f215181j;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, LargeActionButton largeActionButton, FooterTextView footerTextView, View view, LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout, NavBarWithToolbar navBarWithToolbar, ViewPager2 viewPager2, Tabs tabs, LargeActionButton largeActionButton2) {
        this.f215176a = controllerContainerCoordinatorLayout;
        this.f215177b = animatedBackgroundView;
        this.f215178c = largeActionButton;
        this.d = footerTextView;
        this.e = view;
        this.f = legacyButtonContainerConstraintLayout;
        this.f215179g = navBarWithToolbar;
        this.f215180h = viewPager2;
        this.i = tabs;
        this.f215181j = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215176a;
    }
}
