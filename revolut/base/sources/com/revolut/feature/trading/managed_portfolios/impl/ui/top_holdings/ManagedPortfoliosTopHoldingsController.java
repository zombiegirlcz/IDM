package com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.R$plurals;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.ManagedPortfoliosTopHoldingsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.a;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s8f.c;
import s8f.e;
import s8f.f;
import s8f.g;
import te0.w;
import tx0.t3;
import vc.s;
import yhm.d;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/top_holdings/ManagedPortfoliosTopHoldingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ls8f/f;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ManagedPortfoliosTopHoldingsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ManagedPortfoliosTopHoldingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final RowLoadingDelegate P;
    public final RowDelegate Q;
    public final Object R;

    public ManagedPortfoliosTopHoldingsController(ManagedPortfoliosTopHoldingsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: s8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosTopHoldingsController f260982b;

            {
                this.f260982b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosTopHoldingsController.S;
                        return (g) ((w5f.q) this.f260982b.N.getValue()).f295229b.get();
                    default:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosTopHoldingsController.S;
                        ManagedPortfoliosTopHoldingsController managedPortfoliosTopHoldingsController = this.f260982b;
                        return dli.f.a(managedPortfoliosTopHoldingsController, (g) managedPortfoliosTopHoldingsController.L.getValue(), v.k(managedPortfoliosTopHoldingsController.O, managedPortfoliosTopHoldingsController.P, managedPortfoliosTopHoldingsController.Q), 0, null, null, null, 60);
                }
            }
        });
        this.M = s.t(this, s8f.b.f);
        this.N = w.y0(new s86.a(this, inputData, 1));
        this.O = new FullScreenStateDelegate();
        this.P = new RowLoadingDelegate();
        this.Q = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: s8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosTopHoldingsController f260982b;

            {
                this.f260982b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosTopHoldingsController.S;
                        return (g) ((w5f.q) this.f260982b.N.getValue()).f295229b.get();
                    default:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosTopHoldingsController.S;
                        ManagedPortfoliosTopHoldingsController managedPortfoliosTopHoldingsController = this.f260982b;
                        return dli.f.a(managedPortfoliosTopHoldingsController, (g) managedPortfoliosTopHoldingsController.L.getValue(), v.k(managedPortfoliosTopHoldingsController.O, managedPortfoliosTopHoldingsController.P, managedPortfoliosTopHoldingsController.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        a aVar = uiState.f260985a;
        if (!(aVar instanceof e)) {
            if (!Intrinsics.f(aVar, a.C0562a.f91495a)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        d3().f174539b.l0();
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.managed_portfolios_top_holdings_title_plural, Integer.valueOf(((e) aVar).f260984a), (List) null, (Style) null, 28);
        navBarWithToolbar2.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar2.setTitle(textLocalisedQuantityClause, null);
        navBarWithToolbar2.setToolbarTitle(textLocalisedQuantityClause);
        navBarWithToolbar2.setSecondDescriptionText(new TextLocalisedClause(R$string.managed_portfolios_top_holdings_subtitle, null, null, 14));
        navBarWithToolbar2.setDescriptionVisible(false);
        navBarWithToolbar2.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w5f.q) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new s1k.b(this, null, 17), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
