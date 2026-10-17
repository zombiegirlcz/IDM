package wxb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f300841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView f300842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f300843c;
    public final AsyncDiffRecyclerView d;

    public n(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionsView actionsView, BasicNavBar basicNavBar, AsyncDiffRecyclerView asyncDiffRecyclerView) {
        this.f300841a = controllerContainerCoordinatorLayout;
        this.f300842b = actionsView;
        this.f300843c = basicNavBar;
        this.d = asyncDiffRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f300841a;
    }
}
