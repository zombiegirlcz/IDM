package ma6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f203953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarVaults f203954b;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarVaults navBarVaults) {
        this.f203953a = controllerContainerCoordinatorLayout;
        this.f203954b = navBarVaults;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f203953a;
    }
}
