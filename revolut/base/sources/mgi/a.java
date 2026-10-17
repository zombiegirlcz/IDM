package mgi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f205288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f205289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f205290c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, WebView webView) {
        this.f205288a = controllerContainerCoordinatorLayout;
        this.f205289b = basicNavBar;
        this.f205290c = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f205288a;
    }
}
