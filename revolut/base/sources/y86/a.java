package y86;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f311630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f311631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f311632c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, WebView webView) {
        this.f311630a = controllerContainerCoordinatorLayout;
        this.f311631b = basicNavBar;
        this.f311632c = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f311630a;
    }
}
