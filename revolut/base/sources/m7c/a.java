package m7c;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f203376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f203377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionFooterView f203378c;

    public a(ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f203376a = controllerContainerCoordinatorLayout;
        this.f203377b = navBarWithToolbar;
        this.f203378c = actionFooterView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f203376a;
    }
}
