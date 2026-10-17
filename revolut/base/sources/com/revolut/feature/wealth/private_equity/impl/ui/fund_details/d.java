package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import ael.d0;
import ael.q;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.feature.wealth.private_equity.api.navigation.fund_details.FundHighlightsScreenDestination;
import com.revolut.feature.wealth.private_equity.api.navigation.fund_details.FundPerformanceScreenDestination;
import com.revolut.feature.wealth.private_equity.api.navigation.fund_details.PortfolioUpdatesScreenDestination;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import d1h.e;
import e3h.k;
import fsl.m;
import hbh.o;
import i4h.p0;
import igh.b0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oki.h;
import vkm.j2;
import vrl.s;
import wde.f;
import wf6.p;
import wfh.n;
import wfh.t;
import wfh.v;
import ybl.l;
import zh9.u0;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends h implements n {
    public final wfh.b A;
    public final e B;
    public final Map C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final y E;
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f95787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f95788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f95789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f95790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f95791t;
    public final h1h.b u;
    public final ybl.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n2h.a f95792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ybl.d f95793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s f95794y;
    public final l z;

    public d(d0 stocksInteractor, q pnlInteractor, ybl.b instrumentTickerInteractor, k historicalChartViewControllerModelExtension, m investOrdersWidgetProvider, o transactionsWidgetProvider, h1h.b transactionsWidgetControllerModelExtension, ybl.k tradingAccountsInteractor, n2h.a actionsPanelControllerModelExtension, ybl.d portfolioInteractor, s orderLimitsByPortfolioInteractor, l tradingConfigInteractor, wfh.b dialogProvider, e disclaimersModelExtension, Map productsProviders, v saveStateDelegate, b0 stateMapper, FundDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(pnlInteractor, "pnlInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetProvider, "transactionsWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolioInteractor, "orderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = stocksInteractor;
        this.f95787p = pnlInteractor;
        this.f95788q = instrumentTickerInteractor;
        this.f95789r = historicalChartViewControllerModelExtension;
        this.f95790s = investOrdersWidgetProvider;
        this.f95791t = transactionsWidgetProvider;
        this.u = transactionsWidgetControllerModelExtension;
        this.v = tradingAccountsInteractor;
        this.f95792w = actionsPanelControllerModelExtension;
        this.f95793x = portfolioInteractor;
        this.f95794y = orderLimitsByPortfolioInteractor;
        this.z = tradingConfigInteractor;
        this.A = dialogProvider;
        this.B = disclaimersModelExtension;
        this.C = productsProviders;
        this.D = hx7.e.a(this, new f(this, 4));
        this.E = mra.d.b(this, new wfh.l(inputData.f95733a.f95732a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, h0.f322473a, false, (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue(), null, null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), (n2h.f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue(), null, null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, saveStateDelegate, false, 8);
    }

    @Override // yji.l
    public final void I1() {
        p pVar = new p(11);
        y yVar = this.E;
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(yVar.B(pVar), new t(1, this, continuation)), null, null, new wfh.s(10, this, continuation), 3);
        yji.l.a1(this, boh.f.e(vkm.q.q(nim.a.v(yVar.B(new p(9)), new vsl.f(1, this, d.class, "exposureSubAssetsRefs", "exposureSubAssetsRefs(Lcom/revolut/shared/feature/wealth/models/details/FundDetails;)Ljava/util/Set;", 0, 25))), new wfh.p(this, 2)), null, null, new wfh.s(6, this, continuation), 3);
        l2(new w76.a(this, continuation, 8), new yi5.b(26));
        yji.l.a1(this, nim.a.v(boh.f.e(yVar.B(new p(21)), new wfh.p(this, 0)), new p(3)), null, null, new wfh.s(13, this, continuation), 3);
        yji.l.a1(this, ybl.k.h(this.v, TradingAccountType.Gia.f105270a, null, 6), null, null, new wfh.s(1, this, continuation), 3);
        yji.l.a1(this, l.d(this.z), null, null, new wfh.s(11, this, continuation), 3);
    }

    public final void I2(final FundDetailsScreenContract$Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof FundDetailsScreenContract$Action.NavigateToFundHighlights) {
            C1(new FundHighlightsScreenDestination(((FundDetailsScreenContract$Action.NavigateToFundHighlights) action).f95742a));
            return;
        }
        if (action instanceof FundDetailsScreenContract$Action.NavigateToFundPerformance) {
            FundDetailsScreenContract$Action.NavigateToFundPerformance navigateToFundPerformance = (FundDetailsScreenContract$Action.NavigateToFundPerformance) action;
            C1(new FundPerformanceScreenDestination(navigateToFundPerformance.f95743a, navigateToFundPerformance.f95744b));
            return;
        }
        if (action instanceof FundDetailsScreenContract$Action.NavigateToPortfolioUpdates) {
            C1(new PortfolioUpdatesScreenDestination(((FundDetailsScreenContract$Action.NavigateToPortfolioUpdates) action).f95747a));
            return;
        }
        boolean z = action instanceof FundDetailsScreenContract$Action.ShowHoldingInfo;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.D;
        if (z) {
            FundDetailsScreenContract$Action.ShowHoldingInfo showHoldingInfo = (FundDetailsScreenContract$Action.ShowHoldingInfo) action;
            h.v2(aVar, new FundDetailsScreenContract$ModalStep.ShowHoldingInfo(showHoldingInfo.f95751a, showHoldingInfo.f95752b, showHoldingInfo.f95753c, showHoldingInfo.d), bottom_dialog);
            return;
        }
        boolean z3 = action instanceof FundDetailsScreenContract$Action.NavigateToInvestmentDetails;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (z3) {
            h.v2(aVar, new FundDetailsScreenContract$ModalStep.ShowInvestmentDetails(((FundDetailsScreenContract$Action.NavigateToInvestmentDetails) action).f95746a), popup);
            return;
        }
        if (action instanceof FundDetailsScreenContract$Action.NavigateToHoldingDetails) {
            return;
        }
        boolean z4 = action instanceof FundDetailsScreenContract$Action.ExpandAllocation;
        y yVar = this.E;
        if (z4) {
            final int i = 0;
            H2(yVar, new Function1(this) { // from class: wfh.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d f297140b;

                {
                    this.f297140b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    l update = (l) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return l.e(update, null, null, null, null, null, a1.m(((l) ((j2) this.f297140b.E.f22677a).getValue()).f297123g, ((FundDetailsScreenContract$Action.ExpandAllocation) action).f95740a), false, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097087);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return l.e(update, null, null, null, null, null, a1.j(((l) ((j2) this.f297140b.E.f22677a).getValue()).f297123g, ((FundDetailsScreenContract$Action.CollapseAllocation) action).f95739a), false, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097087);
                    }
                }
            });
            return;
        }
        if (action instanceof FundDetailsScreenContract$Action.CollapseAllocation) {
            final int i2 = 1;
            H2(yVar, new Function1(this) { // from class: wfh.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d f297140b;

                {
                    this.f297140b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    l update = (l) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return l.e(update, null, null, null, null, null, a1.m(((l) ((j2) this.f297140b.E.f22677a).getValue()).f297123g, ((FundDetailsScreenContract$Action.ExpandAllocation) action).f95740a), false, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097087);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return l.e(update, null, null, null, null, null, a1.j(((l) ((j2) this.f297140b.E.f22677a).getValue()).f297123g, ((FundDetailsScreenContract$Action.CollapseAllocation) action).f95739a), false, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097087);
                    }
                }
            });
            return;
        }
        if (Intrinsics.f(action, FundDetailsScreenContract$Action.ToggleAllHoldings.f95758a)) {
            H2(yVar, new wfh.p(this, 6));
            return;
        }
        if (Intrinsics.f(action, FundDetailsScreenContract$Action.ShowAllocationInfo.f95748a)) {
            h.v2(aVar, FundDetailsScreenContract$ModalStep.ShowAllocationInfo.f95762a, bottom_dialog);
            return;
        }
        if (Intrinsics.f(action, FundDetailsScreenContract$Action.NavigateToFaq.f95741a)) {
            m70.a.c(t0.f186434a);
            C1(u0.c(new HelpCentreFeatureConfig.Topic("question.about-private-markets", "")));
            return;
        }
        if (Intrinsics.f(action, FundDetailsScreenContract$Action.ShowBuyFrequencyInfo.f95749a)) {
            h.v2(aVar, FundDetailsScreenContract$ModalStep.ShowBuyFrequencyInfo.f95763a, bottom_dialog);
            return;
        }
        if (Intrinsics.f(action, FundDetailsScreenContract$Action.ShowSellFrequencyInfo.f95754a)) {
            h.v2(aVar, FundDetailsScreenContract$ModalStep.ShowSellFrequencyInfo.f95770a, bottom_dialog);
            return;
        }
        if (!(action instanceof FundDetailsScreenContract$Action.ShowSellTimelineInfo)) {
            if (!(action instanceof FundDetailsScreenContract$Action.ShowHighRiskWarningInfo)) {
                throw new NoWhenBranchMatchedException();
            }
            h.v2(aVar, new FundDetailsScreenContract$ModalStep.ShowHighRiskWarningInfo(((FundDetailsScreenContract$Action.ShowHighRiskWarningInfo) action).f95750a), popup);
        } else {
            FundDetailsScreenContract$Action.ShowSellTimelineInfo showSellTimelineInfo = (FundDetailsScreenContract$Action.ShowSellTimelineInfo) action;
            h.v2(aVar, new FundDetailsScreenContract$ModalStep.ShowSellTimelineInfo(showSellTimelineInfo.d, showSellTimelineInfo.f95755a, showSellTimelineInfo.f95756b, showSellTimelineInfo.f95757c), bottom_dialog);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, (j2) ((m3h.a) this.f95792w).f202569p.f22677a, null, new wfh.s(2, this, continuation), 3);
        p pVar = new p(20);
        y yVar = this.E;
        yji.l.b1(this, vkm.q.Q(new vkm.t0(yVar.B(pVar), 1), new t(0, this, continuation)), null, new wfh.s(3, this, continuation), 3);
        yji.l.b1(this, (j2) ((p0) this.f95789r).f158478y.f22677a, null, new wfh.s(5, this, continuation), 3);
        yji.l.b1(this, boh.f.e(u0.i(yVar.B(new p(5)), a.a.k(yVar.B(new p(6)), new p(7)), yVar.B(new p(8))), new wfh.p(this, 1)), null, new wfh.s(7, this, continuation), 3);
        yji.l.b1(this, boh.f.e(a.a.k(nim.a.v(yVar.B(new p(15)), new p(16)), new p(17)), new wfh.p(this, 4)), null, new wfh.s(9, this, continuation), 3);
        yji.l.b1(this, this.u.d3(c6d.b.i(a.a.k(nim.a.v(yVar.B(new p(12)), new p(13)), new p(14)), new wfh.p(this, 3)), true), null, new wfh.s(12, this, continuation), 3);
        yji.l.b1(this, boh.f.e(u0.m(yVar.B(new p(2)), a.a.k(yVar.B(new p(10)), new p(18))), new wfh.p(this, 5)), null, new wfh.s(8, this, continuation), 3);
        yji.l.b1(this, yVar.B(new p(4)), null, new wfh.s(0, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.E;
    }
}
