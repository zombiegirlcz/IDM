package w0g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f293752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f293753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsyncDiffRecyclerView f293754c;

    public y(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, AsyncDiffRecyclerView asyncDiffRecyclerView) {
        this.f293752a = controllerContainerCoordinatorLayout;
        this.f293753b = navBarWithToolbar;
        this.f293754c = asyncDiffRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293752a;
    }
}
