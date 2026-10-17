package jw5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f178931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f178932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f178933c;

    public c(ActionFooterView actionFooterView, NavBarWithAvatar navBarWithAvatar, ControllerContainerConstraintLayout controllerContainerConstraintLayout) {
        this.f178931a = controllerContainerConstraintLayout;
        this.f178932b = actionFooterView;
        this.f178933c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f178931a;
    }
}
