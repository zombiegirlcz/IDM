package com.revolut.feature.external_accounts.impl.ui.japan.authorization.webview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.webview.AuthorizationWebViewScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pki.b;
import te0.w;
import vm6.c;
import vm6.e;
import vm6.f;
import vm6.g;
import xf6.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/japan/authorization/webview/AuthorizationWebViewScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lvm6/e;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthorizationWebViewScreen extends SimpleViewController<e> {

    @NotNull
    private static final a Companion = new a();
    public final c N;
    public final int O;
    public final Object P;
    public final Object Q;
    public WebView R;

    public static final class a {
        private a() {
        }
    }

    public AuthorizationWebViewScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_transparent;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizationWebViewScreen f290544b;

            {
                this.f290544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AuthorizationWebViewScreen authorizationWebViewScreen = this.f290544b;
                        qji.b bVarU2 = authorizationWebViewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.japan.authorization.webview.di.AuthorizationWebViewScreenComponent.AuthorizationWebViewScreenInjector");
                        authorizationWebViewScreen.N.getClass();
                        j jVar = new j();
                        jVar.f304897a = e4m.b.b(new vk6.a(20));
                        return jVar;
                    default:
                        return (f) ((j) this.f290544b.P.getValue()).f304897a.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizationWebViewScreen f290544b;

            {
                this.f290544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AuthorizationWebViewScreen authorizationWebViewScreen = this.f290544b;
                        qji.b bVarU2 = authorizationWebViewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.japan.authorization.webview.di.AuthorizationWebViewScreenComponent.AuthorizationWebViewScreenInjector");
                        authorizationWebViewScreen.N.getClass();
                        j jVar = new j();
                        jVar.f304897a = e4m.b.b(new vk6.a(20));
                        return jVar;
                    default:
                        return (f) ((j) this.f290544b.P.getValue()).f304897a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.Q.getValue();
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
        webView3.setWebViewClient(new g(new vh2.j(this, 15)));
        WebView webView4 = this.R;
        if (webView4 != null) {
            webView4.loadDataWithBaseURL(null, this.N.f290546a, "text/html", "utf-8", null);
        } else {
            Intrinsics.r("webView");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        WebView webView = this.R;
        if (webView == null) {
            Intrinsics.r("webView");
            throw null;
        }
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            WebView webView2 = this.R;
            if (webView2 == null) {
                Intrinsics.r("webView");
                throw null;
            }
            viewGroup.removeView(webView2);
        }
        WebView webView3 = this.R;
        if (webView3 != null) {
            webView3.destroy();
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
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.R = webView;
        controllerContainerFrameLayout.addView(webView);
        return controllerContainerFrameLayout;
    }
}
