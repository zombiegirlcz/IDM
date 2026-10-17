package feh;

import ael.d0;
import cli.y;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.feature.wealth.mutual_funds.api.ui.details.MutualFundDetailsContract$InputData;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import fsl.w;
import i4h.p0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends oki.h implements h {
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f134631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e3h.k f134632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fsl.m f134633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1h.b f134634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n2h.a f134635t;
    public final y u;

    public m(d0 stocksInteractor, ybl.b instrumentTickerInteractor, e3h.k historicalChartViewControllerModelExtension, fsl.m investOrdersWidgetProvider, h1h.b transactionsWidgetControllerModelExtension, n2h.a actionsPanelControllerModelExtension, cq9.m stateMapper, MutualFundDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = stocksInteractor;
        this.f134631p = instrumentTickerInteractor;
        this.f134632q = historicalChartViewControllerModelExtension;
        this.f134633r = investOrdersWidgetProvider;
        this.f134634s = transactionsWidgetControllerModelExtension;
        this.f134635t = actionsPanelControllerModelExtension;
        this.u = mra.d.b(this, new g(inputData.f95714a.f95715a, null, null, (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue(), null, null, null, (n2h.f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue()), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.u;
        yji.l.a1(this, rd0.e.b(((ael.k) this.f134631p).f(((g) ((j2) yVar.f22677a).getValue()).f134618a)), null, null, new l(this, null, 3), 3);
        yji.l.a1(this, nim.a.v(rd0.e.b(this.o.a(((g) ((j2) yVar.f22677a).getValue()).f134618a, false)), new fe9.f(5)), null, null, new l(this, null, 2), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, (j2) ((m3h.a) this.f134635t).f202569p.f22677a, null, new l(this, null, 0), 3);
        yji.l.b1(this, (j2) ((p0) this.f134632q).f158478y.f22677a, null, new l(this, null, 1), 3);
        xi0.a aVar = xi0.b.Companion;
        y yVar = this.u;
        String str = ((g) ((j2) yVar.f22677a).getValue()).f134618a;
        aVar.getClass();
        yji.l.b1(this, ((w) this.f134633r).a(new InvestOrdersParams.OrdersByCurrencies(y0.b(xi0.a.a(str)), null, 30)), null, new l(this, null, 4), 3);
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        List listC = u.c(xi0.a.a(((g) ((j2) yVar.f22677a).getValue()).f134618a));
        companion.getClass();
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplB = InvestTransactionsFilter.Companion.b(listC);
        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
        yji.l.b1(this, this.f134634s.c3(investTransactionsFilterImplB, w4l.i.f294643c, new h1h.c(false, InvestTransactionsListContract$Disclaimers.Companion.b())), null, new l(this, null, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
