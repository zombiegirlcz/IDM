package ep9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f128124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f128125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f128126c;
    public final LargeActionButton d;
    public final LargeActionButton e;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f128124a = controllerContainerCoordinatorLayout;
        this.f128125b = footerTextView;
        this.f128126c = navBarWithToolbar;
        this.d = largeActionButton;
        this.e = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f128124a;
    }
}
