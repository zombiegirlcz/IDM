package puk;

import ael.h0;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotifications;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$Page;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ku1.f0;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends oki.h implements d {
    public final ali.b A;
    public final StockDetailsFlowControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f239954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f239955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l1d.a f239956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u1d.a f239957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n2h.a f239958t;
    public final kbf.a u;
    public final pgl.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y8h.b f239959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y08.a f239960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l80.e f239961y;
    public final y z;

    public s(u stateMapper, StockDetailsFlowControllerContract$InputData inputData, gte.a featureToggleInteractor, ybl.b instrumentTickerInteractor, l1d.a alertsQuickActionsControllerModelExtension, u1d.a watchlistQuickActionsControllerModelExtension, n2h.a actionsPanelControllerModelExtension, kbf.a tradingAddOnSpecificAddOnInteractor, pgl.a orderBookInteractor, y8h.b optionsAvailabilityInteractor, y08.a insightsComplianceModelExtension, l80.e dateProvider) {
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(alertsQuickActionsControllerModelExtension, "alertsQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(watchlistQuickActionsControllerModelExtension, "watchlistQuickActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(tradingAddOnSpecificAddOnInteractor, "tradingAddOnSpecificAddOnInteractor");
        Intrinsics.checkNotNullParameter(orderBookInteractor, "orderBookInteractor");
        Intrinsics.checkNotNullParameter(optionsAvailabilityInteractor, "optionsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(insightsComplianceModelExtension, "insightsComplianceModelExtension");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = inputData;
        this.f239954p = featureToggleInteractor;
        this.f239955q = instrumentTickerInteractor;
        this.f239956r = alertsQuickActionsControllerModelExtension;
        this.f239957s = watchlistQuickActionsControllerModelExtension;
        this.f239958t = actionsPanelControllerModelExtension;
        this.u = tradingAddOnSpecificAddOnInteractor;
        this.v = orderBookInteractor;
        this.f239959w = optionsAvailabilityInteractor;
        this.f239960x = insightsComplianceModelExtension;
        this.f239961y = dateProvider;
        vqk.c cVar = inputData.f103876b;
        int i = cVar == null ? -1 : m.f239944a[cVar.ordinal()];
        int i2 = 2;
        if (i == -1) {
            stockDetailsFlowControllerContract$Page = null;
        } else if (i == 1) {
            stockDetailsFlowControllerContract$Page = ifk.b.n(featureToggleInteractor, InvestSmartNotificationsApi$Toggles$InvestSmartNotifications.f76416c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c) ? StockDetailsFlowControllerContract$Page.FEED : StockDetailsFlowControllerContract$Page.NEWS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stockDetailsFlowControllerContract$Page = StockDetailsFlowControllerContract$Page.FINANCIALS;
        }
        this.z = mra.d.b(this, new f(stockDetailsFlowControllerContract$Page != null ? stockDetailsFlowControllerContract$Page.getF94249a() : null, I2(false, false, false, false), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), (n2h.f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue(), false, false, null), stateMapper, null, false, 12);
        this.A = md6.s.b(this, new pu4.d(this, i2));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.A;
    }

    public final List I2(boolean z, boolean z3, boolean z4, boolean z6) {
        boolean zN = ifk.b.n(this.f239954p, InvestSmartNotificationsApi$Toggles$InvestSmartNotifications.f76416c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c);
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page = StockDetailsFlowControllerContract$Page.OVERVIEW;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page2 = null;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page3 = z6 ? StockDetailsFlowControllerContract$Page.OPTIONS : null;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page4 = (z && z3 && z4) ? StockDetailsFlowControllerContract$Page.ORDER_BOOK : null;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page5 = StockDetailsFlowControllerContract$Page.FINANCIALS;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page6 = zN ? StockDetailsFlowControllerContract$Page.FEED : StockDetailsFlowControllerContract$Page.NEWS;
        if (!z && z3 && z4) {
            stockDetailsFlowControllerContract$Page2 = StockDetailsFlowControllerContract$Page.ORDER_BOOK;
        }
        StockDetailsFlowControllerContract$Page[] elements = {stockDetailsFlowControllerContract$Page, stockDetailsFlowControllerContract$Page3, stockDetailsFlowControllerContract$Page4, stockDetailsFlowControllerContract$Page5, stockDetailsFlowControllerContract$Page6, stockDetailsFlowControllerContract$Page2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // yji.l
    public final void T1(long j2) {
        StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData = this.o;
        String str = stockDetailsFlowControllerContract$InputData.f103875a;
        ael.k kVar = (ael.k) this.f239955q;
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.b(kVar.f(str)), null, new n(this, continuation, 1), 3);
        String securityRef = stockDetailsFlowControllerContract$InputData.f103875a;
        ybl.b.Companion.getClass();
        long jA = InstrumentTickerInteractor$Companion.f105074b.a();
        w4l.h loadingStrategy = w4l.h.f294642c;
        yji.l.b1(this, kVar.p(securityRef, loadingStrategy, jA), null, new n(this, continuation, 3), 3);
        pui.a aVar = new pui.a(4);
        y yVar = this.z;
        final int i = 0;
        yji.l.b1(this, boh.f.e(yVar.B(aVar), new Function1(this) { // from class: puk.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f239943b;

            {
                this.f239943b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Instant instant;
                Instant instantPlus;
                nel.n instrument = (nel.n) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        s sVar = this.f239943b;
                        gte.a aVar2 = sVar.f239954p;
                        u1d.a aVar3 = sVar.f239957s;
                        if (((jte.d) aVar2).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar3.c3(y1d.a.f, new Pair(instrument.f214596b, instrument.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new olf.e(aVar3.d3(y1d.a.f, instrument.f214596b), 18);
                    default:
                        Intrinsics.checkNotNullParameter(instrument, "it");
                        nel.u uVar = instrument.f214607s;
                        s sVar2 = this.f239943b;
                        return Boolean.valueOf(((jte.d) sVar2.f239954p).c(WealthUiApi$Toggles.StocksIpoListing.f95864c) && !pd.b.k((uVar == null || (instant = uVar.f214625b) == null || (instantPlus = instant.plus(10L, (TemporalUnit) ChronoUnit.DAYS)) == null) ? null : Boolean.valueOf(instantPlus.isBefore(((l80.f) sVar2.f239961y).b()))));
                }
            }
        }), null, new n(this, continuation, 2), 3);
        yji.l.b1(this, (j2) ((m3h.a) this.f239958t).f202569p.f22677a, null, new n(this, continuation, 0), 3);
        y8h.b bVar = this.f239959w;
        Flow flowQ = vkm.q.q(mo3.a.e(nim.a.v(((h0) bVar.f311658b).b(cfl.p.OPTIONS), new xlb.o(1, bVar, y8h.b.class, "isAnyOptionsProductVisibleForGia", "isAnyOptionsProductVisibleForGia(Lcom/revolut/shared/feature/wealth/domain/api/interactors/TradingAccountProductGroupAvailabilityInteractor$ProductGroupAvailability;)Z", 0, 25)), new f0(22), new psl.m(15)));
        jhi.b bVarF = mo3.a.f(rd0.e.b(((wbf.n) this.u).b(lbf.f.TRADING_PRO, false)), new psl.m(16), new p2b.a(28), new psl.m(17));
        pgl.a aVar2 = this.v;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        mgl.f fVar = aVar2.f235999a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.b1(this, vkm.q.q(ta6.a.h(bVarF, mo3.a.e(fVar.f.b(securityRef, loadingStrategy), new f0(22), new psl.m(14)), flowQ, new p(4, 0, null))), null, new n(this, continuation, 5), 3);
        if (stockDetailsFlowControllerContract$InputData.d != null) {
            n2(new pe2.l(this, continuation, 27), new whi.b(6));
        }
        final int i2 = 1;
        yji.l.b1(this, nim.a.v(yVar.B(new pui.a(5)), new Function1(this) { // from class: puk.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f239943b;

            {
                this.f239943b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Instant instant;
                Instant instantPlus;
                nel.n instrument = (nel.n) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        s sVar = this.f239943b;
                        gte.a aVar22 = sVar.f239954p;
                        u1d.a aVar3 = sVar.f239957s;
                        if (((jte.d) aVar22).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
                            y1d.b.Companion.getClass();
                            return aVar3.c3(y1d.a.f, new Pair(instrument.f214596b, instrument.i.f306286a));
                        }
                        y1d.b.Companion.getClass();
                        return new olf.e(aVar3.d3(y1d.a.f, instrument.f214596b), 18);
                    default:
                        Intrinsics.checkNotNullParameter(instrument, "it");
                        nel.u uVar = instrument.f214607s;
                        s sVar2 = this.f239943b;
                        return Boolean.valueOf(((jte.d) sVar2.f239954p).c(WealthUiApi$Toggles.StocksIpoListing.f95864c) && !pd.b.k((uVar == null || (instant = uVar.f214625b) == null || (instantPlus = instant.plus(10L, (TemporalUnit) ChronoUnit.DAYS)) == null) ? null : Boolean.valueOf(instantPlus.isBefore(((l80.f) sVar2.f239961y).b()))));
                }
            }
        }), null, new n(this, continuation, 4), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.z;
    }
}
