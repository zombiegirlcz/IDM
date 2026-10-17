package d09;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f110330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f110331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs f110332c;
    public final ViewPager2 d;

    public b(ViewPager2 viewPager2, Tabs tabs, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f110330a = controllerContainerCoordinatorLayout;
        this.f110331b = navBarWithToolbar;
        this.f110332c = tabs;
        this.d = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f110330a;
    }
}
