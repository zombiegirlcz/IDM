package n13;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f211222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f211223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs f211224c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, Tabs tabs) {
        this.f211222a = controllerContainerCoordinatorLayout;
        this.f211223b = navBarWithToolbar;
        this.f211224c = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f211222a;
    }
}
