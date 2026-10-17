package a43;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f1187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterActionButtonView f1188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f1189c;
    public final ScreenContentRecyclerView d;
    public final Tabs e;
    public final SlidingFromTopViewContainer f;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterActionButtonView footerActionButtonView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, Tabs tabs, SlidingFromTopViewContainer slidingFromTopViewContainer) {
        this.f1187a = controllerContainerCoordinatorLayout;
        this.f1188b = footerActionButtonView;
        this.f1189c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = tabs;
        this.f = slidingFromTopViewContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1187a;
    }
}
