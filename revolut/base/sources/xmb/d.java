package xmb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f307103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f307104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f307105c;
    public final ScreenContentRecyclerView d;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CollapsingActionButton collapsingActionButton, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f307103a = controllerContainerCoordinatorLayout;
        this.f307104b = collapsingActionButton;
        this.f307105c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307103a;
    }
}
