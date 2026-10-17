package jw5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f178928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ButtonsActionsView f178929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f178930c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ButtonsActionsView buttonsActionsView, NavBarWithToolbar navBarWithToolbar) {
        this.f178928a = controllerContainerCoordinatorLayout;
        this.f178929b = buttonsActionsView;
        this.f178930c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f178928a;
    }
}
