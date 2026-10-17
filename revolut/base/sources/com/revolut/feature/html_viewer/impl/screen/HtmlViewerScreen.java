package com.revolut.feature.html_viewer.impl.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreen;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jd7.b;
import jd7.c;
import jd7.i;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/html_viewer/impl/screen/HtmlViewerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ljd7/i;", "feature_html_viewer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HtmlViewerScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(HtmlViewerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final HtmlViewerScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final RowLoadingDelegate N;
    public final FullScreenStateDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public HtmlViewerScreen(HtmlViewerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new ja3.b(12));
        this.N = new RowLoadingDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: jd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlViewerScreen f172984b;

            {
                this.f172984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HtmlViewerScreen htmlViewerScreen = this.f172984b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HtmlViewerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(htmlViewerScreen.m2()).a().get(id7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", id7.a.class, " is not found"));
                        }
                        id7.a aVar3 = ((id7.a) aVar2.b()).f160434c;
                        HtmlViewerScreenContract$InputData htmlViewerScreenContract$InputData = htmlViewerScreen.K;
                        htmlViewerScreenContract$InputData.getClass();
                        return new id7.b(aVar3, htmlViewerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = HtmlViewerScreen.T;
                        return (h) ((id7.b) htmlViewerScreen.Q.getValue()).f160436b.get();
                    default:
                        KProperty[] kPropertyArr3 = HtmlViewerScreen.T;
                        HtmlViewerScreen htmlViewerScreen2 = this.f172984b;
                        return dli.f.a(htmlViewerScreen2, (h) htmlViewerScreen2.R.getValue(), v.k((WebViewDelegate) htmlViewerScreen2.M.getValue(), htmlViewerScreen2.N, htmlViewerScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: jd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlViewerScreen f172984b;

            {
                this.f172984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HtmlViewerScreen htmlViewerScreen = this.f172984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HtmlViewerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(htmlViewerScreen.m2()).a().get(id7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", id7.a.class, " is not found"));
                        }
                        id7.a aVar3 = ((id7.a) aVar2.b()).f160434c;
                        HtmlViewerScreenContract$InputData htmlViewerScreenContract$InputData = htmlViewerScreen.K;
                        htmlViewerScreenContract$InputData.getClass();
                        return new id7.b(aVar3, htmlViewerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = HtmlViewerScreen.T;
                        return (h) ((id7.b) htmlViewerScreen.Q.getValue()).f160436b.get();
                    default:
                        KProperty[] kPropertyArr3 = HtmlViewerScreen.T;
                        HtmlViewerScreen htmlViewerScreen2 = this.f172984b;
                        return dli.f.a(htmlViewerScreen2, (h) htmlViewerScreen2.R.getValue(), v.k((WebViewDelegate) htmlViewerScreen2.M.getValue(), htmlViewerScreen2.N, htmlViewerScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: jd7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HtmlViewerScreen f172984b;

            {
                this.f172984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                HtmlViewerScreen htmlViewerScreen = this.f172984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HtmlViewerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(htmlViewerScreen.m2()).a().get(id7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", id7.a.class, " is not found"));
                        }
                        id7.a aVar3 = ((id7.a) aVar2.b()).f160434c;
                        HtmlViewerScreenContract$InputData htmlViewerScreenContract$InputData = htmlViewerScreen.K;
                        htmlViewerScreenContract$InputData.getClass();
                        return new id7.b(aVar3, htmlViewerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = HtmlViewerScreen.T;
                        return (h) ((id7.b) htmlViewerScreen.Q.getValue()).f160436b.get();
                    default:
                        KProperty[] kPropertyArr3 = HtmlViewerScreen.T;
                        HtmlViewerScreen htmlViewerScreen2 = this.f172984b;
                        return dli.f.a(htmlViewerScreen2, (h) htmlViewerScreen2.R.getValue(), v.k((WebViewDelegate) htmlViewerScreen2.M.getValue(), htmlViewerScreen2.N, htmlViewerScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (id7.b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (jd7.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        HtmlViewerScreenContract$InputData htmlViewerScreenContract$InputData = this.K;
        navBarWithToolbar.setTitle(htmlViewerScreenContract$InputData.f74753b, null);
        navBarWithToolbar.setToolbarTitle(htmlViewerScreenContract$InputData.f74753b);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new j2c.b(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(((WebViewDelegate) this.M.getValue()).f), new j82.q(this, continuation, 10), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
