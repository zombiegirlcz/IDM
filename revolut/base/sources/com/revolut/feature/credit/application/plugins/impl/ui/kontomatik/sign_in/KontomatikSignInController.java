package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.p;
import cam.r;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.u3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc4.g;
import tx0.j0;
import vc.s;
import w01.k;
import xki.e;
import yc4.b;
import yc4.c;
import yc4.d;
import yc4.u;
import yc4.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/sign_in/KontomatikSignInController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lyc4/u;", "Lcli/w;", "Lyc4/w;", "cam/r", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KontomatikSignInController extends PluginScreenController<u> implements w {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(KontomatikSignInController.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenKontomatikSignInKompotBinding;", 0))};
    public final Handler L;
    public final int M;
    public final h N;
    public String O;
    public AnalyticsContext P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public KontomatikSignInController(KontomatikSignInControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = new Handler(Looper.getMainLooper());
        this.M = R$layout.screen_kontomatik_sign_in_kompot;
        this.N = s.t(this, d.f);
        this.P = new AnalyticsContext(inputData.f67820b);
        this.Q = te0.w.y0(new y1a.a(this, inputData, 17));
        this.R = te0.w.y0(new b(this, 0));
        this.S = te0.w.y0(new b(this, 1));
        this.T = te0.w.y0(new b(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        yc4.w uiState = (yc4.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f10714c;
        navBarWithToolbar.setNavigationButtonImage(uiState.f312533c);
        TextLocalisedClause textLocalisedClause = uiState.f312531a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f312532b);
        if (uiState.e) {
            ProgressBar screenKontomatikSignInProgress = d3().e;
            Intrinsics.checkNotNullExpressionValue(screenKontomatikSignInProgress, "screenKontomatikSignInProgress");
            k.d(screenKontomatikSignInProgress);
            d3().d.setNestedScrollingEnabled(false);
        } else {
            ProgressBar screenKontomatikSignInProgress2 = d3().e;
            Intrinsics.checkNotNullExpressionValue(screenKontomatikSignInProgress2, "screenKontomatikSignInProgress");
            k.a(screenKontomatikSignInProgress2);
            d3().d.setNestedScrollingEnabled(true);
            WebView screenKontomatikSignInKontomatikSignInView = d3().f10713b;
            Intrinsics.checkNotNullExpressionValue(screenKontomatikSignInKontomatikSignInView, "screenKontomatikSignInKontomatikSignInView");
            k.f(screenKontomatikSignInKontomatikSignInView);
        }
        String str = uiState.d;
        if (str == null || str.equals(this.O)) {
            return;
        }
        WebView screenKontomatikSignInKontomatikSignInView2 = d3().f10713b;
        Intrinsics.checkNotNullExpressionValue(screenKontomatikSignInKontomatikSignInView2, "screenKontomatikSignInKontomatikSignInView");
        screenKontomatikSignInKontomatikSignInView2.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
        this.O = str;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) e3()).I2(yc4.h.f312518a);
        return true;
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u3) this.Q.getValue();
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getP() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10714c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        WebView screenKontomatikSignInKontomatikSignInView = d3().f10713b;
        Intrinsics.checkNotNullExpressionValue(screenKontomatikSignInKontomatikSignInView, "screenKontomatikSignInKontomatikSignInView");
        knm.b.b(screenKontomatikSignInKontomatikSignInView);
        Context context = screenKontomatikSignInKontomatikSignInView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        screenKontomatikSignInKontomatikSignInView.setBackgroundColor(kli.a.s(R$attr.uikit_windowBackground, context));
        screenKontomatikSignInKontomatikSignInView.addJavascriptInterface(new g(this.L, new b3.a(this, 6), new c(this, 0), new c(this, 1), new b(this, 3)), "AndroidJSReceiver");
        screenKontomatikSignInKontomatikSignInView.setDownloadListener(new pgi.b(this, 2));
        screenKontomatikSignInKontomatikSignInView.setWebViewClient(new c9i.b(new yc4.e(this)));
        screenKontomatikSignInKontomatikSignInView.setWebChromeClient(new r(this, 7));
        screenKontomatikSignInKontomatikSignInView.setOnTouchListener(new iyl.b(screenKontomatikSignInKontomatikSignInView, 3));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f10714c.f59410q), new y5g.d(this, null, 13), 3);
    }

    public final p d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final v e3() {
        return (v) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.T.getValue();
    }
}
