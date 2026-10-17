package com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.webview;

import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.webview.IndiaNetBankingWebViewScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pij.d1;
import pki.b;
import pm6.c;
import pm6.e;
import pm6.f;
import pm6.g;
import te0.w;
import xf6.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/india/netbanking/screen/webview/IndiaNetBankingWebViewScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lpm6/e;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndiaNetBankingWebViewScreen extends SimpleViewController<e> {

    @NotNull
    private static final a Companion = new a();
    public final c N;
    public final int O;
    public final Object P;
    public WebView Q;
    public final Object R;

    public static final class a {
        private a() {
        }
    }

    public IndiaNetBankingWebViewScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_transparent;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: pm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaNetBankingWebViewScreen f237477b;

            {
                this.f237477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IndiaNetBankingWebViewScreen indiaNetBankingWebViewScreen = this.f237477b;
                        qji.b bVarU2 = indiaNetBankingWebViewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.webview.di.IndiaNetBankingWebViewScreenComponent.Injector");
                        indiaNetBankingWebViewScreen.N.getClass();
                        v vVar = new v();
                        vVar.f305114a = e4m.b.b(new vk6.a(21));
                        return vVar;
                    default:
                        return (f) ((v) this.f237477b.P.getValue()).f305114a.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: pm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaNetBankingWebViewScreen f237477b;

            {
                this.f237477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IndiaNetBankingWebViewScreen indiaNetBankingWebViewScreen = this.f237477b;
                        qji.b bVarU2 = indiaNetBankingWebViewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.webview.di.IndiaNetBankingWebViewScreenComponent.Injector");
                        indiaNetBankingWebViewScreen.N.getClass();
                        v vVar = new v();
                        vVar.f305114a = e4m.b.b(new vk6.a(21));
                        return vVar;
                    default:
                        return (f) ((v) this.f237477b.P.getValue()).f305114a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebView webView = this.Q;
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
        WebView webView2 = this.Q;
        if (webView2 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView2, true);
        WebView webView3 = this.Q;
        if (webView3 == null) {
            Intrinsics.r("webView");
            throw null;
        }
        webView3.setWebViewClient(new g(new d1(this, 16)));
        WebView webView4 = this.Q;
        if (webView4 != null) {
            webView4.loadDataWithBaseURL(null, this.N.f237479a, "text/html", "utf-8", null);
        } else {
            Intrinsics.r("webView");
            throw null;
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) super.h2(inflater);
        WebView webView = new WebView(m2());
        webView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.Q = webView;
        controllerContainerFrameLayout.addView(webView);
        return controllerContainerFrameLayout;
    }
}
