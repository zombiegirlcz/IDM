package tpg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f273372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f273373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f273374c;
    public final FullScreenStateView d;
    public final ProgressSwitcher e;
    public final WebView f;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, FullScreenStateView fullScreenStateView, ProgressSwitcher progressSwitcher, WebView webView) {
        this.f273372a = controllerContainerCoordinatorLayout;
        this.f273373b = largeActionButton;
        this.f273374c = navBarWithToolbar;
        this.d = fullScreenStateView;
        this.e = progressSwitcher;
        this.f = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f273372a;
    }
}
