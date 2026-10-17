package iu5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f168516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tabs f168517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f168518c;
    public final ScreenContentRecyclerView d;
    public final SlidingFromTopViewContainer e;

    public a(Tabs tabs, NavBarWithToolbar navBarWithToolbar, SlidingFromTopViewContainer slidingFromTopViewContainer, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f168516a = controllerContainerCoordinatorLayout;
        this.f168517b = tabs;
        this.f168518c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = slidingFromTopViewContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f168516a;
    }
}
