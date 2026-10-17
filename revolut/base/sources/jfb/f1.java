package jfb;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebResourceException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f1 extends WebViewClient {

    @NotNull
    public static final e1 Companion = new e1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f173805h = zhm.v.k("revolut.codes", "revolut.com");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f173806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f173807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f173808c;
    public Function1 d;
    public Function0 e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f173809g;

    public f1(x0 reverywhereWebClientApi) {
        Intrinsics.checkNotNullParameter(reverywhereWebClientApi, "reverywhereWebClientApi");
        this.f173806a = reverywhereWebClientApi;
        this.f173807b = new ja3.b(21);
        this.f173808c = new ja3.b(22);
        this.d = new je5.n(18);
        this.e = new ja3.b(23);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f173808c.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f173809g = false;
        this.f173807b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame() || this.f173809g) {
            return;
        }
        this.e.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.f173809g = true;
        this.d.invoke(new ReverywhereWebResourceException(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null, webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String scheme = request.getUrl().getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        boolean zF = Intrinsics.f(lowerCase, "http");
        x0 x0Var = this.f173806a;
        if (!zF && !Intrinsics.f(lowerCase, "https")) {
            x0Var.c3(string);
            return true;
        }
        Uri uri2 = Uri.parse(string);
        List list = f173805h;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                String str = (String) it8.next();
                String host = uri2.getHost();
                if (host != null && kotlin.text.a0.y(host, str, false)) {
                    l lVarE3 = x0Var.e3(string);
                    if (lVarE3 != null) {
                        x0Var.d3(lVarE3);
                        return true;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str2 = this.f;
                    if (str2 != null) {
                        linkedHashMap.put("X-Reverywhere-Authorization", str2);
                    }
                    view.loadUrl(string, linkedHashMap);
                }
            }
        }
        return true;
    }
}
