package lk1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.CenteredFixedTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f196181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f196182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CenteredFixedTabsView f196183c;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithToolbar navBarWithToolbar, CenteredFixedTabsView centeredFixedTabsView) {
        this.f196181a = controllerContainerConstraintLayout;
        this.f196182b = navBarWithToolbar;
        this.f196183c = centeredFixedTabsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f196181a;
    }
}
