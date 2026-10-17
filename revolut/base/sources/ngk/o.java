package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f215222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f215223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionFooterView f215224c;
    public final NavBarBottomSheet d;

    public o(ControllerContainerConstraintLayout controllerContainerConstraintLayout, AnimatedBackgroundView animatedBackgroundView, ActionFooterView actionFooterView, NavBarBottomSheet navBarBottomSheet) {
        this.f215222a = controllerContainerConstraintLayout;
        this.f215223b = animatedBackgroundView;
        this.f215224c = actionFooterView;
        this.d = navBarBottomSheet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215222a;
    }
}
