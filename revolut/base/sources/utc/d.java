package utc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f283082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarBottomSheet f283083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f283084c;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarBottomSheet navBarBottomSheet, TwinVerticalButton twinVerticalButton) {
        this.f283082a = controllerContainerCoordinatorLayout;
        this.f283083b = navBarBottomSheet;
        this.f283084c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f283082a;
    }
}
