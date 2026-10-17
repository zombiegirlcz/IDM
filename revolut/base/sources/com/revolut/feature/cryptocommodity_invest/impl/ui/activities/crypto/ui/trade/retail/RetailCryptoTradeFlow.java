package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail;

import android.view.View;
import android.view.Window;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw0.y9;
import cli.o;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.R$id;
import com.revolut.feature.cryptocommodity_invest.impl.R$layout;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.RetailCryptoTradeFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import ix5.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mx5.c;
import mx5.f;
import qji.b;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/retail/RetailCryptoTradeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liw5/a;", "Lwki/a;", "Lmx5/f;", "<init>", "()V", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailCryptoTradeFlow extends ViewController<iw5.a> implements wki.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(RetailCryptoTradeFlow.class, "binding", "getBinding()Lcom/revolut/feature/cryptocommodity_invest/impl/databinding/FlowRetailCryptoTradeBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.flow_retail_crypto_trade;
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jw5.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/cryptocommodity_invest/impl/databinding/FlowRetailCryptoTradeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.flowRetailCryptoTrade_container;
            if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.flowRetailCryptoTrade_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    return new jw5.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RetailCryptoTradeFlow() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailCryptoTradeFlow f210208b;

            {
                this.f210208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RetailCryptoTradeFlow retailCryptoTradeFlow = this.f210208b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RetailCryptoTradeFlow.P;
                        qji.b bVarU2 = retailCryptoTradeFlow.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.di.RetailCryptoTradeFlowInjector");
                        ix5.e eVar = ((ix5.e) bVarU2).f169361c;
                        ix5.g gVar = new ix5.g();
                        gVar.f169371a = e4m.b.b(new iwb.b(eVar, gVar, 1, 12));
                        gVar.f169372b = e4m.b.b(new iwb.b(eVar, gVar, 0, 12));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = RetailCryptoTradeFlow.P;
                        return (e) ((ix5.g) retailCryptoTradeFlow.M.getValue()).f169372b.get();
                    default:
                        KProperty[] kPropertyArr3 = RetailCryptoTradeFlow.P;
                        return md6.s.a(retailCryptoTradeFlow, retailCryptoTradeFlow.d(), R$id.flowRetailCryptoTrade_container, 4);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailCryptoTradeFlow f210208b;

            {
                this.f210208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RetailCryptoTradeFlow retailCryptoTradeFlow = this.f210208b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RetailCryptoTradeFlow.P;
                        qji.b bVarU2 = retailCryptoTradeFlow.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.di.RetailCryptoTradeFlowInjector");
                        ix5.e eVar = ((ix5.e) bVarU2).f169361c;
                        ix5.g gVar = new ix5.g();
                        gVar.f169371a = e4m.b.b(new iwb.b(eVar, gVar, 1, 12));
                        gVar.f169372b = e4m.b.b(new iwb.b(eVar, gVar, 0, 12));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = RetailCryptoTradeFlow.P;
                        return (e) ((ix5.g) retailCryptoTradeFlow.M.getValue()).f169372b.get();
                    default:
                        KProperty[] kPropertyArr3 = RetailCryptoTradeFlow.P;
                        return md6.s.a(retailCryptoTradeFlow, retailCryptoTradeFlow.d(), R$id.flowRetailCryptoTrade_container, 4);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: mx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailCryptoTradeFlow f210208b;

            {
                this.f210208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RetailCryptoTradeFlow retailCryptoTradeFlow = this.f210208b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RetailCryptoTradeFlow.P;
                        qji.b bVarU2 = retailCryptoTradeFlow.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.di.RetailCryptoTradeFlowInjector");
                        ix5.e eVar = ((ix5.e) bVarU2).f169361c;
                        ix5.g gVar = new ix5.g();
                        gVar.f169371a = e4m.b.b(new iwb.b(eVar, gVar, 1, 12));
                        gVar.f169372b = e4m.b.b(new iwb.b(eVar, gVar, 0, 12));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = RetailCryptoTradeFlow.P;
                        return (e) ((ix5.g) retailCryptoTradeFlow.M.getValue()).f169372b.get();
                    default:
                        KProperty[] kPropertyArr3 = RetailCryptoTradeFlow.P;
                        return md6.s.a(retailCryptoTradeFlow, retailCryptoTradeFlow.d(), R$id.flowRetailCryptoTrade_container, 4);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f178927b;
        Clause clause = uiState.f210212a;
        if (clause != null) {
            navBarWithToolbar.setHeaderDisclaimerSticky(clause);
        }
        navBarWithToolbar.setHint(new TextLocalisedClause(uiState.f210213b ? R$string.crypto_trade_search_focusHint : R$string.crypto_trade_search_hint, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f178927b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_home_actions_trade, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_home_actions_trade, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = true;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        dx0.e.d(window, y9.THEME);
        NavBarWithToolbar navBarWithToolbar = d3().f178927b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new mx5.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.v0()), new mx5.b(this, null, 1), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new mx5.b(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b((ihm.f) navBarWithToolbar.f59406n.f258290b), new c(this, null, 1), 3);
        ViewController.P2(this, ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) d()).f71559s, new c(this, null, 2), 3);
    }

    public final jw5.a d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jw5.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final mx5.e d() {
        return (mx5.e) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (wki.c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (wki.c) this.O.getValue();
    }
}
