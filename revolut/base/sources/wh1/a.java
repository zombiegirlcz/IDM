package wh1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f297357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f297358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f297359c;
    public final ScreenContentRecyclerView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CollapsingActionButton collapsingActionButton, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f297357a = controllerContainerCoordinatorLayout;
        this.f297358b = collapsingActionButton;
        this.f297359c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f297357a;
    }
}
