package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.content.Context;
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
import cmc.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\b\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0017J.\u0010\u0018\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0017J&\u0010\u0018\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010 \u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001d\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerClient;", "Landroid/webkit/WebViewClient;", "context", "Landroid/content/Context;", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "errorPage", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerErrorPage;", "onPageStarted", "Lkotlin/Function1;", "", "", "onPageFinished", "<init>", "(Landroid/content/Context;Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerErrorPage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "view", "Landroid/webkit/WebView;", "url", "favicon", "Landroid/graphics/Bitmap;", "shouldOverrideUrlLoading", "", "request", "Landroid/webkit/WebResourceRequest;", "onReceivedError", "errorCode", "", "description", "failingUrl", "error", "Landroid/webkit/WebResourceError;", "showErrorPageForWebError", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onPageEvent", "action", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMWebContainerClient extends WebViewClient {

    @NotNull
    private final Context context;

    @NotNull
    private final APMPMWebContainerErrorPage errorPage;

    @NotNull
    private final Function1<String, Unit> onPageFinished;

    @NotNull
    private final Function1<String, Unit> onPageStarted;

    @NotNull
    private final APMPMContainerPresenter presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public APMPMWebContainerClient(@NotNull Context context, @NotNull APMPMContainerPresenter presenter, @NotNull APMPMWebContainerErrorPage errorPage, @NotNull Function1<? super String, Unit> onPageStarted, @NotNull Function1<? super String, Unit> onPageFinished) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(errorPage, "errorPage");
        Intrinsics.checkNotNullParameter(onPageStarted, "onPageStarted");
        Intrinsics.checkNotNullParameter(onPageFinished, "onPageFinished");
        this.context = context;
        this.presenter = presenter;
        this.errorPage = errorPage;
        this.onPageStarted = onPageStarted;
        this.onPageFinished = onPageFinished;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(String str) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(String str) {
        return Unit.f186387a;
    }

    private final boolean onPageEvent(String url2, String action) {
        return APMPMWebContainerRuntime.INSTANCE.dispatch$feature_alipay_plus_nonsdk_release(new APMPMContainerEvent(action, this.presenter, r0.j(new Pair("url", url2))));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showErrorPageForWebError(android.webkit.WebView r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            if (r4 == 0) goto L10
            boolean r1 = kotlin.text.d0.W(r4)
            if (r1 != 0) goto La
            goto Lb
        La:
            r4 = r0
        Lb:
            if (r4 != 0) goto Le
            goto L10
        Le:
            r0 = r4
            goto L16
        L10:
            if (r3 == 0) goto L16
            java.lang.String r0 = r3.getUrl()
        L16:
            com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerErrorPage$Companion r3 = com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerErrorPage.INSTANCE
            boolean r3 = r3.shouldHandleWebError(r0, r5)
            if (r3 == 0) goto L23
            com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerErrorPage r3 = r2.errorPage
            r3.showIfNeeded(r0, r5)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerClient.showErrorPageForWebError(android.webkit.WebView, java.lang.String, int):void");
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url2) {
        super.onPageFinished(view, url2);
        this.onPageFinished.invoke(url2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url2, Bitmap favicon) {
        super.onPageStarted(view, url2, favicon);
        this.errorPage.onPageStarted(url2);
        if (view != null) {
            APMPMWebContainerRuntime.INSTANCE.getJsBridge$feature_alipay_plus_nonsdk_release().loadJavascript$feature_alipay_plus_nonsdk_release(view);
        }
        this.onPageStarted.invoke(url2);
    }

    @Override // android.webkit.WebViewClient
    @d
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        showErrorPageForWebError(view, failingUrl, errorCode);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        if (request == null || !request.isForMainFrame()) {
            return;
        }
        int statusCode = errorResponse != null ? errorResponse.getStatusCode() : 0;
        Uri url2 = request.getUrl();
        String string = url2 != null ? url2.toString() : null;
        if (APMPMWebContainerErrorPage.INSTANCE.shouldHandleHTTPError(string, statusCode)) {
            this.errorPage.showIfNeeded(string, statusCode);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        if (handler != null) {
            handler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url2;
        String string = (request == null || (url2 = request.getUrl()) == null) ? null : url2.toString();
        if (string != null) {
            return shouldOverrideUrlLoading(view, string);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        if (request == null || !request.isForMainFrame()) {
            return;
        }
        int errorCode = error != null ? error.getErrorCode() : -1;
        Uri url2 = request.getUrl();
        showErrorPageForWebError(view, url2 != null ? url2.toString() : null, errorCode);
    }

    @Override // android.webkit.WebViewClient
    @d
    public boolean shouldOverrideUrlLoading(WebView view, String url2) {
        Object objA;
        if (view != null && url2 != null && !d0.W(url2) && !APMPMWebContainerErrorPage.INSTANCE.isDefaultErrorPageUrl(url2)) {
            if (onPageEvent(url2, "h5PageShouldLoadUrl")) {
                return true;
            }
            if (!a0.H(url2, "http://", false) && !a0.H(url2, "https://", false) && !a0.H(url2, "file:///android_asset/", false)) {
                try {
                    m.Companion companion = m.INSTANCE;
                    this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url2)));
                    objA = Boolean.TRUE;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                Object obj2 = Boolean.FALSE;
                if (objA instanceof n) {
                    objA = obj2;
                }
                return ((Boolean) objA).booleanValue();
            }
        }
        return false;
    }

    public /* synthetic */ APMPMWebContainerClient(Context context, APMPMContainerPresenter aPMPMContainerPresenter, APMPMWebContainerErrorPage aPMPMWebContainerErrorPage, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aPMPMContainerPresenter, aPMPMWebContainerErrorPage, (i & 8) != 0 ? new c(29) : function1, (i & 16) != 0 ? new a(0) : function12);
    }
}
