package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.content.Context;
import android.webkit.WebView;
import bib.b;
import chc.c0;
import com.revolut.feature.alipay_plus.mpm.support.APMPMDispatch;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import jh.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fR\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerErrorPage;", "", "webViewProvider", "Lkotlin/Function0;", "Landroid/webkit/WebView;", "titleClearer", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "value", "", "isShowingDefaultErrorPage", "()Z", "showIfNeeded", "failingUrl", "", "errorCode", "", "onPageStarted", "url", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMWebContainerErrorPage {
    private boolean isShowingDefaultErrorPage;

    @NotNull
    private final Function0<Unit> titleClearer;

    @NotNull
    private final Function0<WebView> webViewProvider;

    @NotNull
    private static final String ERROR_PAGE_PLACEHOLDER = "&&&&";

    @NotNull
    private static final String ERROR_REDIRECT_ASSET = "containererrorpage/apmpm_custom_h5_page_error.html";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0012\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerErrorPage$Companion;", "", "<init>", "()V", "ERROR_REDIRECT_ASSET", "", "ERROR_PAGE_PLACEHOLDER", "shouldShowForWebError", "", "errorCode", "", "shouldShowForHTTPStatusCode", "statusCode", "shouldHandleWebError", "url", "shouldHandleHTTPError", "buildErrorPageUrl", "failingUrl", "isErrorPageUrl", "errorPageUrl", "isDefaultErrorPageUrl", "buildRedirectHtml", "context", "Landroid/content/Context;", "encodeQueryValue", "value", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
         */
        private final String encodeQueryValue(String value) {
            String strEncode = URLEncoder.encode(value, StandardCharsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return strEncode;
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
         */
        @NotNull
        public final String buildErrorPageUrl(String failingUrl, int errorCode) {
            String str = d0.J("https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html", "?", false) ? "&" : "?";
            String strEncodeQueryValue = encodeQueryValue(String.valueOf(errorCode));
            if (failingUrl == null) {
                failingUrl = "";
            }
            String strEncodeQueryValue2 = encodeQueryValue(failingUrl);
            StringBuilder sbM = v0.a.m("https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html", str, "errorCode=", strEncodeQueryValue, "&url=");
            sbM.append(strEncodeQueryValue2);
            return sbM.toString();
        }

        public final String buildRedirectHtml(@NotNull Context context, @NotNull String errorPageUrl) {
            Object objA;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(errorPageUrl, "errorPageUrl");
            try {
                m.Companion companion = m.INSTANCE;
                InputStream inputStreamOpen = context.getAssets().open("containererrorpage/apmpm_custom_h5_page_error.html");
                try {
                    Intrinsics.h(inputStreamOpen);
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, UTF_8), 8192);
                    try {
                        String strS = d.s(bufferedReader);
                        bufferedReader.close();
                        inputStreamOpen.close();
                        objA = a0.D(strS, "&&&&", errorPageUrl, false);
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            return (String) objA;
        }

        public final boolean isDefaultErrorPageUrl(String url2) {
            return isErrorPageUrl(url2, "https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html");
        }

        public final boolean isErrorPageUrl(String url2, @NotNull String errorPageUrl) {
            Intrinsics.checkNotNullParameter(errorPageUrl, "errorPageUrl");
            return (url2 == null || d0.W(url2) || d0.W(errorPageUrl) || !a0.H(url2, errorPageUrl, false)) ? false : true;
        }

        public final boolean shouldHandleHTTPError(String url2, int statusCode) {
            return shouldShowForHTTPStatusCode(statusCode) && !isDefaultErrorPageUrl(url2);
        }

        public final boolean shouldHandleWebError(String url2, int errorCode) {
            return shouldShowForWebError(errorCode) && !isDefaultErrorPageUrl(url2);
        }

        public final boolean shouldShowForHTTPStatusCode(int statusCode) {
            return 400 <= statusCode && statusCode < 600 && statusCode != 412;
        }

        public final boolean shouldShowForWebError(int errorCode) {
            return errorCode != 0;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public APMPMWebContainerErrorPage(@NotNull Function0<? extends WebView> webViewProvider, @NotNull Function0<Unit> titleClearer) {
        Intrinsics.checkNotNullParameter(webViewProvider, "webViewProvider");
        Intrinsics.checkNotNullParameter(titleClearer, "titleClearer");
        this.webViewProvider = webViewProvider;
        this.titleClearer = titleClearer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showIfNeeded$lambda$0(APMPMWebContainerErrorPage aPMPMWebContainerErrorPage, WebView webView, String str, String str2) {
        aPMPMWebContainerErrorPage.isShowingDefaultErrorPage = true;
        aPMPMWebContainerErrorPage.titleClearer.invoke();
        webView.setAlpha(1.0f);
        webView.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: isShowingDefaultErrorPage, reason: from getter */
    public final boolean getIsShowingDefaultErrorPage() {
        return this.isShowingDefaultErrorPage;
    }

    public final void onPageStarted(String url2) {
        this.isShowingDefaultErrorPage = INSTANCE.isDefaultErrorPageUrl(url2);
    }

    public final boolean showIfNeeded(String failingUrl, int errorCode) {
        WebView webView = (WebView) this.webViewProvider.invoke();
        if (webView == null || d0.W("https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html")) {
            return false;
        }
        Companion companion = INSTANCE;
        if (companion.isErrorPageUrl(failingUrl, "https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html") || companion.isErrorPageUrl(webView.getUrl(), "https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html")) {
            return false;
        }
        String strBuildErrorPageUrl = companion.buildErrorPageUrl(failingUrl, errorCode);
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String strBuildRedirectHtml = companion.buildRedirectHtml(context, strBuildErrorPageUrl);
        if (strBuildRedirectHtml == null) {
            return false;
        }
        APMPMDispatch.INSTANCE.main(new b(this, webView, failingUrl, strBuildRedirectHtml, 3));
        return true;
    }

    public /* synthetic */ APMPMWebContainerErrorPage(Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? new c0(28) : function02);
    }
}
