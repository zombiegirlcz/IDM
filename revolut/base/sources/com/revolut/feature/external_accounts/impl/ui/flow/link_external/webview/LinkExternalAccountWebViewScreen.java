package com.revolut.feature.external_accounts.impl.ui.flow.link_external.webview;

import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.webview.LinkExternalAccountWebViewScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import ke7.v;
import km6.c;
import km6.f;
import km6.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xf6.a0;
import xf6.b0;
import xf6.t;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/link_external/webview/LinkExternalAccountWebViewScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lkm6/f;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkExternalAccountWebViewScreen extends SimpleViewController<f> {
    public final c N;
    public final int O;
    public final Object P;
    public final Object Q;
    public WebView R;

    public LinkExternalAccountWebViewScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_transparent;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: km6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkExternalAccountWebViewScreen f185722b;

            {
                this.f185722b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LinkExternalAccountWebViewScreen linkExternalAccountWebViewScreen = this.f185722b;
                        qji.b bVarU2 = linkExternalAccountWebViewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.flow.link_external.webview.di.LinkExternalAccountWebViewScreenComponent.Injector");
                        a0 a0Var = (a0) bVarU2;
                        t tVar = a0Var.f304783b;
                        a0 a0Var2 = a0Var.f304784c;
                        c cVar = linkExternalAccountWebViewScreen.N;
                        cVar.getClass();
                        return new b0(tVar, a0Var2, cVar);
                    default:
                        return (g) ((b0) this.f185722b.P.getValue()).f304794b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: km6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkExternalAccountWebViewScreen f185722b;

            {
                this.f185722b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LinkExternalAccountWebViewScreen linkExternalAccountWebViewScreen = this.f185722b;
                        qji.b bVarU2 = linkExternalAccountWebViewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.flow.link_external.webview.di.LinkExternalAccountWebViewScreenComponent.Injector");
                        a0 a0Var = (a0) bVarU2;
                        t tVar = a0Var.f304783b;
                        a0 a0Var2 = a0Var.f304784c;
                        c cVar = linkExternalAccountWebViewScreen.N;
                        cVar.getClass();
                        return new b0(tVar, a0Var2, cVar);
                    default:
                        return (g) ((b0) this.f185722b.P.getValue()).f304794b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebView webView = this.R;
        if (webView == null) {
            Intrinsics.r("webView");
            throw null;
        }
        WebSettings settings = webView.getSettings();
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        WebView webView2 = this.R;
        if (webView2 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView2, true);
        WebView webView3 = this.R;
        if (webView3 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView3.setWebViewClient(new pm6.g(new v(this, 23)));
        WebView webView4 = this.R;
        if (webView4 != null) {
            webView4.loadUrl(this.N.f185724a);
        } else {
            Intrinsics.r("webView");
            throw null;
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) super.h2(inflater);
        WebView webView = new WebView(m2());
        webView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.R = webView;
        controllerContainerFrameLayout.addView(webView);
        return controllerContainerFrameLayout;
    }
}
