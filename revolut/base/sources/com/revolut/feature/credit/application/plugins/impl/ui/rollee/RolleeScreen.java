package com.revolut.feature.credit.application.plugins.impl.ui.rollee;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.w;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.tracking.v3.CreditRolleeContext;
import dw3.w5;
import ft3.d1;
import grl.m2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jb3.l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import q5g.f0;
import qh4.a0;
import qh4.b0;
import qh4.p;
import qh4.q;
import qh4.r;
import qh4.y;
import qh4.z;
import sh4.f;
import vc.s;
import w01.k;
import xki.e;
import yhm.j;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/rollee/RolleeScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lqh4/y;", "Lcli/w;", "Lqh4/a0;", "Lqh4/z;", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RolleeScreen extends PluginScreenController<y> implements w, z {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RolleeScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenRolleeBinding;", 0))};
    public final RolleeScreenContract$InputData L;
    public final int M;
    public final Handler N;
    public final Lazy O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public static final class a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar = rd0.c.DEBUG;
            String strMessage = consoleMessage.message();
            int iLineNumber = consoleMessage.lineNumber();
            String strSourceId = consoleMessage.sourceId();
            StringBuilder sbK = v0.a.k(iLineNumber, "JS:Console: ", strMessage, " -- From line ", " of ");
            sbK.append(strSourceId);
            rd0.d.b(cVar, null, sbK.toString(), null, null, 16);
            return super.onConsoleMessage(consoleMessage);
        }
    }

    public RolleeScreen(RolleeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_rollee;
        this.N = new Handler(Looper.getMainLooper());
        this.O = j.b(new qh0.d(12));
        this.P = te0.w.y0(new p(this, 0));
        this.Q = s.t(this, q.f);
        this.R = te0.w.y0(new p(this, 1));
        this.S = te0.w.y0(new p(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        a0 uiState = (a0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ((z4l.j) this.O.getValue()).c(uiState.f246448a);
        String str = uiState.f246449b;
        if (str != null) {
            String url2 = f3().getUrl();
            if (url2 == null || d0.W(url2)) {
                f3().loadUrl(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w5) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10722b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setDescriptionVisible(false);
        ScreenContentRecyclerView recyclerView = d3().f10723c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        yp0.y.h(recyclerView, (z4l.j) this.O.getValue(), new LinearLayoutManager(recyclerView.getContext()));
        WebView webViewF3 = f3();
        webViewF3.setBackgroundColor(0);
        knm.b.b(webViewF3);
        webViewF3.addJavascriptInterface(new f(this.N, new qh4.o(this, 0), new p(this, 3), new f0(this, 22), new qh4.o(this, 1), new qh4.o(this, 2), new qh4.o(this, 3), new p(this, 4), new p(this, 5)), "AndroidJSReceiver");
        webViewF3.setDownloadListener(new pgi.b(this, 1));
        webViewF3.setWebViewClient(new c9i.b(new r(this)));
        webViewF3.setWebChromeClient(new a());
        webViewF3.setOnTouchListener(new iyl.b(webViewF3, 1));
        ScreenContentRecyclerView recyclerView2 = d3().f10723c;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        k.d(recyclerView2);
        k.a(f3());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10722b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new qg4.d(this, null, 4), 3);
    }

    public final aw3.s d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b0 R2() {
        return (b0) this.R.getValue();
    }

    public final WebView f3() {
        WebView webview = d3().d;
        Intrinsics.checkNotNullExpressionValue(webview, "webview");
        return webview;
    }

    public final void g3(String str, String str2, String str3, String str4, String str5) {
        String strS = a0.d.s("callback=", str, " payload=", str3);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        CreditRolleeContext.a aVarNewBuilder = CreditRolleeContext.newBuilder();
        aVarNewBuilder.c();
        ((CreditRolleeContext) aVarNewBuilder.f49761b).setCallsStack(strS);
        RolleeScreenContract$InputData rolleeScreenContract$InputData = this.L;
        CreditApplicationPluginFlowContract$Configuration f68330b = rolleeScreenContract$InputData.getF68330b();
        m2 m2VarW = l.w(new d1(f68330b.d, f68330b.e, null));
        aVarNewBuilder.c();
        ((CreditRolleeContext) aVarNewBuilder.f49761b).setProductType(m2VarW);
        String str6 = rolleeScreenContract$InputData.f68330b.f66892b;
        aVarNewBuilder.c();
        ((CreditRolleeContext) aVarNewBuilder.f49761b).setApplicationId(str6);
        if (str2 != null) {
            aVarNewBuilder.c();
            ((CreditRolleeContext) aVarNewBuilder.f49761b).setStatus(str2);
        }
        if (str4 != null) {
            aVarNewBuilder.c();
            ((CreditRolleeContext) aVarNewBuilder.f49761b).setDatasourceId(str4);
        }
        if (str5 != null) {
            aVarNewBuilder.c();
            ((CreditRolleeContext) aVarNewBuilder.f49761b).setOtpStatus(str5);
        }
        Unit unit = Unit.f186387a;
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.K = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        py0.f fVarN0 = jh.d.f(context).n0();
        View viewD2 = D2();
        StringBuilder sbS = p.a.s(str);
        if (str3 != null) {
            sbS.append(str3);
        }
        if (str2 != null) {
            sbS.append(str2);
        }
        if (str4 != null) {
            sbS.append(str4);
        }
        if (str5 != null) {
            sbS.append(str5);
        }
        fVarN0.i(viewD2, sbS.toString());
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (cli.a0) this.S.getValue();
    }
}
