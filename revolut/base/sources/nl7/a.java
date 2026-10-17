package nl7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f217045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinVerticalButton f217046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f217047c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, TwinVerticalButton twinVerticalButton, NavBarWithToolbar navBarWithToolbar) {
        this.f217045a = controllerContainerConstraintLayout;
        this.f217046b = twinVerticalButton;
        this.f217047c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f217045a;
    }
}
