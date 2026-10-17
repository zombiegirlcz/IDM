package aw3;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f10713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f10714c;
    public final NestedScrollView d;
    public final ProgressBar e;

    public p(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, WebView webView, NavBarWithToolbar navBarWithToolbar, NestedScrollView nestedScrollView, ProgressBar progressBar) {
        this.f10712a = controllerContainerCoordinatorLayout;
        this.f10713b = webView;
        this.f10714c = navBarWithToolbar;
        this.d = nestedScrollView;
        this.e = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10712a;
    }
}
