package m12;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f201209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleActionButtonsBarView f201210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f201211c;

    public h(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CircleActionButtonsBarView circleActionButtonsBarView, NavBarWithAvatar navBarWithAvatar) {
        this.f201209a = controllerContainerCoordinatorLayout;
        this.f201210b = circleActionButtonsBarView;
        this.f201211c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f201209a;
    }
}
