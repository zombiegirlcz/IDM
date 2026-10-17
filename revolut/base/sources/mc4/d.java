package mc4;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends WebViewClient {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s78.d f204269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f204270b;

    public d(s78.d onPageFinished) {
        Intrinsics.checkNotNullParameter(onPageFinished, "onPageFinished");
        this.f204269a = onPageFinished;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView view, String url2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        super.onLoadResource(view, url2);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, null, j6.a.q("onLoadResource url: ", url2), null, null, 16);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url2) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f204269a.invoke(url2);
        super.onPageFinished(view, url2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String url2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, null, j6.a.q("onPageStarted: ", url2), null, null, 16);
        this.f204270b = url2;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        knm.b.o(error.getErrorCode(), string, error.getDescription().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (Intrinsics.f(this.f204270b, string)) {
            knm.b.p(string, errorResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        String url2 = error.getUrl();
        Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
        knm.b.o(error.getPrimaryError(), url2, "Ssl error");
        handler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        if (!d0.J(url2, "bnpparibas", false)) {
            return false;
        }
        view.loadUrl(url2);
        return true;
    }
}
