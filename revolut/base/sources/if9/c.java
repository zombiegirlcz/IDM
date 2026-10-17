package if9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f160972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f160973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f160974c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithAvatar navBarWithAvatar) {
        this.f160972a = controllerContainerCoordinatorLayout;
        this.f160973b = actionFooterView;
        this.f160974c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f160972a;
    }
}
