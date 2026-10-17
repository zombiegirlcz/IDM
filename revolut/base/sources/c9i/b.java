package c9i;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cam.m;
import cam.t;
import com.revolut.core.ui_kit.browser.InAppBrowserView;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import ip0.yo0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.text.Charsets;
import kotlin.text.a0;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ood.k;
import qod.f;
import qod.g;
import skm.e0;
import ulm.u0;
import wo0.e;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22475b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f22474a = i;
        this.f22475b = obj2;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.f22474a) {
            case 1:
                t tVar = (t) this.f22475b;
                e0.C(tVar.d, null, null, new m(tVar, str, null, 3), 3);
                super.doUpdateVisitedHistory(webView, str, z);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        switch (this.f22474a) {
            case 1:
                t tVar = (t) this.f22475b;
                e0.C(tVar.d, null, null, new m(tVar, str, null, 4), 3);
                super.onPageCommitVisible(webView, str);
                break;
            default:
                super.onPageCommitVisible(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url2) {
        switch (this.f22474a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url2, "url");
                break;
            case 1:
                t tVar = (t) this.f22475b;
                e0.C(tVar.d, null, null, new m(tVar, url2, null, 5), 3);
                super.onPageFinished(view, url2);
                break;
            case 2:
                ((WebViewDelegate) this.f22475b).f53637c.onNext(yo0.LOADING_FINISHED);
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                super.onPageFinished(view, url2);
                break;
            case 4:
                super.onPageFinished(view, url2);
                ((mc4.a) this.f22475b).b(url2);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(view, "view");
                super.onPageFinished(view, url2);
                ((k) this.f22475b).invoke(g.f248165a);
                break;
            case 10:
                InAppBrowserView inAppBrowserView = (InAppBrowserView) this.f22475b;
                Intrinsics.checkNotNullParameter(view, "view");
                Date date = new Date();
                SslCertificate certificate = view.getCertificate();
                inAppBrowserView.getTopBarView().setUrlSecured(certificate != null && date.compareTo(certificate.getValidNotAfterDate()) < 0 && date.compareTo(certificate.getValidNotBeforeDate()) > 0);
                inAppBrowserView.getBottomBarView().setForwardButtonEnabled(inAppBrowserView.getWebView$ui_kit_components_release().canGoForward());
                if (url2 != null) {
                    inAppBrowserView.setToolbarUrl(url2);
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url2, Bitmap bitmap) {
        switch (this.f22474a) {
            case 1:
                t tVar = (t) this.f22475b;
                e0.C(tVar.d, null, null, new m(tVar, url2, null, 6), 3);
                super.onPageStarted(view, url2, bitmap);
                break;
            case 2:
                ((WebViewDelegate) this.f22475b).f53637c.onNext(yo0.LOADING_STARTED);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url2, "url");
                super.onPageStarted(view, url2, bitmap);
                ((InAppBrowserView) this.f22475b).f51521g.onNext(new e(view, url2, bitmap));
                break;
            default:
                super.onPageStarted(view, url2, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest request, WebResourceError error) {
        switch (this.f22474a) {
            case 2:
                super.onReceivedError(webView, request, error);
                ((WebViewDelegate) this.f22475b).e.onNext(Unit.f186387a);
                break;
            case 3:
            case 5:
            case 6:
            default:
                super.onReceivedError(webView, request, error);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(error, "error");
                String string = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                knm.b.o(error.getErrorCode(), string, error.getDescription().toString());
                ((mc4.a) this.f22475b).a();
                break;
            case 7:
                super.onReceivedError(webView, request, error);
                if (request != null && request.isForMainFrame()) {
                    ((k) this.f22475b).invoke(f.f248164a);
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest request, WebResourceResponse errorResponse) {
        switch (this.f22474a) {
            case 2:
                super.onReceivedHttpError(webView, request, errorResponse);
                ((WebViewDelegate) this.f22475b).e.onNext(Unit.f186387a);
                break;
            case 3:
            default:
                super.onReceivedHttpError(webView, request, errorResponse);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                String string = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                knm.b.p(string, errorResponse);
                ((mc4.a) this.f22475b).a();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError error) {
        switch (this.f22474a) {
            case 2:
                super.onReceivedSslError(webView, handler, error);
                ((WebViewDelegate) this.f22475b).e.onNext(Unit.f186387a);
                break;
            case 3:
            default:
                super.onReceivedSslError(webView, handler, error);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(error, "error");
                String url2 = error.getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                knm.b.o(error.getPrimaryError(), url2, "Ssl error");
                ((mc4.a) this.f22475b).a();
                handler.cancel();
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Response responseG;
        ByteArrayInputStream byteArrayInputStream;
        String strD;
        StringBuilder sb6;
        Uri url2;
        switch (this.f22474a) {
            case 1:
                String str = "</body>";
                t tVar = (t) this.f22475b;
                ArrayList arrayList = tVar.f22698g;
                if (arrayList.size() != 0 && webResourceRequest != null) {
                    String method = webResourceRequest.getMethod();
                    Intrinsics.checkNotNullExpressionValue(method, "request.method");
                    String upperCase = method.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (Intrinsics.f(upperCase, "GET")) {
                        String strI = v0.a.i(new StringBuilder("<script>"), d0.k0(arrayList, "</script><script>", null, null, 0, null, 62), "</script>");
                        Response response = null;
                        String str2 = null;
                        try {
                            String method2 = webResourceRequest.getMethod();
                            Intrinsics.checkNotNullExpressionValue(method2, "request.method");
                            String string = webResourceRequest.getUrl().toString();
                            Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
                            responseG = t.G(tVar, method2, string, null, webResourceRequest.getRequestHeaders(), !webResourceRequest.isForMainFrame());
                            break;
                        } catch (Exception unused) {
                        }
                        try {
                            if (webResourceRequest.isForMainFrame() && responseG.f226098r) {
                                responseG.close();
                                byte[] bytes = ("<html><head><meta http-equiv=\"refresh\" content=\"0; url=" + responseG.f("location", null) + "/\"></head><body></body></html>").getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                            } else {
                                String strF = responseG.f("content-type", "");
                                u0 u0Var = responseG.f;
                                ResponseBody responseBody = responseG.f226090g;
                                Intrinsics.h(strF);
                                if (a0.H(strF, "text/html", true)) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    if (responseBody != null) {
                                        String strString = responseBody.string();
                                        if (kotlin.text.d0.Q(strString, "</head>", 0, true) > -1) {
                                            sb6 = new StringBuilder();
                                            sb6.append(strI);
                                            sb6.append("</head>");
                                            str = "</head>";
                                        } else if (kotlin.text.d0.Q(strString, "</body>", 0, true) > -1) {
                                            sb6 = new StringBuilder();
                                            sb6.append(strI);
                                            sb6.append("</body>");
                                        } else if (kotlin.text.d0.Q(strString, "</html>", 0, true) > -1) {
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append(strI);
                                            sb9.append("</html>");
                                            str = "</html>";
                                            sb6 = sb9;
                                        } else {
                                            strD = strString + strI;
                                            str2 = strD;
                                        }
                                        strD = a0.D(strString, str, sb6.toString(), true);
                                        str2 = strD;
                                    }
                                    d dVarK = ue8.c.k(u0Var);
                                    while (dVarK.hasNext()) {
                                        Pair pair = (Pair) dVarK.next();
                                        String str3 = (String) pair.f186385a;
                                        if (!kotlin.text.d0.J(str3, "content-security-policy", true)) {
                                            linkedHashMap.put(str3, pair.f186386b);
                                        }
                                    }
                                    String strF2 = responseG.f("content-encoding", "utf-8");
                                    int i = responseG.d;
                                    if (str2 != null) {
                                        byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
                                        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                                        byteArrayInputStream = new ByteArrayInputStream(bytes2);
                                    } else {
                                        byte[] bytes3 = "".getBytes(Charsets.UTF_8);
                                        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                                        byteArrayInputStream = new ByteArrayInputStream(bytes3);
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                            response = responseG;
                            if (response != null) {
                                response.close();
                            }
                            return super.shouldInterceptRequest(webView, webResourceRequest);
                        }
                    }
                }
                break;
            case 7:
                String string2 = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString();
                if (string2 != null && a0.H(string2, "file://", false) && !a0.y(string2, "globe.html", false)) {
                }
                break;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0368, code lost:
    
        if (r2.equals("https") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x036f, code lost:
    
        if (r2.equals("http") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0372, code lost:
    
        r2 = new com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.model.UsPlaidResponseEvent.OpenExternalBrowser(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r31, android.webkit.WebResourceRequest r32) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9i.b.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    public b(k callback) {
        this.f22474a = 7;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f22475b = callback;
    }

    public b(mc4.a controller) {
        this.f22474a = 4;
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f22475b = controller;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r13, java.lang.String r14) {
        /*
            r12 = this;
            int r0 = r12.f22474a
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r12.f22475b
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L18;
                case 2: goto Le;
                default: goto L9;
            }
        L9:
            boolean r13 = super.shouldOverrideUrlLoading(r13, r14)
            return r13
        Le:
            if (r14 == 0) goto L17
            com.revolut.core.ui_kit.delegates.WebViewDelegate r3 = (com.revolut.core.ui_kit.delegates.WebViewDelegate) r3
            ihm.f r13 = r3.f
            r13.onNext(r14)
        L17:
            return r2
        L18:
            if (r14 == 0) goto L29
            cam.t r3 = (cam.t) r3
            android.net.Uri r13 = android.net.Uri.parse(r14)
            java.lang.String r14 = "parse(url)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
            boolean r1 = cam.t.I(r3, r13)
        L29:
            return r1
        L2a:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r13 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r13)
            com.revolut.feature_news_impl.presentation.ui.NewsInfoActivity r3 = (com.revolut.feature_news_impl.presentation.ui.NewsInfoActivity) r3
            a9i.a r0 = r3.f97434w0
            r4 = 0
            if (r0 == 0) goto L9f
            a9i.c r0 = r0.f2660c
            u06.c r0 = r0.d
            q06.l r0 = r0.a()
            vc.s.j(r0)
            lg0.a r5 = lg0.a.IGNORE
            s06.j r0 = (s06.j) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r13)
            java.lang.String r13 = "fallbackStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r13)
            q06.d r13 = r0.d
            s06.c r13 = (s06.c) r13
            jf0.c r13 = r13.d(r14)
            if (r13 == 0) goto L90
            jf0.e r6 = r13.f173628b
            jf0.e r7 = jf0.e.NAVIGATION
            if (r6 != r7) goto L63
            r4 = r13
        L63:
            if (r4 == 0) goto L90
            s06.j.e(r4)
            com.revolut.analytics.tracking.v3.c r13 = r0.f
            java.lang.String r14 = r4.e
            java.lang.String r3 = r4.f173627a
            grl.za r6 = grl.za.Opened
            r13.a(r14, r3, r6, r1)
            java.lang.Class<s06.j> r13 = s06.j.class
            java.lang.String r7 = r13.getSimpleName()
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r6 = rd0.c.DEBUG
            r10 = 0
            r11 = 16
            java.lang.String r8 = "actionPerformerProvider execution is unsupported in sync method"
            r9 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            uli.b r13 = r0.f258858b
            com.revolut.retail.core.navigation.NaviCommand r13 = r13.c(r4)
            r0.f(r4, r13, r5)
            goto L9e
        L90:
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            android.net.Uri r14 = android.net.Uri.parse(r14)
            r13.<init>(r0, r14)
            r3.startActivity(r13)
        L9e:
            return r2
        L9f:
            java.lang.String r13 = "component"
            kotlin.jvm.internal.Intrinsics.r(r13)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c9i.b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
