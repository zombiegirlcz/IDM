package n13;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f211231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f211232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f211233c;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CollapsingActionButton collapsingActionButton, NavBarWithToolbar navBarWithToolbar) {
        this.f211231a = controllerContainerCoordinatorLayout;
        this.f211232b = collapsingActionButton;
        this.f211233c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f211231a;
    }
}
