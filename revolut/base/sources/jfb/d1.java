package jfb;

import android.content.Intent;
import android.os.Message;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d1 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f173796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueCallback f173797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f173798c;

    public d1(x0 reverywhereWebClientApi) {
        Intrinsics.checkNotNullParameter(reverywhereWebClientApi, "reverywhereWebClientApi");
        this.f173796a = reverywhereWebClientApi;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView view, boolean z, boolean z3, Message resultMsg) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
        WebView webView = new WebView(view.getContext());
        webView.setWebViewClient(new c9i.b(this, 3));
        Object obj2 = resultMsg.obj;
        Intrinsics.i(obj2, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj2).setWebView(webView);
        resultMsg.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        b0 b0Var = this.f173798c;
        if (b0Var == null || fileChooserParams == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return true;
        }
        ValueCallback valueCallback2 = this.f173797b;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.f173797b = valueCallback;
        Intent intentCreateIntent = fileChooserParams.createIntent();
        Intrinsics.checkNotNullExpressionValue(intentCreateIntent, "createIntent(...)");
        b0Var.invoke(intentCreateIntent, 1001);
        return true;
    }
}
