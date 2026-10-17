package com.revolut.feature.global_markets.impl.ui.redesign.screen.market;

import aii.q;
import android.view.View;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IndicesBarDelegate;
import com.revolut.core.ui_kit.delegates.IndicesBarLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreenContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pvk.i;
import q87.b;
import q87.h;
import q87.k;
import q87.n;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import y77.g;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/redesign/screen/market/MarketDetailsRedesignScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lq87/n;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarketDetailsRedesignScreen extends ViewController<q> implements c {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74599a0 = {o0.f186429a.j(new h0(MarketDetailsRedesignScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};
    public final MarketDetailsRedesignScreenContract$InputData K;
    public final int L;
    public final int M;
    public final ListSubheaderDelegate N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final RowLoadingDelegate Q;
    public final TextDelegate R;
    public final FixedTabsDelegate S;
    public final IndicesBarDelegate T;
    public final TrendViewDelegate U;
    public final ScrollerDelegate V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final j Z;

    public MarketDetailsRedesignScreen(MarketDetailsRedesignScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new ListSubheaderDelegate();
        this.O = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new RowLoadingDelegate();
        this.R = new TextDelegate();
        this.S = new FixedTabsDelegate();
        this.T = new IndicesBarDelegate();
        this.U = new TrendViewDelegate(1000L);
        this.V = new ScrollerDelegate(u.c(new ContainerDelegate(u.c(rowDelegate), null, 6)), false);
        s.t(this, q87.c.f);
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: q87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarketDetailsRedesignScreen f243013b;

            {
                this.f243013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MarketDetailsRedesignScreen marketDetailsRedesignScreen = this.f243013b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MarketDetailsRedesignScreen.f74599a0;
                        qji.b bVarU2 = marketDetailsRedesignScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.global_markets.impl.ui.redesign.screen.market.di.MarketDetailsRedesignScreenInjector");
                        y77.d dVar = (y77.d) bVarU2;
                        y77.c cVar = dVar.f311377a;
                        y77.d dVar2 = dVar.f311378b;
                        MarketDetailsRedesignScreenContract$InputData marketDetailsRedesignScreenContract$InputData = marketDetailsRedesignScreen.K;
                        h87.d dVar3 = new h87.d(marketDetailsRedesignScreen.O, marketDetailsRedesignScreen.N, marketDetailsRedesignScreen.P, marketDetailsRedesignScreen.Q);
                        avk.j jVar = marketDetailsRedesignScreen.Z;
                        marketDetailsRedesignScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.g(cVar, dVar2, marketDetailsRedesignScreenContract$InputData, dVar3, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = MarketDetailsRedesignScreen.f74599a0;
                        return (k) ((y77.g) marketDetailsRedesignScreen.W.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = MarketDetailsRedesignScreen.f74599a0;
                        MarketDetailsRedesignScreen marketDetailsRedesignScreen2 = this.f243013b;
                        return tki.g.a(marketDetailsRedesignScreen2, marketDetailsRedesignScreen2.d(), zhm.v.k(marketDetailsRedesignScreen2.O, marketDetailsRedesignScreen2.N, marketDetailsRedesignScreen2.P, marketDetailsRedesignScreen2.Q, marketDetailsRedesignScreen2.R, marketDetailsRedesignScreen2.V, marketDetailsRedesignScreen2.S, marketDetailsRedesignScreen2.T, new IndicesBarLoadingDelegate(), marketDetailsRedesignScreen2.U), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: q87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarketDetailsRedesignScreen f243013b;

            {
                this.f243013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MarketDetailsRedesignScreen marketDetailsRedesignScreen = this.f243013b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarketDetailsRedesignScreen.f74599a0;
                        qji.b bVarU2 = marketDetailsRedesignScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.global_markets.impl.ui.redesign.screen.market.di.MarketDetailsRedesignScreenInjector");
                        y77.d dVar = (y77.d) bVarU2;
                        y77.c cVar = dVar.f311377a;
                        y77.d dVar2 = dVar.f311378b;
                        MarketDetailsRedesignScreenContract$InputData marketDetailsRedesignScreenContract$InputData = marketDetailsRedesignScreen.K;
                        h87.d dVar3 = new h87.d(marketDetailsRedesignScreen.O, marketDetailsRedesignScreen.N, marketDetailsRedesignScreen.P, marketDetailsRedesignScreen.Q);
                        avk.j jVar = marketDetailsRedesignScreen.Z;
                        marketDetailsRedesignScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.g(cVar, dVar2, marketDetailsRedesignScreenContract$InputData, dVar3, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = MarketDetailsRedesignScreen.f74599a0;
                        return (k) ((y77.g) marketDetailsRedesignScreen.W.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = MarketDetailsRedesignScreen.f74599a0;
                        MarketDetailsRedesignScreen marketDetailsRedesignScreen2 = this.f243013b;
                        return tki.g.a(marketDetailsRedesignScreen2, marketDetailsRedesignScreen2.d(), zhm.v.k(marketDetailsRedesignScreen2.O, marketDetailsRedesignScreen2.N, marketDetailsRedesignScreen2.P, marketDetailsRedesignScreen2.Q, marketDetailsRedesignScreen2.R, marketDetailsRedesignScreen2.V, marketDetailsRedesignScreen2.S, marketDetailsRedesignScreen2.T, new IndicesBarLoadingDelegate(), marketDetailsRedesignScreen2.U), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: q87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarketDetailsRedesignScreen f243013b;

            {
                this.f243013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MarketDetailsRedesignScreen marketDetailsRedesignScreen = this.f243013b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarketDetailsRedesignScreen.f74599a0;
                        qji.b bVarU2 = marketDetailsRedesignScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.global_markets.impl.ui.redesign.screen.market.di.MarketDetailsRedesignScreenInjector");
                        y77.d dVar = (y77.d) bVarU2;
                        y77.c cVar = dVar.f311377a;
                        y77.d dVar2 = dVar.f311378b;
                        MarketDetailsRedesignScreenContract$InputData marketDetailsRedesignScreenContract$InputData = marketDetailsRedesignScreen.K;
                        h87.d dVar3 = new h87.d(marketDetailsRedesignScreen.O, marketDetailsRedesignScreen.N, marketDetailsRedesignScreen.P, marketDetailsRedesignScreen.Q);
                        avk.j jVar = marketDetailsRedesignScreen.Z;
                        marketDetailsRedesignScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new y77.g(cVar, dVar2, marketDetailsRedesignScreenContract$InputData, dVar3, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = MarketDetailsRedesignScreen.f74599a0;
                        return (k) ((y77.g) marketDetailsRedesignScreen.W.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = MarketDetailsRedesignScreen.f74599a0;
                        MarketDetailsRedesignScreen marketDetailsRedesignScreen2 = this.f243013b;
                        return tki.g.a(marketDetailsRedesignScreen2, marketDetailsRedesignScreen2.d(), zhm.v.k(marketDetailsRedesignScreen2.O, marketDetailsRedesignScreen2.N, marketDetailsRedesignScreen2.P, marketDetailsRedesignScreen2.Q, marketDetailsRedesignScreen2.R, marketDetailsRedesignScreen2.V, marketDetailsRedesignScreen2.S, marketDetailsRedesignScreen2.T, new IndicesBarLoadingDelegate(), marketDetailsRedesignScreen2.U), 0, null, null, null, 60);
                }
            }
        });
        this.Z = new j(this, 22);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i2 = b.f243014a[this.K.f74600a.ordinal()];
        if (i2 == 1) {
            i = R$string.invest_markets_tabs_united_states_title;
        } else if (i2 == 2) {
            i = R$string.invest_markets_tabs_europe_title;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.invest_markets_tabs_asia_pacific_title;
        }
        pd.b.p(view, new TextLocalisedClause(i, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        FullScreenStateDelegate fullScreenStateDelegate = this.O;
        Continuation continuation = null;
        ViewController.P2(this, new i(rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), 28), new q87.g(this, null, 0), 3);
        ViewController.P2(this, new i(rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), 27), new h(this, null), 3);
        ViewController.P2(this, new i(rd0.e.b(this.N.d), 29), new q87.g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52339c.f121375b), new q87.i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.T.f52516c.f56192c), new q87.i(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Y.getValue();
    }
}
