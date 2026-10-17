package wxb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f300838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f300839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f300840c;
    public final AsyncDiffRecyclerView d;

    public m(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, AsyncDiffRecyclerView asyncDiffRecyclerView) {
        this.f300838a = controllerContainerCoordinatorLayout;
        this.f300839b = actionFooterView;
        this.f300840c = navBarWithToolbar;
        this.d = asyncDiffRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f300838a;
    }
}
