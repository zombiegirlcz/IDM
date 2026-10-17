package aw3;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f10709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f10710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f10711c;
    public final WebView d;

    public o(ControllerContainerLinearLayout controllerContainerLinearLayout, NavBarWithToolbar navBarWithToolbar, ProgressBar progressBar, WebView webView) {
        this.f10709a = controllerContainerLinearLayout;
        this.f10710b = navBarWithToolbar;
        this.f10711c = progressBar;
        this.d = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10709a;
    }
}
