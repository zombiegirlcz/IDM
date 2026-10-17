package m12;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.CenteredFixedTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f201206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f201207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CenteredFixedTabsView f201208c;

    public g(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithToolbar navBarWithToolbar, CenteredFixedTabsView centeredFixedTabsView) {
        this.f201206a = controllerContainerConstraintLayout;
        this.f201207b = navBarWithToolbar;
        this.f201208c = centeredFixedTabsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f201206a;
    }
}
