package rfg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f253796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f253797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterActionButtonView f253798c;

    public i(FooterActionButtonView footerActionButtonView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f253796a = controllerContainerCoordinatorLayout;
        this.f253797b = navBarWithToolbar;
        this.f253798c = footerActionButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f253796a;
    }
}
