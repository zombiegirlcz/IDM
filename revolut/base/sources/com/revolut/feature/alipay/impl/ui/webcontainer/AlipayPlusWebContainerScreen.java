package com.revolut.feature.alipay.impl.ui.webcontainer;

import aii.q;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.alipay.impl.R$layout;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerScreen;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerChromeClient;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerClient;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerErrorPage;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerParams;
import com.revolut.kompot.navigable.vc.ViewController;
import ff4.z;
import fl1.c;
import fl1.d;
import fl1.f;
import fl1.l;
import fl1.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import ok1.k;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/webcontainer/AlipayPlusWebContainerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lfl1/l;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlipayPlusWebContainerScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(AlipayPlusWebContainerScreen.class, "binding", "getBinding()Lcom/revolut/feature/alipay/impl/databinding/ScreenAlipayWebContainerBinding;", 0))};
    public final AlipayPlusWebContainerContract$InputData K;
    public final h L;
    public WebView M;
    public c N;
    public APMPMWebContainerErrorPage O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public final Object T;
    public final Object U;
    public final Object V;

    public AlipayPlusWebContainerScreen(AlipayPlusWebContainerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        this.P = R$layout.screen_alipay_web_container;
        this.Q = R$style.UiKitTheme_Mono;
        this.R = true;
        this.S = true;
        this.T = te0.w.y0(new d(this, 0));
        this.U = te0.w.y0(new d(this, 2));
        this.V = te0.w.y0(new d(this, 3));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.Q);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar webContainerNavBar = d3().f196187b;
        Intrinsics.checkNotNullExpressionValue(webContainerNavBar, "webContainerNavBar");
        webContainerNavBar.setTitle(uiState.f135894a, null);
        d3().f196187b.setLoadingVisible(uiState.f135895b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.M = d3().f196188c;
        d3().f196187b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        WebView webView = this.M;
        if (webView == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        settings.setDomStorageEnabled(true);
        AlipayPlusWebContainerContract$InputData alipayPlusWebContainerContract$InputData = this.K;
        String str = alipayPlusWebContainerContract$InputData.f61093b;
        settings.setUserAgentString((str == null || d0.W(str)) ? a0.d.r(settings.getUserAgentString(), " MPPContainer") : j6.a.r(settings.getUserAgentString(), " ", str, " MPPContainer"));
        settings.setCacheMode(-1);
        this.O = new APMPMWebContainerErrorPage(new d(this, 4), new d(this, 6));
        APMPMWebContainerParams aPMPMWebContainerParams = new APMPMWebContainerParams(alipayPlusWebContainerContract$InputData.a(), alipayPlusWebContainerContract$InputData.f61093b, alipayPlusWebContainerContract$InputData.f61094c, alipayPlusWebContainerContract$InputData.d, alipayPlusWebContainerContract$InputData.e, alipayPlusWebContainerContract$InputData.f, alipayPlusWebContainerContract$InputData.f61095g);
        d dVar = new d(this, 7);
        d dVar2 = new d(this, 8);
        APMPMWebContainerErrorPage aPMPMWebContainerErrorPage = this.O;
        if (aPMPMWebContainerErrorPage == null) {
            Intrinsics.r("errorPage");
            throw null;
        }
        this.N = new c(aPMPMWebContainerParams, dVar, dVar2, aPMPMWebContainerErrorPage, new d(this, 9));
        Activity activityM2 = m2();
        c cVar = this.N;
        if (cVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        APMPMWebContainerErrorPage aPMPMWebContainerErrorPage2 = this.O;
        if (aPMPMWebContainerErrorPage2 == null) {
            Intrinsics.r("errorPage");
            throw null;
        }
        final int i = 3;
        Function1 function1 = new Function1(this) { // from class: fl1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusWebContainerScreen f135888b;

            {
                this.f135888b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                AlipayPlusWebContainerScreen alipayPlusWebContainerScreen = this.f135888b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(100));
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new j((String) obj2));
                        break;
                    case 2:
                        int iIntValue = ((Integer) obj2).intValue();
                        KProperty[] kPropertyArr3 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(iIntValue));
                        break;
                    default:
                        KProperty[] kPropertyArr4 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 0;
        webView.setWebViewClient(new APMPMWebContainerClient(activityM2, cVar, aPMPMWebContainerErrorPage2, function1, new Function1(this) { // from class: fl1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusWebContainerScreen f135888b;

            {
                this.f135888b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                AlipayPlusWebContainerScreen alipayPlusWebContainerScreen = this.f135888b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(100));
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new j((String) obj2));
                        break;
                    case 2:
                        int iIntValue = ((Integer) obj2).intValue();
                        KProperty[] kPropertyArr3 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(iIntValue));
                        break;
                    default:
                        KProperty[] kPropertyArr4 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(0));
                        break;
                }
                return Unit.f186387a;
            }
        }));
        final int i3 = 1;
        d dVar3 = new d(this, 1);
        Function1 function12 = new Function1(this) { // from class: fl1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusWebContainerScreen f135888b;

            {
                this.f135888b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                AlipayPlusWebContainerScreen alipayPlusWebContainerScreen = this.f135888b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(100));
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new j((String) obj2));
                        break;
                    case 2:
                        int iIntValue = ((Integer) obj2).intValue();
                        KProperty[] kPropertyArr3 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(iIntValue));
                        break;
                    default:
                        KProperty[] kPropertyArr4 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function13 = new Function1(this) { // from class: fl1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusWebContainerScreen f135888b;

            {
                this.f135888b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i5;
                AlipayPlusWebContainerScreen alipayPlusWebContainerScreen = this.f135888b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(100));
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new j((String) obj2));
                        break;
                    case 2:
                        int iIntValue = ((Integer) obj2).intValue();
                        KProperty[] kPropertyArr3 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(iIntValue));
                        break;
                    default:
                        KProperty[] kPropertyArr4 = AlipayPlusWebContainerScreen.W;
                        alipayPlusWebContainerScreen.d().I2(new i(0));
                        break;
                }
                return Unit.f186387a;
            }
        };
        d dVar4 = new d(this, 5);
        c cVar2 = this.N;
        if (cVar2 == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        webView.setWebChromeClient(new APMPMWebContainerChromeClient(dVar3, function12, function13, dVar4, cVar2));
        c cVar3 = this.N;
        if (cVar3 != null) {
            cVar3.loadUrl(alipayPlusWebContainerContract$InputData.a());
        } else {
            Intrinsics.r("presenter");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        c cVar = this.N;
        if (cVar != null) {
            cVar.f135881a = true;
            ((Handler) cVar.f135884g).removeCallbacksAndMessages(null);
        }
        WebView webView = this.M;
        if (webView == null) {
            return;
        }
        this.M = null;
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.stopLoading();
        webView.getSettings().setJavaScriptEnabled(false);
        webView.clearHistory();
        webView.removeAllViews();
        webView.destroy();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f196187b.f59410q), new z(this, null, 16), 3);
    }

    public final lk1.d d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lk1.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.valueOf(this.S);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
