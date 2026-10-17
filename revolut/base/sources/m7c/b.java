package m7c;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f203379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f203380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f203381c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar) {
        this.f203379a = controllerContainerCoordinatorLayout;
        this.f203380b = footerTextView;
        this.f203381c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f203379a;
    }
}
