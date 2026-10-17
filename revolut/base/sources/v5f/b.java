package v5f;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f286209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f286210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f286211c;
    public final Tabs d;
    public final ViewPager2 e;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs, ViewPager2 viewPager2) {
        this.f286209a = controllerContainerCoordinatorLayout;
        this.f286210b = largeActionButton;
        this.f286211c = navBarWithToolbar;
        this.d = tabs;
        this.e = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f286209a;
    }
}
