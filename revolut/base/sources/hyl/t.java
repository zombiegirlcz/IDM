package hyl;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends WebViewClient {

    @NotNull
    private static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iyl.a f156930a;

    public t(iyl.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f156930a = callback;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onPageFinished(view, str);
        this.f156930a.invoke(q.f156929a);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.f156930a.invoke(p.f156928a);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url2 = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        return (!Intrinsics.f(url2 != null ? url2.getScheme() : null, "file") || Intrinsics.f(url2.getLastPathSegment(), "globe.html")) ? super.shouldInterceptRequest(webView, webResourceRequest) : new WebResourceResponse("text/html", "UTF-8", null);
    }
}
