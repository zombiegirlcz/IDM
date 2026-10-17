package lpk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f199145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ButtonsActionsView f199146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f199147c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ButtonsActionsView buttonsActionsView, NavBarWithToolbar navBarWithToolbar) {
        this.f199145a = controllerContainerCoordinatorLayout;
        this.f199146b = buttonsActionsView;
        this.f199147c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f199145a;
    }
}
