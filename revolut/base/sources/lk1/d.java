package lk1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f196186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f196187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f196188c;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithToolbar navBarWithToolbar, WebView webView) {
        this.f196186a = controllerContainerConstraintLayout;
        this.f196187b = navBarWithToolbar;
        this.f196188c = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f196186a;
    }
}
