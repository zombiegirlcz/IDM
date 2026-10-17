package jqg;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.vaults.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, tpg.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/vaults/impl/databinding/ScreenVaultTermsViewerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.goToButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.termsViewerError;
                FullScreenStateView fullScreenStateView = (FullScreenStateView) ViewBindings.findChildViewById(p0, i);
                if (fullScreenStateView != null) {
                    i = R$id.termsViewerProgress;
                    ProgressSwitcher progressSwitcher = (ProgressSwitcher) ViewBindings.findChildViewById(p0, i);
                    if (progressSwitcher != null) {
                        i = R$id.termsViewerWebView;
                        WebView webView = (WebView) ViewBindings.findChildViewById(p0, i);
                        if (webView != null) {
                            return new tpg.d((ControllerContainerCoordinatorLayout) p0, largeActionButton, navBarWithToolbar, fullScreenStateView, progressSwitcher, webView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
