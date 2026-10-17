package zul;

import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jdf.f f325540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f325541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvestmentProjectionsContract$Context f325542c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f325543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f325544h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a3h.d f325545j;
    public final e3h.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f325546l;

    public n(jdf.f investmentPlanProjectionsDomainState, dj0.d dVar, InvestmentProjectionsContract$Context context, Data projections, Data sliderAmounts, Data instrument, Data instrumentDetails, Data tradingLegalEntityInformation, Data disclaimers, a3h.d etfExposureOverviewDomainState, e3h.c historicalChartDomainState, s selectedTab) {
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsDomainState, "investmentPlanProjectionsDomainState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(sliderAmounts, "sliderAmounts");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        Intrinsics.checkNotNullParameter(etfExposureOverviewDomainState, "etfExposureOverviewDomainState");
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f325540a = investmentPlanProjectionsDomainState;
        this.f325541b = dVar;
        this.f325542c = context;
        this.d = projections;
        this.e = sliderAmounts;
        this.f = instrument;
        this.f325543g = instrumentDetails;
        this.f325544h = tradingLegalEntityInformation;
        this.i = disclaimers;
        this.f325545j = etfExposureOverviewDomainState;
        this.k = historicalChartDomainState;
        this.f325546l = selectedTab;
    }

    public static n a(n nVar, jdf.f fVar, dj0.d dVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, a3h.d dVar2, e3h.c cVar, s sVar, int i) {
        if ((i & 1) != 0) {
            fVar = nVar.f325540a;
        }
        jdf.f investmentPlanProjectionsDomainState = fVar;
        if ((i & 2) != 0) {
            dVar = nVar.f325541b;
        }
        dj0.d dVar3 = dVar;
        InvestmentProjectionsContract$Context context = nVar.f325542c;
        Data projections = (i & 8) != 0 ? nVar.d : data;
        Data sliderAmounts = (i & 16) != 0 ? nVar.e : data2;
        Data instrument = (i & 32) != 0 ? nVar.f : data3;
        Data instrumentDetails = (i & 64) != 0 ? nVar.f325543g : data4;
        Data tradingLegalEntityInformation = (i & 128) != 0 ? nVar.f325544h : data5;
        Data disclaimers = (i & 256) != 0 ? nVar.i : data6;
        a3h.d etfExposureOverviewDomainState = (i & 512) != 0 ? nVar.f325545j : dVar2;
        e3h.c historicalChartDomainState = (i & 1024) != 0 ? nVar.k : cVar;
        s selectedTab = (i & 2048) != 0 ? nVar.f325546l : sVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsDomainState, "investmentPlanProjectionsDomainState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(sliderAmounts, "sliderAmounts");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        Intrinsics.checkNotNullParameter(etfExposureOverviewDomainState, "etfExposureOverviewDomainState");
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        return new n(investmentPlanProjectionsDomainState, dVar3, context, projections, sliderAmounts, instrument, instrumentDetails, tradingLegalEntityInformation, disclaimers, etfExposureOverviewDomainState, historicalChartDomainState, selectedTab);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f325540a, nVar.f325540a) && Intrinsics.f(this.f325541b, nVar.f325541b) && Intrinsics.f(this.f325542c, nVar.f325542c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f325543g, nVar.f325543g) && Intrinsics.f(this.f325544h, nVar.f325544h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f325545j, nVar.f325545j) && Intrinsics.f(this.k, nVar.k) && this.f325546l == nVar.f325546l;
    }

    public final int hashCode() {
        int iHashCode = this.f325540a.hashCode() * 31;
        dj0.d dVar = this.f325541b;
        return this.f325546l.hashCode() + ((this.k.hashCode() + ((this.f325545j.hashCode() + kii.e.c(this.i, kii.e.c(this.f325544h, kii.e.c(this.f325543g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, (this.f325542c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31);
    }
}
