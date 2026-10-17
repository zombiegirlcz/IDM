package pgi;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f235960a = g.IDLE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f235961b;

    public f(WebViewActivity webViewActivity) {
        this.f235961b = webViewActivity;
    }

    public final boolean a(String str) {
        int i = e.f235959a[this.f235960a.ordinal()];
        WebViewActivity webViewActivity = this.f235961b;
        if (i == 1) {
            b(g.PROCESSING);
            i iVar = (i) webViewActivity.f218652a0;
            if (iVar == null) {
                return false;
            }
            iVar.u(str);
            return true;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (webViewActivity.D0) {
            b(g.PROCESSING);
            i iVar2 = (i) webViewActivity.f218652a0;
            if (iVar2 != null) {
                iVar2.u(str);
                return true;
            }
        }
        return false;
    }

    public final void b(g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z = value != g.IDLE;
        WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
        this.f235961b.g1(z);
        this.f235960a = value;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewActivity webViewActivity = this.f235961b;
        i iVar = (i) webViewActivity.f218652a0;
        if (iVar != null) {
            WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = webViewActivity.B0;
            if (webViewContract$WebViewConfiguration == null) {
                Intrinsics.r("config");
                throw null;
            }
            iVar.B(webViewContract$WebViewConfiguration.f98181m, str, webViewContract$WebViewConfiguration.f98182n, webViewContract$WebViewConfiguration.o);
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        b(g.IDLE);
        WebViewActivity webViewActivity = this.f235961b;
        webViewActivity.K0 = true;
        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = webViewActivity.B0;
        if (webViewContract$WebViewConfiguration == null) {
            Intrinsics.r("config");
            throw null;
        }
        if (webViewContract$WebViewConfiguration.k) {
            com.revolut.core.ui_kit.views.WebView webView = webViewActivity.y0;
            if (webView == null) {
                Intrinsics.r("webView");
                throw null;
            }
            WebViewActivity.Z0(webViewActivity, webView.getScrollY() < ((Number) webViewActivity.G0.getValue()).intValue(), false);
            String str = webViewActivity.J0;
            if (str != null) {
                webViewActivity.d1().setTitle(str);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        return a(url2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(string);
    }
}
