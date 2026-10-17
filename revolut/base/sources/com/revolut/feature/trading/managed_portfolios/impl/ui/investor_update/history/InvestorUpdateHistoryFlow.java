package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l7f.d;
import l7f.e;
import l7f.f;
import te0.w;
import vc.s;
import w5f.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll7f/e;", "Lali/g;", "Ll7f/f;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestorUpdateHistoryFlow extends ViewController<e> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(InvestorUpdateHistoryFlow.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenNavbarTabsPagerBinding;", 0))};
    public final InvestorUpdateHistoryFlowContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public InvestorUpdateHistoryFlow(InvestorUpdateHistoryFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_navbar_tabs_pager;
        this.M = s.t(this, l7f.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: l7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestorUpdateHistoryFlow f192576b;

            {
                this.f192576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestorUpdateHistoryFlow investorUpdateHistoryFlow = this.f192576b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestorUpdateHistoryFlow.Q;
                        return mif.a.a(investorUpdateHistoryFlow, 0, R$id.screenNavbarTabsPager_pager, (d) investorUpdateHistoryFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestorUpdateHistoryFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(investorUpdateHistoryFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        InvestorUpdateHistoryFlowContract$InputData investorUpdateHistoryFlowContract$InputData = investorUpdateHistoryFlow.K;
                        investorUpdateHistoryFlowContract$InputData.getClass();
                        return new w5f.b(mVar, investorUpdateHistoryFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvestorUpdateHistoryFlow.Q;
                        return (d) ((w5f.b) investorUpdateHistoryFlow.O.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: l7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestorUpdateHistoryFlow f192576b;

            {
                this.f192576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestorUpdateHistoryFlow investorUpdateHistoryFlow = this.f192576b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestorUpdateHistoryFlow.Q;
                        return mif.a.a(investorUpdateHistoryFlow, 0, R$id.screenNavbarTabsPager_pager, (d) investorUpdateHistoryFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestorUpdateHistoryFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(investorUpdateHistoryFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        InvestorUpdateHistoryFlowContract$InputData investorUpdateHistoryFlowContract$InputData = investorUpdateHistoryFlow.K;
                        investorUpdateHistoryFlowContract$InputData.getClass();
                        return new w5f.b(mVar, investorUpdateHistoryFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvestorUpdateHistoryFlow.Q;
                        return (d) ((w5f.b) investorUpdateHistoryFlow.O.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: l7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestorUpdateHistoryFlow f192576b;

            {
                this.f192576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestorUpdateHistoryFlow investorUpdateHistoryFlow = this.f192576b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestorUpdateHistoryFlow.Q;
                        return mif.a.a(investorUpdateHistoryFlow, 0, R$id.screenNavbarTabsPager_pager, (d) investorUpdateHistoryFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestorUpdateHistoryFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(investorUpdateHistoryFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        InvestorUpdateHistoryFlowContract$InputData investorUpdateHistoryFlowContract$InputData = investorUpdateHistoryFlow.K;
                        investorUpdateHistoryFlowContract$InputData.getClass();
                        return new w5f.b(mVar, investorUpdateHistoryFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InvestorUpdateHistoryFlow.Q;
                        return (d) ((w5f.b) investorUpdateHistoryFlow.O.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174522b.setItems(uiState.f192581a, uiState.f192582b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        InvestorUpdateHistoryFlowContract$PagerItem pagerItem2 = (InvestorUpdateHistoryFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        b bVar = (b) ((d) this.P.getValue());
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        bVar.H2(bVar.f91362r, new l0c.s(pagerItem2, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w5f.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (w5f.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174523c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_robo_investor_update_history_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174523c.f59410q), new ko2.b(this, continuation, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f174522b.f58882b), new l1g.e(this, continuation, 7), 3);
    }

    public final jii.g d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.N.getValue();
    }
}
