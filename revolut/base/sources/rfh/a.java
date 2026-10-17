package rfh;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f253824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinHorizontalButton f253825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f253826c;
    public final ControllerContainerCoordinatorLayout d;
    public final NavBarWithToolbar e;
    public final ScreenContentRecyclerView f;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, TwinHorizontalButton twinHorizontalButton, NavBarWithBigTile navBarWithBigTile, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f253824a = controllerContainerCoordinatorLayout;
        this.f253825b = twinHorizontalButton;
        this.f253826c = navBarWithBigTile;
        this.d = controllerContainerCoordinatorLayout2;
        this.e = navBarWithToolbar;
        this.f = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f253824a;
    }
}
