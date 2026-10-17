package f72;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f132554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f132555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f132556c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, TwinVerticalButton twinVerticalButton) {
        this.f132554a = controllerContainerCoordinatorLayout;
        this.f132555b = basicNavBar;
        this.f132556c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f132554a;
    }
}
