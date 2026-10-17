package com.revolut.feature.global_markets.impl.ui.screen.index_overview;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import k0h.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u4e.i;
import u6h.h;
import u7k.f0;
import u87.b;
import u87.c;
import u87.d;
import vc.s;
import xki.e;
import y77.f;
import z0h.s1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/screen/index_overview/IndexOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lz0h/s1;", "Lk0h/g;", "Ldli/a;", "Lu87/g;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndexOverviewScreen extends ViewController<q> implements s1, g, a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74610a0 = {o0.f186429a.j(new h0(IndexOverviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};
    public final int K;
    public final boolean L;
    public final Object M;
    public final Object N;
    public final TextDelegate O;
    public final PlainTextDelegate P;
    public final FullScreenStateDelegate Q;
    public final ListSubheaderDelegate R;
    public final LargeActionButtonDelegate S;
    public final SmallCardDelegate T;
    public final SwipeToActionDelegate U;
    public final Object V;
    public final TrendViewDelegate W;
    public final FixedTabsDelegate X;
    public final HeaderDelegate Y;
    public final Object Z;

    public IndexOverviewScreen(IndexOverviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_view;
        s.t(this, b.f);
        this.L = true;
        this.M = w.y0(new u1.g(this, inputData, 19));
        Lazy lazyY0 = w.y0(new h(9));
        this.N = lazyY0;
        this.O = new TextDelegate();
        this.P = new PlainTextDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = new ListSubheaderDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new SmallCardDelegate(null);
        this.U = new SwipeToActionDelegate((RowDelegate) lazyY0.getValue(), false);
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: u87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexOverviewScreen f278128b;

            {
                this.f278128b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IndexOverviewScreen.f74610a0;
                        return (f) ((y77.f) this.f278128b.M.getValue()).f311397r.get();
                    default:
                        KProperty[] kPropertyArr2 = IndexOverviewScreen.f74610a0;
                        IndexOverviewScreen indexOverviewScreen = this.f278128b;
                        return dli.f.a(indexOverviewScreen, (f) indexOverviewScreen.V.getValue(), v.k((RowDelegate) indexOverviewScreen.N.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), indexOverviewScreen.O, indexOverviewScreen.P, new PlainTextLoadingDelegate(), indexOverviewScreen.Q, indexOverviewScreen.W, indexOverviewScreen.X, indexOverviewScreen.Y, new HeaderLoadingDelegate(), new ListSubheaderLoadingDelegate(), indexOverviewScreen.R, indexOverviewScreen.S, indexOverviewScreen.T, indexOverviewScreen.U), 0, null, null, null, 60);
                }
            }
        });
        this.W = new TrendViewDelegate(1000L);
        this.X = new FixedTabsDelegate();
        this.Y = new HeaderDelegate();
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: u87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexOverviewScreen f278128b;

            {
                this.f278128b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IndexOverviewScreen.f74610a0;
                        return (f) ((y77.f) this.f278128b.M.getValue()).f311397r.get();
                    default:
                        KProperty[] kPropertyArr2 = IndexOverviewScreen.f74610a0;
                        IndexOverviewScreen indexOverviewScreen = this.f278128b;
                        return dli.f.a(indexOverviewScreen, (f) indexOverviewScreen.V.getValue(), v.k((RowDelegate) indexOverviewScreen.N.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), indexOverviewScreen.O, indexOverviewScreen.P, new PlainTextLoadingDelegate(), indexOverviewScreen.Q, indexOverviewScreen.W, indexOverviewScreen.X, indexOverviewScreen.Y, new HeaderLoadingDelegate(), new ListSubheaderLoadingDelegate(), indexOverviewScreen.R, indexOverviewScreen.S, indexOverviewScreen.T, indexOverviewScreen.U), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u87.g uiState = (u87.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (u87.f) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((f) this.M.getValue()).f311391j.get()).d(u.c(this.S));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarFilter = this.Q.f52371h.f121375b.filter(new u3a.q(new i(27), 16));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f52339c.f121375b), null, new f0(this, null, 6), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.O.d);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
