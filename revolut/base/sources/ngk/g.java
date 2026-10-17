package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f215198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundView f215199c;
    public final NavBarWithToolbar d;

    public g(AnimatedBackgroundView animatedBackgroundView, ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f215197a = controllerContainerCoordinatorLayout;
        this.f215198b = actionFooterView;
        this.f215199c = animatedBackgroundView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215197a;
    }
}
