package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance;

import ael.d0;
import boh.f;
import cli.g;
import cli.y;
import com.revolut.feature.wealth.private_equity.api.WealthPrivateEquityApi$Toggles$PreTradeStateRevamp;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreenContract$ActionParcel;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import d1h.e;
import e3h.c;
import gig.t;
import i4h.p0;
import ke7.v;
import kgh.j;
import kgh.m;
import kgh.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vrl.s;
import ybl.b;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements m {
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f95839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f95840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f95841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kgh.a f95842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f95843t;
    public final e u;
    public final e3h.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f95844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kgh.l f95845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f95846y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(d0 stocksInteractor, b instrumentTickerInteractor, k tradingAccountsInteractor, s orderLimitsByPortfolioInteractor, kgh.a dialogProvider, l tradingConfigInteractor, e disclaimersModelExtension, e3h.k historicalChartViewControllerModelExtension, gte.a featureToggleInteractor, t stateMapper, kgh.l inputData) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolioInteractor, "orderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = stocksInteractor;
        this.f95839p = instrumentTickerInteractor;
        this.f95840q = tradingAccountsInteractor;
        this.f95841r = orderLimitsByPortfolioInteractor;
        this.f95842s = dialogProvider;
        this.f95843t = tradingConfigInteractor;
        this.u = disclaimersModelExtension;
        this.v = historicalChartViewControllerModelExtension;
        this.f95844w = featureToggleInteractor;
        this.f95845x = inputData;
        this.f95846y = d.b(this, new j(null, null, (c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue(), null, null, null, null), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new k3k.k(this, 23));
    }

    @Override // yji.l
    public final void I1() {
        kgh.l lVar = this.f95845x;
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(rd0.e.b(this.o.a(lVar.f183996a, false)), new kcd.a(29)), null, null, new p(this, continuation, 4), 3);
        yji.l.a1(this, nim.a.v(rd0.e.b(((ael.k) this.f95839p).f(lVar.f183996a)), new kcd.a(28)), null, null, new p(this, continuation, 2), 3);
        yji.l.a1(this, k.h(this.f95840q, TradingAccountType.Gia.f105270a, null, 6), null, null, new p(this, continuation, 0), 3);
        yji.l.a1(this, l.d(this.f95843t), null, null, new p(this, continuation, 6), 3);
    }

    public final void I2(FundPerformanceScreenContract$ActionParcel action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean zF = Intrinsics.f(action, FundPerformanceScreenContract$ActionParcel.ShowRiskInfo.f95833a);
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.z;
        if (zF) {
            h.v2(aVar, FundPerformanceScreenContract$ModalStep.ShowRiskInfo.f95838a, bottom_dialog);
            return;
        }
        if (Intrinsics.f(action, FundPerformanceScreenContract$ActionParcel.ShowPerformanceScenariosInfo.f95831a)) {
            h.v2(aVar, FundPerformanceScreenContract$ModalStep.ShowPerformanceScenariosInfo.f95836a, bottom_dialog);
            return;
        }
        if (action instanceof FundPerformanceScreenContract$ActionParcel.ShowFeesInfo) {
            h.v2(aVar, FundPerformanceScreenContract$ModalStep.ShowFeesInfo.f95834a, ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (action instanceof FundPerformanceScreenContract$ActionParcel.ShowDocument) {
            l2(new kb7.c(this, ((FundPerformanceScreenContract$ActionParcel.ShowDocument) action).f95828a, null, 7), new yi5.b(26));
        } else if (Intrinsics.f(action, FundPerformanceScreenContract$ActionParcel.ShowOpenEndedFundInfo.f95830a)) {
            h.v2(aVar, FundPerformanceScreenContract$ModalStep.ShowOpenEndedFundInfo.f95835a, bottom_dialog);
        } else {
            if (!Intrinsics.f(action, FundPerformanceScreenContract$ActionParcel.ShowPriceInfo.f95832a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.v2(aVar, FundPerformanceScreenContract$ModalStep.ShowPriceInfo.f95837a, bottom_dialog);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (((jte.d) this.f95844w).c(WealthPrivateEquityApi$Toggles$PreTradeStateRevamp.f95727c)) {
            yji.l.b1(this, (j2) ((p0) this.v).f158478y.f22677a, null, new p(this, continuation, 3), 3);
        }
        kcd.a aVar = new kcd.a(25);
        y yVar = this.f95846y;
        int i = 5;
        yji.l.b1(this, f.e(a.a.k(new t0(yVar.B(aVar), 1), new kcd.a(26)), new v(this, i)), null, new p(this, continuation, i), 3);
        yji.l.b1(this, q.Q(q.q(mo3.a.f(new t0(yVar.B(new kcd.a(27)), 1), new kd8.f(14), new k8d.t(8), new kd8.f(15))), new jy6.l(continuation, this, 12)), null, new p(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f95846y;
    }
}
