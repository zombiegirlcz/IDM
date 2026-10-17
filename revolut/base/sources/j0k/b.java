package j0k;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f170058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f170059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs f170060c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, Tabs tabs) {
        this.f170058a = controllerContainerCoordinatorLayout;
        this.f170059b = navBarWithToolbar;
        this.f170060c = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f170058a;
    }
}
