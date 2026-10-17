package j2b;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f170800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f170801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f170802c;

    public c(ActionFooterView actionFooterView, NavBarWithAvatar navBarWithAvatar, ControllerContainerConstraintLayout controllerContainerConstraintLayout) {
        this.f170800a = controllerContainerConstraintLayout;
        this.f170801b = actionFooterView;
        this.f170802c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f170800a;
    }
}
