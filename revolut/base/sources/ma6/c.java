package ma6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f203955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f203956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f203957c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithAvatar navBarWithAvatar) {
        this.f203955a = controllerContainerCoordinatorLayout;
        this.f203956b = actionFooterView;
        this.f203957c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f203955a;
    }
}
