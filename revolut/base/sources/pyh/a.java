package pyh;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f240837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f240838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionFooterView f240839c;

    public a(ActionFooterView actionFooterView, NavBarWithAvatar navBarWithAvatar, ControllerContainerConstraintLayout controllerContainerConstraintLayout) {
        this.f240837a = controllerContainerConstraintLayout;
        this.f240838b = navBarWithAvatar;
        this.f240839c = actionFooterView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f240837a;
    }
}
