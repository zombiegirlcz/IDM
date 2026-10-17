package h3b;

import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceControllerContract$InputData;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends oki.h implements k {
    public final CfdCashBalanceControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f149102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f149103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f149104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1h.b f149105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h5b.b f149106t;
    public final m4f.b u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final iih.a f149107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f149108x;

    public v(cli.n stateMapper, CfdCashBalanceControllerContract$InputData inputData, s domainStateProvider, x dialogMapper, j60.a bottomExpandableDialogControllerExtension, h1h.b transactionsWidgetControllerModelExtension, h5b.b maintenanceMarginWidgetControllerModelExtension, m4f.b wealthAddMoneyCommandProvider, gte.a featureToggleInteractor, iih.a wealthActionTransferDestinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(domainStateProvider, "domainStateProvider");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetControllerModelExtension, "maintenanceMarginWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthActionTransferDestinationProvider, "wealthActionTransferDestinationProvider");
        this.o = inputData;
        this.f149102p = domainStateProvider;
        this.f149103q = dialogMapper;
        this.f149104r = bottomExpandableDialogControllerExtension;
        this.f149105s = transactionsWidgetControllerModelExtension;
        this.f149106t = maintenanceMarginWidgetControllerModelExtension;
        this.u = wealthAddMoneyCommandProvider;
        this.v = featureToggleInteractor;
        this.f149107w = wealthActionTransferDestinationProvider;
        this.f149108x = mra.d.b(this, new j(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        s sVar = this.f149102p;
        Continuation continuation = null;
        yji.l.b1(this, nim.a.v(vkm.q.q(ybl.k.h(sVar.d, TradingAccountType.Margin.f105271a, null, 6)), new gzg.a0(24)), null, new u(this, continuation, 0), 3);
        yji.l.b1(this, boh.f.e(vkm.q.q(nim.a.v(((ael.y) sVar.f149098b).e(sVar.f149097a.f82204a.f183148a.f183146b, w4l.j.f294644c), new gzg.a0(25))), new r(sVar, 0)), null, new u(this, continuation, 1), 3);
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        WealthAccountType wealthAccountType = WealthAccountType.MARGIN;
        companion.getClass();
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplA = InvestTransactionsFilter.Companion.a(wealthAccountType);
        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
        yji.l.b1(this, this.f149105s.c3(investTransactionsFilterImplA, w4l.i.f294643c, new h1h.c(InvestTransactionsListContract$Disclaimers.Companion.a(), 1)), null, new u(this, continuation, 2), 3);
        yji.l.b1(this, this.f149106t.c3(), null, new u(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f149108x;
    }
}
