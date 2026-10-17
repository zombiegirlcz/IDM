package amc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f6304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f6305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f6306c;
    public final Tabs d;
    public final ViewPager2 e;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs, ViewPager2 viewPager2) {
        this.f6304a = controllerContainerCoordinatorLayout;
        this.f6305b = largeActionButton;
        this.f6306c = navBarWithToolbar;
        this.d = tabs;
        this.e = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f6304a;
    }
}
