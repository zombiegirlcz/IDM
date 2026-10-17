package cye;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreen;
import dz7.k;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import vkm.j2;
import zhm.h0;
import zjh.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends WebViewClient {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f110089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f110090b;

    public c(j callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f110089a = callback;
        ArrayList arrayList = pgi.a.f235952a;
        Intrinsics.checkNotNullParameter(this, "listener");
        pgi.a.f235952a.add(new WeakReference(this));
    }

    public static void b(int i, String str, String str2) {
        Uri uri2 = Uri.parse(str);
        b bVar = new b("WebPage error: url: " + new Uri.Builder().scheme(uri2.getScheme()).authority(uri2.getAuthority()).path(uri2.getPath()) + " errorCode: " + i + " description: " + str2);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, bVar, h0Var);
    }

    public final boolean a(String str) {
        if (str != null) {
            if (a0.H(str, "intent:", false)) {
                try {
                    Intent uri2 = Intent.parseUri(str, 1);
                    if (uri2 != null) {
                        return c(uri2, "intent");
                    }
                } catch (URISyntaxException e) {
                    this.f110089a.u("intent");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return false;
                }
            } else {
                if (a0.H(str, "bankid:", false)) {
                    Uri uri3 = Uri.parse(str);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setData(uri3);
                    return c(intent, "bankid");
                }
                if (!a0.H(str, "http:", false) && !a0.H(str, "https:", false)) {
                    Uri uri4 = Uri.parse(str);
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.VIEW");
                    intent2.addCategory("android.intent.category.BROWSABLE");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(uri4);
                    String scheme = uri4.getScheme();
                    if (scheme == null) {
                        scheme = "";
                    }
                    return c(intent2, scheme);
                }
            }
        }
        return false;
    }

    public final boolean c(Intent intent, String str) {
        boolean z;
        j jVar = this.f110089a;
        try {
            jVar.getClass();
            Intrinsics.checkNotNullParameter(intent, "intent");
            ((ThreeDsScreen) jVar.f322839a).m2().startActivity(intent);
            z = true;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e, h0Var);
            z = false;
        }
        jVar.u(str);
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView view, String url2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        super.onLoadResource(view, url2);
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, null, j6.a.q("onLoadResource url: ", url2), null, null, 16);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(url2, "url");
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, null, j6.a.q("3DS_finish: ", url2), null, null, 16);
        j jVar = this.f110089a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar = (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) ((ThreeDsScreen) jVar.f322839a).R2();
        y yVar = cVar.f90966w;
        Intrinsics.checkNotNullParameter(url2, "url");
        cVar.f90964s.k(Unit.f186387a);
        List list = cVar.f90963r;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (a0.H(url2, (String) it8.next(), false)) {
                cVar.H2(yVar, new k(4));
                if (((dze.c) ((j2) yVar.f22677a).getValue()).f121325b) {
                    return;
                }
                cVar.f90965t.setValue(dze.k.RESUME);
                return;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String url2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url2, "url");
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, null, j6.a.q("3DS_start: ", url2), null, null, 16);
        this.f110090b = url2;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        String str = "onReceivedError: " + error.getErrorCode() + " " + ((Object) error.getDescription());
        this.f110089a.getClass();
        j.t(str);
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        b(error.getErrorCode(), string, error.getDescription().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        String failingUrl = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(failingUrl, "toString(...)");
        if (Intrinsics.f(this.f110090b, failingUrl)) {
            int statusCode = errorResponse.getStatusCode();
            String reasonPhrase = errorResponse.getReasonPhrase();
            StringBuilder sbK = v0.a.k(statusCode, "WebView HTTP error - url: ", failingUrl, " errorCode: ", " description: ");
            sbK.append(reasonPhrase);
            b bVar = new b(sbK.toString());
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            rd0.c cVar = rd0.c.ERROR;
            d.a(cVar, null, null, bVar, h0Var);
            int statusCode2 = errorResponse.getStatusCode();
            j jVar = this.f110089a;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            d.a(cVar, null, null, new Exception(j6.a.m(statusCode2, "HTTP error ", ": ", failingUrl)), h0Var);
            com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar2 = (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) ((ThreeDsScreen) jVar.f322839a).R2();
            cVar2.getClass();
            cVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.error_top_up_generic_title, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f110089a.getClass();
        j.t("SSL Error: " + error);
        String url2 = error.getUrl();
        Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
        b(error.getPrimaryError(), url2, "Ssl error");
        handler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!a(str)) {
            return null;
        }
        Charset charset = Charsets.UTF_8;
        String strDisplayName = charset.displayName();
        byte[] bytes = "".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse("text/html", strDisplayName, new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url2;
        String string = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString();
        if (string != null && a0.H(string, "https:", false) && webResourceRequest.hasGesture()) {
            Uri uri2 = Uri.parse(string);
            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(1024);
            intent.setData(uri2);
            j jVar = this.f110089a;
            try {
                jVar.getClass();
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((ThreeDsScreen) jVar.f322839a).m2().startActivity(intent);
                jVar.u("https");
                return true;
            } catch (Exception e) {
                if (e instanceof ActivityNotFoundException) {
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.b(rd0.c.DEBUG, null, a10.b.p(intent.getData(), "No non-browser app found for https applink: "), null, null, 16);
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                    d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
            }
        }
        return a(string);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(str);
    }
}
