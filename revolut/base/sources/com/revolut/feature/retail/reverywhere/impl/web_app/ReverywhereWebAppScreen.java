package com.revolut.feature.retail.reverywhere.impl.web_app;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import ao.h;
import cli.o;
import cli.q;
import cli.w;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereLocationSharing;
import com.revolut.feature.retail.reverywhere.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fp0.l;
import grl.k9;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import je5.n;
import jfb.a0;
import jfb.b0;
import jfb.c0;
import jfb.c1;
import jfb.d0;
import jfb.d1;
import jfb.e0;
import jfb.f1;
import jfb.g0;
import jfb.g1;
import jfb.i0;
import jfb.j0;
import jfb.k0;
import jfb.l0;
import jfb.l1;
import jfb.m0;
import jfb.n0;
import jfb.r;
import jfb.s0;
import jfb.x;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.t;
import no.m;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vc.s;
import vkm.j2;
import wp5.y;
import yhm.j;
import zhm.f0;
import zhm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lcli/w;", "Ljfb/o0;", "Lno/m;", "Companion", "a", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReverywhereWebAppScreen extends ViewController<Object> implements w, m {
    public final ReverywhereWebAppScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public boolean U;
    public boolean V;
    public final ArrayList W;
    public final Handler X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f82914a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final l f82915b0;
    public final c1 c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f82916d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final FullScreenStateDelegate f82917e0;
    public final Lazy f0;
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(ReverywhereWebAppScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/reverywhere/impl/databinding/ScreenWebAppBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public ReverywhereWebAppScreen(ReverywhereWebAppScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_web_app;
        this.M = te0.w.y0(new c0(this, 14));
        this.N = s.t(this, e0.f);
        this.O = te0.w.y0(new c0(this, 2));
        this.P = te0.w.y0(new c0(this, 3));
        this.Q = te0.w.y0(new c0(this, 4));
        this.R = te0.w.y0(new c0(this, 5));
        this.S = te0.w.y0(new c0(this, 6));
        this.T = te0.w.y0(new c0(this, 7));
        this.W = new ArrayList();
        Handler handler = new Handler(Looper.getMainLooper());
        this.X = handler;
        this.Y = te0.w.y0(new c0(this, 8));
        this.Z = te0.w.y0(new c0(this, 9));
        this.f82915b0 = new l(this, 17);
        this.c0 = new c1(handler, new c0(this, 15), new d0(this, 2), new c0(this, 16), new d0(this, 3));
        this.f82916d0 = te0.w.y0(new c0(this, 0));
        this.f82917e0 = new FullScreenStateDelegate();
        this.f0 = j.b(new c0(this, 1));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        boolean z;
        jfb.o0 uiState = (jfb.o0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        boolean z3 = uiState.f173830c;
        n0 n0Var = uiState.f173828a;
        j0 j0Var = j0.f173817a;
        if (z3) {
            z = false;
        } else if (Intrinsics.f(n0Var, j0Var) || (n0Var instanceof l0)) {
            z = true;
        } else {
            if (!(n0Var instanceof k0) && !(n0Var instanceof m0)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        if (uiState.f173830c) {
            ShimmerFrameLayout reverywhereShimmer = d3().d;
            Intrinsics.checkNotNullExpressionValue(reverywhereShimmer, "reverywhereShimmer");
            reverywhereShimmer.setVisibility(0);
            FrameLayout reverywhereShimmerView = d3().e;
            Intrinsics.checkNotNullExpressionValue(reverywhereShimmerView, "reverywhereShimmerView");
            reverywhereShimmerView.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout = d3().d;
            if (!shimmerFrameLayout.f26154c) {
                shimmerFrameLayout.f26154c = true;
                shimmerFrameLayout.e();
            }
        } else {
            d3().d.a();
            ShimmerFrameLayout reverywhereShimmer2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(reverywhereShimmer2, "reverywhereShimmer");
            reverywhereShimmer2.setVisibility(8);
            FrameLayout reverywhereShimmerView2 = d3().e;
            Intrinsics.checkNotNullExpressionValue(reverywhereShimmerView2, "reverywhereShimmerView");
            reverywhereShimmerView2.setVisibility(8);
        }
        h3().setVisibility(!z ? 4 : 0);
        g0 g0Var = uiState.f173829b;
        if (g0Var != null) {
            h3().evaluateJavascript(t.e("\n            javascript:didCompleteCheckout(\"" + g0Var.name() + "\")\n        "), null);
            h3().scrollTo(0, 0);
        }
        i0 i0Var = qVar instanceof i0 ? (i0) qVar : null;
        if (i0Var != null) {
            h3().evaluateJavascript(t.e("\n            javascript:initAppLink(\"" + i0Var.f173815a + "\")\n        "), null);
        }
        boolean zF = Intrinsics.f(n0Var, j0Var);
        Lazy lazy = this.f0;
        if (zF) {
            ScreenContentRecyclerView reverywhereRecyclerView = d3().f4019c;
            Intrinsics.checkNotNullExpressionValue(reverywhereRecyclerView, "reverywhereRecyclerView");
            reverywhereRecyclerView.setVisibility(8);
            NavBarWithToolbar reverywhereNavBarWithToolbar = d3().f4018b;
            Intrinsics.checkNotNullExpressionValue(reverywhereNavBarWithToolbar, "reverywhereNavBarWithToolbar");
            reverywhereNavBarWithToolbar.setVisibility(8);
            ((z4l.j) lazy.getValue()).c(f0.f322471a);
            return;
        }
        if (n0Var instanceof k0) {
            ScreenContentRecyclerView reverywhereRecyclerView2 = d3().f4019c;
            Intrinsics.checkNotNullExpressionValue(reverywhereRecyclerView2, "reverywhereRecyclerView");
            reverywhereRecyclerView2.setVisibility(0);
            NavBarWithToolbar reverywhereNavBarWithToolbar2 = d3().f4018b;
            Intrinsics.checkNotNullExpressionValue(reverywhereNavBarWithToolbar2, "reverywhereNavBarWithToolbar");
            reverywhereNavBarWithToolbar2.setVisibility(0);
            ((z4l.j) lazy.getValue()).c(((k0) n0Var).f173818a);
            return;
        }
        if (n0Var instanceof m0) {
            ScreenContentRecyclerView reverywhereRecyclerView3 = d3().f4019c;
            Intrinsics.checkNotNullExpressionValue(reverywhereRecyclerView3, "reverywhereRecyclerView");
            reverywhereRecyclerView3.setVisibility(0);
            NavBarWithToolbar reverywhereNavBarWithToolbar3 = d3().f4018b;
            Intrinsics.checkNotNullExpressionValue(reverywhereNavBarWithToolbar3, "reverywhereNavBarWithToolbar");
            reverywhereNavBarWithToolbar3.setVisibility(0);
            ((z4l.j) lazy.getValue()).c(((m0) n0Var).f173824a);
            return;
        }
        if (!(n0Var instanceof l0)) {
            throw new NoWhenBranchMatchedException();
        }
        f1 f1VarI3 = i3();
        l0 l0Var = (l0) n0Var;
        String str = l0Var.f173821a;
        f1VarI3.f = str;
        String url2 = l0Var.f173822b;
        if (url2.length() == 0) {
            return;
        }
        d dVar = (d) R2();
        dVar.H2(dVar.B, new n(13));
        a2 a2Var = dVar.f82941w;
        if (a2Var != null) {
            a2Var.f(null);
        }
        dVar.f82941w = dVar.l2(new s0(dVar, null, 1), new yi5.b(26));
        h3().loadUrl(url2, q0.c(new Pair("X-Reverywhere-Authorization", str)));
        a0 a0VarG3 = g3();
        a0VarG3.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        a0VarG3.e = System.currentTimeMillis();
        a0.Companion.getClass();
        String str2 = "";
        Intrinsics.checkNotNullParameter(url2, "url");
        try {
            String host = new URI(url2).getHost();
            if (host != null) {
                str2 = host;
            }
        } catch (Exception unused) {
        }
        a0VarG3.f173774h = str2;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!this.f82914a0) {
            return false;
        }
        h3().evaluateJavascript("javascript:didBackButtonClick()", null);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        k9 k9Var = k9.Reverywhere;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W2(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r5 != r0) goto L7a
            jfb.h0 r1 = r4.R2()
            com.revolut.feature.retail.reverywhere.impl.web_app.d r1 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) r1
            r1.getClass()
            r1 = 0
            if (r5 == r0) goto L12
        L10:
            r5 = r1
            goto L69
        L12:
            r5 = -1
            if (r6 != r5) goto L10
            if (r7 == 0) goto L10
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            android.content.ClipData r5 = r7.getClipData()
            if (r5 == 0) goto L5f
            int r6 = r5.getItemCount()
            if (r6 <= 0) goto L5f
            int r6 = r5.getItemCount()
            r0 = 0
            kotlin.ranges.IntRange r6 = kotlin.ranges.f.o(r0, r6)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            vim.f r6 = r6.iterator()
        L3a:
            boolean r3 = r6.f289625c
            if (r3 == 0) goto L50
            int r3 = r6.nextInt()
            android.content.ClipData$Item r3 = r5.getItemAt(r3)
            android.net.Uri r3 = r3.getUri()
            if (r3 == 0) goto L3a
            r2.add(r3)
            goto L3a
        L50:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L5f
            android.net.Uri[] r5 = new android.net.Uri[r0]
            java.lang.Object[] r5 = r2.toArray(r5)
            android.net.Uri[] r5 = (android.net.Uri[]) r5
            goto L69
        L5f:
            android.net.Uri r5 = r7.getData()
            if (r5 == 0) goto L10
            android.net.Uri[] r5 = new android.net.Uri[]{r5}
        L69:
            java.lang.Object r6 = r4.P
            java.lang.Object r6 = r6.getValue()
            jfb.d1 r6 = (jfb.d1) r6
            android.webkit.ValueCallback r7 = r6.f173797b
            if (r7 == 0) goto L78
            r7.onReceiveValue(r5)
        L78:
            r6.f173797b = r1
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen.W2(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a0 a0VarG3 = g3();
        l80.e eVar = a0VarG3.f173771b;
        a0VarG3.d = System.currentTimeMillis();
        a0VarG3.f173775j = y.u(a0VarG3.f173772c, "toString(...)");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView reverywhereRecyclerView = d3().f4019c;
        Intrinsics.checkNotNullExpressionValue(reverywhereRecyclerView, "reverywhereRecyclerView");
        yp0.y.h(reverywhereRecyclerView, (z4l.j) this.f0.getValue(), new LinearLayoutManager(reverywhereRecyclerView.getContext()));
        g1 g1Var = (g1) this.Q.getValue();
        WebView webView = h3();
        ReverywhereWebAppScreenContract$InputData reverywhereWebAppScreenContract$InputData = this.K;
        String appName = reverywhereWebAppScreenContract$InputData.getF82922b();
        g1Var.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(appName, "appName");
        boolean z = false;
        if (WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
            String lowerCase = appName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Profile orCreateProfile = ProfileStore.getInstance().getOrCreateProfile(j6.a.q("reverywhere_", kotlin.text.a0.D(lowerCase, ":", "_", false)));
            Intrinsics.checkNotNullExpressionValue(orCreateProfile, "getOrCreateProfile(...)");
            WebViewCompat.setProfile(webView, orCreateProfile.getName());
        }
        x xVar = (x) this.R.getValue();
        WebView webView2 = h3();
        boolean d = reverywhereWebAppScreenContract$InputData.getD();
        xVar.getClass();
        Intrinsics.checkNotNullParameter(webView2, "webView");
        if (WebViewFeature.isFeatureSupported("DOCUMENT_START_SCRIPT")) {
            WebViewCompat.addDocumentStartJavaScript(webView2, xVar.a(d), y0.b("*"));
            z = true;
        }
        this.V = z;
        WebView webViewH3 = h3();
        Intrinsics.checkNotNullParameter(webViewH3, "<this>");
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewH3, true);
        webViewH3.clearCache(true);
        WebSettings settings = webViewH3.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        settings.setSupportMultipleWindows(true);
        h3().setWebViewClient(i3());
        WebView webViewH32 = h3();
        ?? r06 = this.P;
        webViewH32.setWebChromeClient((d1) r06.getValue());
        ((d1) r06.getValue()).f173798c = new b0(this, 0);
        h3().addJavascriptInterface(this.c0, "AndroidJSReceiver");
        h3().addJavascriptInterface((jfb.c) this.f82916d0.getValue(), "AndroidPerf");
        String str = ((b) ((j2) ((d) R2()).B.f22677a).getValue()).f82928a;
        r rVar = new r(str, reverywhereWebAppScreenContract$InputData.getF82923c(), new d0(this, 0));
        rVar.d(h3());
        ArrayList arrayList = this.W;
        arrayList.add(rVar);
        if (((jte.d) ((d) R2()).u.f134792c).c(ReverywhereApi$Toggles$ReverywhereLocationSharing.f82879c)) {
            jfb.o oVar = new jfb.o((ffb.d) this.T.getValue(), new iyi.j(this, null, 10), str, new c0(this, 11));
            oVar.d(h3());
            arrayList.add(oVar);
        }
        f1 f1VarI3 = i3();
        c0 c0Var = new c0(this, 10);
        f1VarI3.getClass();
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        f1VarI3.f173807b = c0Var;
        f1 f1VarI32 = i3();
        c0 c0Var2 = new c0(this, 12);
        f1VarI32.getClass();
        Intrinsics.checkNotNullParameter(c0Var2, "<set-?>");
        f1VarI32.f173808c = c0Var2;
        f1 f1VarI33 = i3();
        d0 d0Var = new d0(this, 1);
        f1VarI33.getClass();
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        f1VarI33.d = d0Var;
        f1 f1VarI34 = i3();
        c0 c0Var3 = new c0(this, 13);
        f1VarI34.getClass();
        Intrinsics.checkNotNullParameter(c0Var3, "<set-?>");
        f1VarI34.e = c0Var3;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        this.X.removeCallbacks(this.f82915b0);
        ArrayList arrayList = this.W;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((l1) it8.next()).f(h3());
        }
        arrayList.clear();
        h3().clearCache(true);
        h3().destroy();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        this.U = false;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.U = true;
        ViewController.P2(this, rd0.e.b(this.f82917e0.f52371h.f121375b), new jfb.f0(this, null), 3);
        ViewController.P2(this, ((d) R2()).f82937q.Z2(), new j2c.b(this, null, 22), 3);
    }

    public final afb.a d3() {
        ViewBinding value = this.N.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (afb.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final dfb.d R1() {
        return (dfb.d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final jfb.h0 R2() {
        return (jfb.h0) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a0 g3() {
        return (a0) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    public final WebView h3() {
        WebView reverywhereWebView = d3().f;
        Intrinsics.checkNotNullExpressionValue(reverywhereWebView, "reverywhereWebView");
        return reverywhereWebView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f1 i3() {
        return (f1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (cli.a0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.TRUE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(!this.K.getD());
    }
}
