package kgd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f183949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f183950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager2 f183951c;
    public final DraggableTabsView d;

    public a(ViewPager2 viewPager2, DraggableTabsView draggableTabsView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f183949a = controllerContainerCoordinatorLayout;
        this.f183950b = navBarWithToolbar;
        this.f183951c = viewPager2;
        this.d = draggableTabsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f183949a;
    }
}
