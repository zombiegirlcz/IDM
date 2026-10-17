package fl1;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.alipay.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, lk1.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/alipay/impl/databinding/ScreenAlipayWebContainerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.webContainer_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.webContainer_webView;
            WebView webView = (WebView) ViewBindings.findChildViewById(p0, i);
            if (webView != null) {
                return new lk1.d((ControllerContainerConstraintLayout) p0, navBarWithToolbar, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
