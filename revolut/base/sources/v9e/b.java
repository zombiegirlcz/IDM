package v9e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f287022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f287023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterActionButtonView f287024c;

    public b(FooterActionButtonView footerActionButtonView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f287022a = controllerContainerCoordinatorLayout;
        this.f287023b = navBarWithToolbar;
        this.f287024c = footerActionButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f287022a;
    }
}
