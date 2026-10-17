package yc4;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, aw3.p.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenKontomatikSignInKompotBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenKontomatikSignIn_buttonRetry;
        if (((LargeActionButton) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.screenKontomatikSignIn_kontomatikSignInView;
            WebView webView = (WebView) ViewBindings.findChildViewById(p0, i);
            if (webView != null) {
                i = R$id.screenKontomatikSignIn_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.screenKontomatikSignIn_nestedScrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(p0, i);
                    if (nestedScrollView != null) {
                        i = R$id.screenKontomatikSignIn_progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(p0, i);
                        if (progressBar != null) {
                            i = R$id.screenKontomatikSignIn_retryContainer;
                            if (((LinearLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                                return new aw3.p((ControllerContainerCoordinatorLayout) p0, webView, navBarWithToolbar, nestedScrollView, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
