package com.revolut.feature.wealth.ui.impl.trade_redesign.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.b;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BasketDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.ui.impl.R$layout;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.TradeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import hd.r;
import imh.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/trade_redesign/screen/TradeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Limh/f;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] p0 = {o0.f186429a.j(new h0(TradeScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth/ui/impl/databinding/ScreenWealthTradeBinding;", 0))};
    public final Lazy K;
    public final Object L;
    public final int M;
    public final h N;
    public final ActionCardDelegate O;
    public final AirTipDelegate P;
    public final ActionWidgetDelegate Q;
    public final BasketDelegate R;
    public final HeroBannerDelegate S;
    public final HeroBannerLoadingDelegate T;
    public final CellDetailsDelegate U;
    public final TwinHorizontalButtonDelegate V;
    public final LargeActionButtonDelegate W;
    public final ActionsDelegate X;
    public final ListSubheaderLoadingDelegate Y;
    public final ListSubheaderDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f96025a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowLoadingDelegate f96026b0;
    public final HybridTileDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ReferralContactDelegate f96027d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SmallStockCardDelegate f96028e0;
    public final SmallActionButtonDelegate f0;
    public final ScrollerBoxDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ScrollerDelegate f96029h0;
    public final FullScreenStateDelegate i0;
    public final TextDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final SwipeToActionDelegate f96030k0;
    public final Lazy l0;
    public final r m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final j f96031n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final b f96032o0;

    public TradeScreen(TradeScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = yhm.j.b(new i1d.b(this, input, 26));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: imh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeScreen f162453b;

            {
                this.f162453b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TradeScreen.p0;
                        return (e) ((mkh.o) ((smh.a) this.f162453b.K.getValue())).M0.get();
                    default:
                        KProperty[] kPropertyArr2 = TradeScreen.p0;
                        TradeScreen tradeScreen = this.f162453b;
                        return tki.g.a(tradeScreen, (e) ((mkh.o) ((smh.a) tradeScreen.K.getValue())).M0.get(), zhm.v.k(tradeScreen.X, tradeScreen.P, tradeScreen.f96025a0, tradeScreen.f96026b0, tradeScreen.c0, tradeScreen.Y, tradeScreen.Z, tradeScreen.f96029h0, tradeScreen.i0, tradeScreen.g0, tradeScreen.j0, tradeScreen.Q, tradeScreen.S, tradeScreen.T, tradeScreen.f0, tradeScreen.f96030k0), 0, null, null, null, 60);
                }
            }
        });
        this.M = R$layout.screen_wealth_trade;
        this.N = s.t(this, imh.b.f);
        ActionCardDelegate actionCardDelegate = new ActionCardDelegate();
        this.O = actionCardDelegate;
        this.P = new AirTipDelegate();
        this.Q = new ActionWidgetDelegate();
        BasketDelegate basketDelegate = new BasketDelegate();
        this.R = basketDelegate;
        this.S = new HeroBannerDelegate(0);
        this.T = new HeroBannerLoadingDelegate();
        this.U = new CellDetailsDelegate();
        this.V = new TwinHorizontalButtonDelegate();
        this.W = new LargeActionButtonDelegate();
        this.X = new ActionsDelegate();
        this.Y = new ListSubheaderLoadingDelegate();
        this.Z = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f96025a0 = rowDelegate;
        this.f96026b0 = new RowLoadingDelegate();
        this.c0 = new HybridTileDelegate();
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.f96027d0 = referralContactDelegate;
        SmallStockCardDelegate smallStockCardDelegate = new SmallStockCardDelegate();
        this.f96028e0 = smallStockCardDelegate;
        this.f0 = new SmallActionButtonDelegate();
        this.g0 = new ScrollerBoxDelegate(u.c(referralContactDelegate));
        final int i2 = 1;
        this.f96029h0 = new ScrollerDelegate(v.k(actionCardDelegate, basketDelegate, smallStockCardDelegate), false);
        this.i0 = new FullScreenStateDelegate();
        this.j0 = new TextDelegate();
        this.f96030k0 = new SwipeToActionDelegate(rowDelegate, false);
        this.l0 = yhm.j.b(new Function0(this) { // from class: imh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeScreen f162453b;

            {
                this.f162453b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeScreen.p0;
                        return (e) ((mkh.o) ((smh.a) this.f162453b.K.getValue())).M0.get();
                    default:
                        KProperty[] kPropertyArr2 = TradeScreen.p0;
                        TradeScreen tradeScreen = this.f162453b;
                        return tki.g.a(tradeScreen, (e) ((mkh.o) ((smh.a) tradeScreen.K.getValue())).M0.get(), zhm.v.k(tradeScreen.X, tradeScreen.P, tradeScreen.f96025a0, tradeScreen.f96026b0, tradeScreen.c0, tradeScreen.Y, tradeScreen.Z, tradeScreen.f96029h0, tradeScreen.i0, tradeScreen.g0, tradeScreen.j0, tradeScreen.Q, tradeScreen.S, tradeScreen.T, tradeScreen.f0, tradeScreen.f96030k0), 0, null, null, null, 60);
                }
            }
        });
        r rVar = new r();
        rVar.f151364a = this.Z;
        rVar.f151365b = new ProgressStepVerticalDelegate();
        rVar.f151366c = this.W;
        rVar.d = this.U;
        rVar.e = this.V;
        rVar.f = new CalendarRowDelegate();
        this.m0 = rVar;
        this.f96031n0 = new j(this, 12);
        this.f96032o0 = new b(this, 2);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f185066b;
        navBarWithToolbar.setHint(uiState.f162471b);
        navBarWithToolbar.setFiltersState(uiState.f162472c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (smh.a) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (imh.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f185066b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_invest_trade_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_invest_trade_header_title, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        ((j60.a) ((mkh.o) ((smh.a) this.K.getValue())).P.get()).d(v.k(this.U, this.W, this.V));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f185066b.f59410q), new imh.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f185066b.u0()), new imh.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f185066b.v0()), new imh.c(this, null, 2), 3);
        d3().f185066b.f59417v0 = false;
    }

    public final kkh.a d3() {
        ViewBinding value = this.N.getValue(this, p0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kkh.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.l0.getValue();
    }
}
