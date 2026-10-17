package utc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f283073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f283074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DraggableTabsView f283075c;
    public final ViewPager2 d;

    public a(ViewPager2 viewPager2, DraggableTabsView draggableTabsView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f283073a = controllerContainerCoordinatorLayout;
        this.f283074b = navBarWithToolbar;
        this.f283075c = draggableTabsView;
        this.d = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f283073a;
    }
}
