package m12;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f201190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f201191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f201192c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, TwinVerticalButton twinVerticalButton) {
        this.f201190a = controllerContainerCoordinatorLayout;
        this.f201191b = basicNavBar;
        this.f201192c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f201190a;
    }
}
