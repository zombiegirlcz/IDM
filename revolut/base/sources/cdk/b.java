package cdk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f23269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f23270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundView f23271c;
    public final NavBarLargeCentred d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, AnimatedBackgroundView animatedBackgroundView, NavBarLargeCentred navBarLargeCentred) {
        this.f23269a = controllerContainerCoordinatorLayout;
        this.f23270b = actionFooterView;
        this.f23271c = animatedBackgroundView;
        this.d = navBarLargeCentred;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f23269a;
    }
}
