package wxb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f300835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tabs f300836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f300837c;
    public final ScreenContentRecyclerView d;
    public final SlidingFromTopViewContainer e;

    public l(Tabs tabs, NavBarWithToolbar navBarWithToolbar, SlidingFromTopViewContainer slidingFromTopViewContainer, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f300835a = controllerContainerCoordinatorLayout;
        this.f300836b = tabs;
        this.f300837c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = slidingFromTopViewContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f300835a;
    }
}
