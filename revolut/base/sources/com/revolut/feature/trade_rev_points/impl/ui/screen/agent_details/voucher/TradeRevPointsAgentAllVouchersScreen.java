package com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.impl.R$id;
import com.revolut.feature.trade_rev_points.impl.R$layout;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ip0.md;
import j2f.b;
import j2f.c;
import j2f.f;
import j2f.g;
import j2f.i;
import j2f.j;
import j2f.k;
import j2f.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t1f.d;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/voucher/TradeRevPointsAgentAllVouchersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lj2f/l;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsAgentAllVouchersScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TradeRevPointsAgentAllVouchersScreen.class, "binding", "getBinding()Lcom/revolut/feature/trade_rev_points/impl/databinding/ScreenTradeRevPointsAgentAllVouchersBinding;", 0))};
    public final int K;
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public TradeRevPointsAgentAllVouchersScreen(TradeRevPointsAgentAllVouchersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_trade_rev_points_agent_all_vouchers;
        this.L = new RowDelegate(null, null, 7);
        this.M = new FullScreenStateDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAgentAllVouchersScreen f170844b;

            {
                this.f170844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAgentAllVouchersScreen.R;
                        TradeRevPointsAgentAllVouchersScreen tradeRevPointsAgentAllVouchersScreen = this.f170844b;
                        return dli.f.a(tradeRevPointsAgentAllVouchersScreen, (k) tradeRevPointsAgentAllVouchersScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), tradeRevPointsAgentAllVouchersScreen.L, new RowLoadingDelegate(), tradeRevPointsAgentAllVouchersScreen.M), R$id.tradeRevPointsAgentAllVouchers_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAgentAllVouchersScreen.R;
                        return (k) ((t1f.d) this.f170844b.P.getValue()).f267286c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new md(this, inputData, 23));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: j2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAgentAllVouchersScreen f170844b;

            {
                this.f170844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAgentAllVouchersScreen.R;
                        TradeRevPointsAgentAllVouchersScreen tradeRevPointsAgentAllVouchersScreen = this.f170844b;
                        return dli.f.a(tradeRevPointsAgentAllVouchersScreen, (k) tradeRevPointsAgentAllVouchersScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), tradeRevPointsAgentAllVouchersScreen.L, new RowLoadingDelegate(), tradeRevPointsAgentAllVouchersScreen.M), R$id.tradeRevPointsAgentAllVouchers_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAgentAllVouchersScreen.R;
                        return (k) ((t1f.d) this.f170844b.P.getValue()).f267286c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = qVar instanceof j ? (j) qVar : null;
        if (jVar == null || jVar.f170852a) {
            i iVar = uiState.f170854b;
            if (iVar instanceof f) {
                NavBarWithToolbar navBarWithToolbar = d3().f241437b;
                navBarWithToolbar.l0();
                yy0.i iVar2 = yy0.l.Companion;
                f fVar = (f) iVar;
                TextLocalisedClause textLocalisedClause = fVar.f170848b;
                UrlImage urlImage = fVar.f170847a;
                iVar2.getClass();
                navBarWithToolbar.setEndImage(yy0.i.a(urlImage));
                navBarWithToolbar.setTitle(textLocalisedClause, null);
                navBarWithToolbar.setToolbarTitle(textLocalisedClause);
                navBarWithToolbar.setDescriptionText(fVar.f170849c);
                navBarWithToolbar.setDescriptionVisible(true);
                return;
            }
            if (iVar instanceof g) {
                NavBarWithToolbar tradeRevPointsAgentAllVouchersNavBar = d3().f241437b;
                Intrinsics.checkNotNullExpressionValue(tradeRevPointsAgentAllVouchersNavBar, "tradeRevPointsAgentAllVouchersNavBar");
                t3 t3Var = t3.DEFAULT;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                tradeRevPointsAgentAllVouchersNavBar.I0(t3Var, false);
                return;
            }
            if (!(iVar instanceof j2f.h)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar tradeRevPointsAgentAllVouchersNavBar2 = d3().f241437b;
            Intrinsics.checkNotNullExpressionValue(tradeRevPointsAgentAllVouchersNavBar2, "tradeRevPointsAgentAllVouchersNavBar");
            t3 t3Var2 = t3.DEFAULT;
            NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
            tradeRevPointsAgentAllVouchersNavBar2.I0(t3Var2, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f241437b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.miles_my_cards_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.miles_my_cards_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f241437b.f59410q), new j2c.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new j2f.d(this, null), 3);
    }

    public final q1f.c d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q1f.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
