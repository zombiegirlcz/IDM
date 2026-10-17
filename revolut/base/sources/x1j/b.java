package x1j;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f302450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f302451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f302452c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar) {
        this.f302450a = controllerContainerCoordinatorLayout;
        this.f302451b = footerTextView;
        this.f302452c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f302450a;
    }
}
