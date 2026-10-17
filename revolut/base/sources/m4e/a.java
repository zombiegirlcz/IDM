package m4e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f202722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinHorizontalButton f202723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f202724c;
    public final Tabs d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, TwinHorizontalButton twinHorizontalButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs) {
        this.f202722a = controllerContainerCoordinatorLayout;
        this.f202723b = twinHorizontalButton;
        this.f202724c = navBarWithToolbar;
        this.d = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f202722a;
    }
}
