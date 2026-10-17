package xmb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f307117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f307118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f307119c;
    public final DraggableTabsView d;
    public final ViewPager2 e;

    public i(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, DraggableTabsView draggableTabsView, ViewPager2 viewPager2) {
        this.f307117a = controllerContainerCoordinatorLayout;
        this.f307118b = actionFooterView;
        this.f307119c = navBarWithToolbar;
        this.d = draggableTabsView;
        this.e = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307117a;
    }
}
