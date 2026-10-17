package py8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f240698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f240699b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, WebView webView) {
        this.f240698a = controllerContainerFrameLayout;
        this.f240699b = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f240698a;
    }
}
