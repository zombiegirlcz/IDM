package jfb;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.reverywhere.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.q implements Function1 {
    public static final e0 f = new e0();

    public e0() {
        super(1, afb.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/reverywhere/impl/databinding/ScreenWebAppBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.reverywhere_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.reverywhere_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.reverywhere_shimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(p0, i);
                if (shimmerFrameLayout != null) {
                    i = R$id.reverywhere_shimmerView;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                    if (frameLayout != null) {
                        i = R$id.reverywhere_webView;
                        WebView webView = (WebView) ViewBindings.findChildViewById(p0, i);
                        if (webView != null) {
                            return new afb.a((ControllerContainerConstraintLayout) p0, navBarWithToolbar, screenContentRecyclerView, shimmerFrameLayout, frameLayout, webView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
