package com.revolut.feature_web_view.presentation.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cam.r;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature_web_view.R$layout;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.presentation.screen.WebViewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mgi.a;
import ogi.b;
import r0e.c;
import rgi.d;
import rgi.f;
import rgi.g;
import rgi.i;
import rgi.j;
import rgi.k;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_web_view/presentation/screen/WebViewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lrgi/h;", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebViewScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WebViewScreen.class, "binding", "getBinding()Lcom/revolut/feature_web_view/databinding/ScreenWebViewBinding;", 0))};
    public final WebViewInputData K;
    public final Object L;
    public final h M;
    public k N;
    public final int O;
    public final Object P;
    public final Object Q;

    public WebViewScreen(WebViewInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: rgi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewScreen f254188b;

            {
                this.f254188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebViewScreen webViewScreen = this.f254188b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WebViewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(webViewScreen.m2()).a().get(ogi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ogi.a.class, " is not found"));
                        }
                        ogi.a aVar3 = ((ogi.a) aVar2.b()).f225155c;
                        WebViewInputData webViewInputData = webViewScreen.K;
                        webViewInputData.getClass();
                        return new ogi.b(aVar3, webViewInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WebViewScreen.R;
                        return (f) ((ogi.b) webViewScreen.L.getValue()).f225158c.get();
                    default:
                        KProperty[] kPropertyArr3 = WebViewScreen.R;
                        return n14.e.a(webViewScreen, (f) webViewScreen.P.getValue());
                }
            }
        });
        this.M = s.t(this, d.f);
        this.O = R$layout.screen_web_view;
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: rgi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewScreen f254188b;

            {
                this.f254188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WebViewScreen webViewScreen = this.f254188b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebViewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(webViewScreen.m2()).a().get(ogi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ogi.a.class, " is not found"));
                        }
                        ogi.a aVar3 = ((ogi.a) aVar2.b()).f225155c;
                        WebViewInputData webViewInputData = webViewScreen.K;
                        webViewInputData.getClass();
                        return new ogi.b(aVar3, webViewInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WebViewScreen.R;
                        return (f) ((ogi.b) webViewScreen.L.getValue()).f225158c.get();
                    default:
                        KProperty[] kPropertyArr3 = WebViewScreen.R;
                        return n14.e.a(webViewScreen, (f) webViewScreen.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: rgi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebViewScreen f254188b;

            {
                this.f254188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WebViewScreen webViewScreen = this.f254188b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebViewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(webViewScreen.m2()).a().get(ogi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ogi.a.class, " is not found"));
                        }
                        ogi.a aVar3 = ((ogi.a) aVar2.b()).f225155c;
                        WebViewInputData webViewInputData = webViewScreen.K;
                        webViewInputData.getClass();
                        return new ogi.b(aVar3, webViewInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WebViewScreen.R;
                        return (f) ((ogi.b) webViewScreen.L.getValue()).f225158c.get();
                    default:
                        KProperty[] kPropertyArr3 = WebViewScreen.R;
                        return n14.e.a(webViewScreen, (f) webViewScreen.P.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        Clause clause;
        rgi.h uiState = (rgi.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (!Intrinsics.f(this.N, uiState.f254192a)) {
            k kVar = uiState.f254192a;
            this.N = kVar;
            WebView webView = d3().f205290c;
            if (kVar instanceof j) {
                webView.loadUrl(((j) kVar).f254197a);
            } else {
                if (!(kVar instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                i iVar = (i) kVar;
                webView.getSettings().setUserAgentString(iVar.f254195b);
                webView.loadUrl(iVar.f254194a, iVar.f254196c);
            }
        }
        g gVar = qVar instanceof g ? (g) qVar : null;
        if ((gVar == null || gVar.f254191a) && (clause = uiState.f254193b) != null) {
            BasicNavBar navigationBar = d3().f205289b;
            Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
            navigationBar.setTitle(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.N = null;
        d3().f205289b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        WebView webView = d3().f205290c;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebChromeClient(new r(this, 4));
        webView.setWebViewClient(new c9i.b(this, 8));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f205289b.f59211b), new c(this, null, 23), 3);
    }

    public final a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
