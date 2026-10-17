package wxj;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f300997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarVaults f300998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f300999c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarVaults navBarVaults, TwinVerticalButton twinVerticalButton) {
        this.f300997a = controllerContainerCoordinatorLayout;
        this.f300998b = navBarVaults;
        this.f300999c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f300997a;
    }
}
