package ma6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f203958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f203959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f203960c;
    public final NavBarWithToolbar d;

    public d(FooterTextView footerTextView, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f203958a = controllerContainerCoordinatorLayout;
        this.f203959b = largeActionButton;
        this.f203960c = footerTextView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f203958a;
    }
}
