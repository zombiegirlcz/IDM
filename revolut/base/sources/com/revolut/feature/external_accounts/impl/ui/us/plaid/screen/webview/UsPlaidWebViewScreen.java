package com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.UsPlaidWebViewScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ni1.a;
import no6.c;
import no6.d;
import no6.f;
import no6.g;
import pki.b;
import xf6.r0;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/us/plaid/screen/webview/UsPlaidWebViewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lno6/d;", "Lcli/w;", "Lno6/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UsPlaidWebViewScreen extends ViewController<d> implements w {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public WebView P;

    public UsPlaidWebViewScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: no6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UsPlaidWebViewScreen f217921b;

            {
                this.f217921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UsPlaidWebViewScreen usPlaidWebViewScreen = this.f217921b;
                        return n14.e.a(usPlaidWebViewScreen, (f) usPlaidWebViewScreen.N.getValue());
                    case 1:
                        return (f) ((r0) this.f217921b.M.getValue()).f305016c.get();
                    default:
                        ((r0) this.f217921b.M.getValue()).getClass();
                        return new o();
                }
            }
        });
        this.M = te0.w.y0(new a(this, inputData, 14));
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: no6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UsPlaidWebViewScreen f217921b;

            {
                this.f217921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UsPlaidWebViewScreen usPlaidWebViewScreen = this.f217921b;
                        return n14.e.a(usPlaidWebViewScreen, (f) usPlaidWebViewScreen.N.getValue());
                    case 1:
                        return (f) ((r0) this.f217921b.M.getValue()).f305016c.get();
                    default:
                        ((r0) this.f217921b.M.getValue()).getClass();
                        return new o();
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: no6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UsPlaidWebViewScreen f217921b;

            {
                this.f217921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        UsPlaidWebViewScreen usPlaidWebViewScreen = this.f217921b;
                        return n14.e.a(usPlaidWebViewScreen, (f) usPlaidWebViewScreen.N.getValue());
                    case 1:
                        return (f) ((r0) this.f217921b.M.getValue()).f305016c.get();
                    default:
                        ((r0) this.f217921b.M.getValue()).getClass();
                        return new o();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        String url2 = uiState.f217926a;
        if (url2 != null) {
            no6.o oVar2 = (no6.o) this.O.getValue();
            oVar2.getClass();
            Intrinsics.checkNotNullParameter(url2, "url");
            if (Intrinsics.f(oVar2.f217933a, url2)) {
                return;
            }
            oVar2.f217933a = url2;
            WebView webView = this.P;
            if (webView != null) {
                webView.loadUrl(url2);
            } else {
                Intrinsics.r("webView");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        WebView webView = this.P;
        if (webView == null) {
            Intrinsics.r("webView");
            throw null;
        }
        WebSettings settings = webView.getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        WebView webView2 = this.P;
        if (webView2 != null) {
            webView2.setWebViewClient(new c9i.b(this, 6));
        } else {
            Intrinsics.r("webView");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        WebView webView = this.P;
        if (webView != null) {
            if (webView == null) {
                Intrinsics.r("webView");
                throw null;
            }
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                WebView webView2 = this.P;
                if (webView2 == null) {
                    Intrinsics.r("webView");
                    throw null;
                }
                viewGroup.removeView(webView2);
            }
            WebView webView3 = this.P;
            if (webView3 == null) {
                Intrinsics.r("webView");
                throw null;
            }
            webView3.stopLoading();
            WebView webView4 = this.P;
            if (webView4 != null) {
                webView4.destroy();
            } else {
                Intrinsics.r("webView");
                throw null;
            }
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) super.h2(inflater);
        WebView webView = new WebView(m2());
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.P = webView;
        controllerContainerFrameLayout.addView(webView);
        return controllerContainerFrameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.L.getValue();
    }
}
