package m5e;

import cli.y;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewControllerContract$InputData;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import fsl.w;
import i4h.p0;
import java.util.List;
import klf.l1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements dli.b, g {
    public final h8b.h A;
    public final fsl.m B;
    public final ybl.b C;
    public final y D;
    public final NoteDetailsOverviewControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a5e.b f202923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s4e.b f202924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t4e.b f202925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y4e.b f202926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x4e.b f202927t;
    public final h3h.b u;
    public final e3h.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z4e.b f202928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u4e.b f202929x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w4e.a f202930y;
    public final h1h.b z;

    public m(NoteDetailsOverviewControllerContract$InputData inputData, o stateMapper, a5e.b underlyingAssetsWidgetControllerModelExtension, s4e.b aboutIssuerWidgetControllerModelExtension, t4e.b aboutNoteWidgetControllerModelExtension, y4e.b payoutScenarioWidgetControllerModelExtension, x4e.b payoutChartWidgetControllerModelExtension, h3h.b investmentsWidgetControllerModelExtension, e3h.k historicalChartViewControllerModelExtension, z4e.b performanceTrackerViewControllerModelExtension, u4e.b annualReturnInsightsWidgetControllerModelExtension, w4e.a noteStateWarningWidgetControllerModelExtension, h1h.b transactionsWidgetControllerModelExtension, h8b.h corporateEventsControllerModelExtension, fsl.m investOrdersWidgetProvider, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(underlyingAssetsWidgetControllerModelExtension, "underlyingAssetsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(aboutIssuerWidgetControllerModelExtension, "aboutIssuerWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(aboutNoteWidgetControllerModelExtension, "aboutNoteWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(payoutScenarioWidgetControllerModelExtension, "payoutScenarioWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(payoutChartWidgetControllerModelExtension, "payoutChartWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentsWidgetControllerModelExtension, "investmentsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(historicalChartViewControllerModelExtension, "historicalChartViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(performanceTrackerViewControllerModelExtension, "performanceTrackerViewControllerModelExtension");
        Intrinsics.checkNotNullParameter(annualReturnInsightsWidgetControllerModelExtension, "annualReturnInsightsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(noteStateWarningWidgetControllerModelExtension, "noteStateWarningWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(corporateEventsControllerModelExtension, "corporateEventsControllerModelExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.o = inputData;
        this.f202923p = underlyingAssetsWidgetControllerModelExtension;
        this.f202924q = aboutIssuerWidgetControllerModelExtension;
        this.f202925r = aboutNoteWidgetControllerModelExtension;
        this.f202926s = payoutScenarioWidgetControllerModelExtension;
        this.f202927t = payoutChartWidgetControllerModelExtension;
        this.u = investmentsWidgetControllerModelExtension;
        this.v = historicalChartViewControllerModelExtension;
        this.f202928w = performanceTrackerViewControllerModelExtension;
        this.f202929x = annualReturnInsightsWidgetControllerModelExtension;
        this.f202930y = noteStateWarningWidgetControllerModelExtension;
        this.z = transactionsWidgetControllerModelExtension;
        this.A = corporateEventsControllerModelExtension;
        this.B = investOrdersWidgetProvider;
        this.C = instrumentTickerInteractor;
        a5e.f fVar = (a5e.f) ((j2) ((a5e.l) underlyingAssetsWidgetControllerModelExtension).o.f22677a).getValue();
        s4e.d dVar = (s4e.d) ((j2) ((s4e.i) aboutIssuerWidgetControllerModelExtension).f259842n.f22677a).getValue();
        t4e.d dVar2 = (t4e.d) ((j2) ((t4e.j) aboutNoteWidgetControllerModelExtension).o.f22677a).getValue();
        y4e.d dVar3 = (y4e.d) ((j2) ((y4e.i) payoutScenarioWidgetControllerModelExtension).f310898n.f22677a).getValue();
        h3h.d dVar4 = (h3h.d) ((j2) ((q4h.d) investmentsWidgetControllerModelExtension).f242166p.f22677a).getValue();
        z4e.d dVar5 = (z4e.d) ((j2) ((z4e.i) performanceTrackerViewControllerModelExtension).f319382n.f22677a).getValue();
        u4e.d dVar6 = (u4e.d) ((j2) ((u4e.m) annualReturnInsightsWidgetControllerModelExtension).f277339s.f22677a).getValue();
        this.D = mra.d.b(this, new h(fVar, dVar, dVar2, dVar3, dVar4, (x4e.d) ((j2) ((x4e.k) payoutChartWidgetControllerModelExtension).o.f22677a).getValue(), dVar5, dVar6, (w4e.b) ((j2) ((w4e.e) noteStateWarningWidgetControllerModelExtension).f294559n.f22677a).getValue(), (e3h.c) ((j2) ((p0) historicalChartViewControllerModelExtension).f158478y.f22677a).getValue(), 31744), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, (j2) ((a5e.l) this.f202923p).o.f22677a, null, new k(this, null, 6), 3);
        yji.l.b1(this, (j2) ((s4e.i) this.f202924q).f259842n.f22677a, null, new k(this, null, 7), 3);
        yji.l.b1(this, (j2) ((t4e.j) this.f202925r).o.f22677a, null, new k(this, null, 8), 3);
        yji.l.b1(this, (j2) ((y4e.i) this.f202926s).f310898n.f22677a, null, new k(this, null, 9), 3);
        yji.l.b1(this, (j2) ((x4e.k) this.f202927t).o.f22677a, null, new k(this, null, 10), 3);
        yji.l.b1(this, (j2) ((p0) this.v).f158478y.f22677a, null, new k(this, null, 11), 3);
        yji.l.b1(this, (j2) ((q4h.d) this.u).f242166p.f22677a, null, new k(this, null, 12), 3);
        yji.l.b1(this, (j2) ((z4e.i) this.f202928w).f319382n.f22677a, null, new k(this, null, 13), 3);
        yji.l.b1(this, (j2) ((u4e.m) this.f202929x).f277339s.f22677a, null, new k(this, null, 14), 3);
        yji.l.b1(this, (j2) ((w4e.e) this.f202930y).f294559n.f22677a, null, new k(this, null, 0), 3);
        NoteDetailsOverviewControllerContract$InputData noteDetailsOverviewControllerContract$InputData = this.o;
        String str = noteDetailsOverviewControllerContract$InputData.f88895a;
        ybl.b bVar = this.C;
        yji.l.b1(this, nim.a.v(rd0.e.b(((ael.k) bVar).f(str)), new m30.c(27)), null, new k(this, null, 1), 3);
        xi0.a aVar = xi0.b.Companion;
        String str2 = noteDetailsOverviewControllerContract$InputData.f88895a;
        aVar.getClass();
        yji.l.b1(this, ((w) this.B).a(new InvestOrdersParams.OrdersByCurrencies(y0.b(xi0.a.a(str2)), null, 30)), null, new k(this, null, 2), 3);
        yji.l.b1(this, nim.a.v(rd0.e.b(((ael.k) bVar).f(noteDetailsOverviewControllerContract$InputData.f88895a)), new m30.c(26)), null, new k(this, null, 3), 3);
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        String str3 = noteDetailsOverviewControllerContract$InputData.f88895a;
        List listC = u.c(xi0.a.a(str3));
        companion.getClass();
        yji.l.b1(this, rd0.e.e(this.z.b3(InvestTransactionsFilter.Companion.b(listC), new h1h.c(false, new InvestTransactionsListContract$Disclaimers(false, 14))), h0.f322473a, new l1(3, 21, null)), null, new k(this, null, 4), 3);
        yji.l.b1(this, this.A.c3(str3), null, new k(this, null, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
