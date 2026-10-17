package w0g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.browser.InAppBrowserView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f293693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InAppBrowserView f293694b;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, InAppBrowserView inAppBrowserView) {
        this.f293693a = controllerContainerFrameLayout;
        this.f293694b = inAppBrowserView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293693a;
    }
}
