package uj2;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f280474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f280475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f280476c;
    public final ControllerContainerCoordinatorLayout d;
    public final NavBarWithBigTile e;
    public final ScreenContentRecyclerView f;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, FrameLayout frameLayout, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f280474a = controllerContainerCoordinatorLayout;
        this.f280475b = navBarWithToolbar;
        this.f280476c = frameLayout;
        this.d = controllerContainerCoordinatorLayout2;
        this.e = navBarWithBigTile;
        this.f = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f280474a;
    }
}
