package u8k;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f278254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f278255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f278256c;
    public final LargeActionButton d;

    public b(FooterTextView footerTextView, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f278254a = controllerContainerCoordinatorLayout;
        this.f278255b = footerTextView;
        this.f278256c = navBarWithToolbar;
        this.d = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f278254a;
    }
}
