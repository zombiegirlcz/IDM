package j2b;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f170797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountSelectionNavBarContentView f170798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f170799c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AccountSelectionNavBarContentView accountSelectionNavBarContentView, NavBarWithContainer navBarWithContainer) {
        this.f170797a = controllerContainerCoordinatorLayout;
        this.f170798b = accountSelectionNavBarContentView;
        this.f170799c = navBarWithContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f170797a;
    }
}
