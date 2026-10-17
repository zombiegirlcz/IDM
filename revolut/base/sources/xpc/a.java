package xpc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f307927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f307928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f307929c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, WebView webView) {
        this.f307927a = controllerContainerCoordinatorLayout;
        this.f307928b = basicNavBar;
        this.f307929c = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307927a;
    }
}
