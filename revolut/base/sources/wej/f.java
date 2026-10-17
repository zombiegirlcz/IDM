package wej;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f296811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleActionButtonsBarView f296812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundView f296813c;
    public final BasicNavBar d;
    public final ProfileCardView e;

    public f(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CircleActionButtonsBarView circleActionButtonsBarView, AnimatedBackgroundView animatedBackgroundView, BasicNavBar basicNavBar, ProfileCardView profileCardView) {
        this.f296811a = controllerContainerConstraintLayout;
        this.f296812b = circleActionButtonsBarView;
        this.f296813c = animatedBackgroundView;
        this.d = basicNavBar;
        this.e = profileCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f296811a;
    }
}
