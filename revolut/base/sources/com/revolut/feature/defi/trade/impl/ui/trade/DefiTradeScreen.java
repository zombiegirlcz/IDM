package com.revolut.feature.defi.trade.impl.ui.trade;

import aii.q;
import android.view.View;
import android.view.Window;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.y9;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeContract$InputData;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lk0.h;
import org.jetbrains.annotations.NotNull;
import vc.s;
import vkm.j2;
import xki.e;
import xv0.w;
import yp0.v;
import yp0.y;
import yy6.f;
import z66.c;
import z66.d;
import z66.g;
import z66.i;
import z66.j;
import z66.k;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/trade/impl/ui/trade/DefiTradeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz66/d;", "Companion", "a", "feature_defi_trade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefiTradeScreen extends ViewController<q> implements dli.a {
    public final DefiTradeContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public v T;
    public w U;
    public final int V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(DefiTradeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DefiTradeScreen(DefiTradeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$style.UiKitTheme_Transparent;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: z66.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefiTradeScreen f319694b;

            {
                this.f319694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DefiTradeScreen defiTradeScreen = this.f319694b;
                switch (i2) {
                    case 0:
                        DefiTradeScreen.Companion companion = DefiTradeScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(defiTradeScreen.m2()).a().get(w66.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w66.e.class, " is not found"));
                        }
                        w66.e eVar = ((w66.e) aVar2.b()).f;
                        DefiTradeContract$InputData defiTradeContract$InputData = defiTradeScreen.K;
                        defiTradeContract$InputData.getClass();
                        return new w66.d(eVar, defiTradeContract$InputData);
                    case 1:
                        DefiTradeScreen.Companion companion2 = DefiTradeScreen.INSTANCE;
                        return (c) ((w66.d) defiTradeScreen.M.getValue()).f295399c.get();
                    default:
                        DefiTradeScreen.Companion companion3 = DefiTradeScreen.INSTANCE;
                        DefiTradeScreen defiTradeScreen2 = this.f319694b;
                        return dli.f.a(defiTradeScreen2, defiTradeScreen2.R2(), zhm.v.k((ListSubheaderDelegate) defiTradeScreen2.O.getValue(), (RowDelegate) defiTradeScreen2.P.getValue(), (FullScreenStateDelegate) defiTradeScreen2.Q.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: z66.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefiTradeScreen f319694b;

            {
                this.f319694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DefiTradeScreen defiTradeScreen = this.f319694b;
                switch (i22) {
                    case 0:
                        DefiTradeScreen.Companion companion = DefiTradeScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(defiTradeScreen.m2()).a().get(w66.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w66.e.class, " is not found"));
                        }
                        w66.e eVar = ((w66.e) aVar2.b()).f;
                        DefiTradeContract$InputData defiTradeContract$InputData = defiTradeScreen.K;
                        defiTradeContract$InputData.getClass();
                        return new w66.d(eVar, defiTradeContract$InputData);
                    case 1:
                        DefiTradeScreen.Companion companion2 = DefiTradeScreen.INSTANCE;
                        return (c) ((w66.d) defiTradeScreen.M.getValue()).f295399c.get();
                    default:
                        DefiTradeScreen.Companion companion3 = DefiTradeScreen.INSTANCE;
                        DefiTradeScreen defiTradeScreen2 = this.f319694b;
                        return dli.f.a(defiTradeScreen2, defiTradeScreen2.R2(), zhm.v.k((ListSubheaderDelegate) defiTradeScreen2.O.getValue(), (RowDelegate) defiTradeScreen2.P.getValue(), (FullScreenStateDelegate) defiTradeScreen2.Q.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = te0.w.y0(new z1i.a(17));
        this.P = te0.w.y0(new z1i.a(18));
        this.Q = te0.w.y0(new z1i.a(19));
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: z66.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefiTradeScreen f319694b;

            {
                this.f319694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DefiTradeScreen defiTradeScreen = this.f319694b;
                switch (i22) {
                    case 0:
                        DefiTradeScreen.Companion companion = DefiTradeScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(defiTradeScreen.m2()).a().get(w66.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w66.e.class, " is not found"));
                        }
                        w66.e eVar = ((w66.e) aVar2.b()).f;
                        DefiTradeContract$InputData defiTradeContract$InputData = defiTradeScreen.K;
                        defiTradeContract$InputData.getClass();
                        return new w66.d(eVar, defiTradeContract$InputData);
                    case 1:
                        DefiTradeScreen.Companion companion2 = DefiTradeScreen.INSTANCE;
                        return (c) ((w66.d) defiTradeScreen.M.getValue()).f295399c.get();
                    default:
                        DefiTradeScreen.Companion companion3 = DefiTradeScreen.INSTANCE;
                        DefiTradeScreen defiTradeScreen2 = this.f319694b;
                        return dli.f.a(defiTradeScreen2, defiTradeScreen2.R2(), zhm.v.k((ListSubheaderDelegate) defiTradeScreen2.O.getValue(), (RowDelegate) defiTradeScreen2.P.getValue(), (FullScreenStateDelegate) defiTradeScreen2.Q.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.S = s.t(this, g.f);
        this.V = R$layout.screen_recycler_navbar;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f319689a;
        if (clause != null) {
            navBarWithToolbar.setHeaderDisclaimerSticky(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w66.d) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_home_actions_trade, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_home_actions_trade, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = true;
        navBarWithToolbar.setHint(new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.crypto_trade_search_hint, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        w wVar = this.U;
        if (wVar != null) {
            wVar.c();
        }
        this.U = null;
        v vVar = this.T;
        if (vVar != null) {
            d3().f174540c.removeOnScrollListener(vVar);
        }
        this.T = null;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        dx0.e.d(window, y9.THEME);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.O.getValue()).f52707c), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.v0()), new i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new f(this, null, 12), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57336l), new i(this, null, 2), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        final int i = 0;
        this.T = y.a(recyclerView, 50, false, new Function1(this) { // from class: z66.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefiTradeScreen f319692b;

            {
                this.f319692b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                DefiTradeScreen defiTradeScreen = this.f319692b;
                switch (i2) {
                    case 0:
                        DefiTradeScreen.Companion companion = DefiTradeScreen.INSTANCE;
                        com.revolut.feature.defi.trade.impl.ui.trade.a aVar = (com.revolut.feature.defi.trade.impl.ui.trade.a) defiTradeScreen.R2();
                        lk0.g gVar = ((b) ((j2) aVar.f71892x.f22677a).getValue()).f319685b;
                        if (gVar != null && !edl.a.l(gVar)) {
                            lk0.e eVar = (lk0.e) d0.o0(gVar.f196174a);
                            if ((eVar != null ? eVar.d : null) != null) {
                                aVar.f71890t.onNext(h.b.f196176a);
                            }
                        }
                        break;
                    default:
                        List visibleItems = (List) obj2;
                        DefiTradeScreen.Companion companion2 = DefiTradeScreen.INSTANCE;
                        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
                        com.revolut.feature.defi.trade.impl.ui.trade.a aVar2 = (com.revolut.feature.defi.trade.impl.ui.trade.a) defiTradeScreen.R2();
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
                        List listJ = nkm.y.J(nkm.y.z(nkm.y.n(d0.Q(visibleItems), r.f319703a), new z55.w(5)));
                        cli.y yVar = aVar2.f71892x;
                        if (!Intrinsics.f(((b) ((j2) yVar.f22677a).getValue()).f319688h, listJ)) {
                            aVar2.H2(yVar, new x5f.m(listJ, 25));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i2 = 1;
        w wVar = new w(new z55.w(4), new Function1(this) { // from class: z66.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefiTradeScreen f319692b;

            {
                this.f319692b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                DefiTradeScreen defiTradeScreen = this.f319692b;
                switch (i22) {
                    case 0:
                        DefiTradeScreen.Companion companion = DefiTradeScreen.INSTANCE;
                        com.revolut.feature.defi.trade.impl.ui.trade.a aVar = (com.revolut.feature.defi.trade.impl.ui.trade.a) defiTradeScreen.R2();
                        lk0.g gVar = ((b) ((j2) aVar.f71892x.f22677a).getValue()).f319685b;
                        if (gVar != null && !edl.a.l(gVar)) {
                            lk0.e eVar = (lk0.e) d0.o0(gVar.f196174a);
                            if ((eVar != null ? eVar.d : null) != null) {
                                aVar.f71890t.onNext(h.b.f196176a);
                            }
                        }
                        break;
                    default:
                        List visibleItems = (List) obj2;
                        DefiTradeScreen.Companion companion2 = DefiTradeScreen.INSTANCE;
                        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
                        com.revolut.feature.defi.trade.impl.ui.trade.a aVar2 = (com.revolut.feature.defi.trade.impl.ui.trade.a) defiTradeScreen.R2();
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
                        List listJ = nkm.y.J(nkm.y.z(nkm.y.n(d0.Q(visibleItems), r.f319703a), new z55.w(5)));
                        cli.y yVar = aVar2.f71892x;
                        if (!Intrinsics.f(((b) ((j2) yVar.f22677a).getValue()).f319688h, listJ)) {
                            aVar2.H2(yVar, new x5f.m(listJ, 25));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        ScreenContentRecyclerView recyclerView2 = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        wVar.b(recyclerView2);
        this.U = wVar;
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), new z66.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.S.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c R2() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
