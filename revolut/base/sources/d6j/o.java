package d6j;

import aw0.r0;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.j, fsl.n, q2h.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f111579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f111580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f111581c;
    public final boolean d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qta.f f111582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y5j.b f111583h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f111584j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f111585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f111586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f111587n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f111588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f111589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f111590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WealthNewsCategory f111591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TradingLegalEntityInformation f111592t;
    public final ncj.g u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Data f111593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f111594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Data f111595y;

    public o(xi0.b currency, List chartPeriods, Data midExchangeRateData, boolean z, Data pocketData, Data balanceData, qta.f fVar, y5j.b bVar, Data chartTransactionsData, Data lineChartData, int i, Data candleChartData, r0 r0Var, List menuItems, Data data, Data data2, List list, Data data3, WealthNewsCategory topStoriesCategory, TradingLegalEntityInformation tradingLegalEntityInformation, ncj.g gVar, List alertsItems, Data disclaimerData, boolean z3, Data data4) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(midExchangeRateData, "midExchangeRateData");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(balanceData, "balanceData");
        Intrinsics.checkNotNullParameter(chartTransactionsData, "chartTransactionsData");
        Intrinsics.checkNotNullParameter(lineChartData, "lineChartData");
        Intrinsics.checkNotNullParameter(candleChartData, "candleChartData");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(topStoriesCategory, "topStoriesCategory");
        Intrinsics.checkNotNullParameter(alertsItems, "alertsItems");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        this.f111579a = currency;
        this.f111580b = chartPeriods;
        this.f111581c = midExchangeRateData;
        this.d = z;
        this.e = pocketData;
        this.f = balanceData;
        this.f111582g = fVar;
        this.f111583h = bVar;
        this.i = chartTransactionsData;
        this.f111584j = lineChartData;
        this.k = i;
        this.f111585l = candleChartData;
        this.f111586m = r0Var;
        this.f111587n = menuItems;
        this.o = data;
        this.f111588p = data2;
        this.f111589q = list;
        this.f111590r = data3;
        this.f111591s = topStoriesCategory;
        this.f111592t = tradingLegalEntityInformation;
        this.u = gVar;
        this.v = alertsItems;
        this.f111593w = disclaimerData;
        this.f111594x = z3;
        this.f111595y = data4;
    }

    public static o f(o oVar, Data data, boolean z, Data data2, Data data3, qta.f fVar, y5j.b bVar, Data data4, Data data5, int i, Data data6, r0 r0Var, List list, Data data7, Data data8, List list2, Data data9, TradingLegalEntityInformation tradingLegalEntityInformation, ncj.g gVar, List list3, Data data10, boolean z3, Data data11, int i2) {
        xi0.b currency = oVar.f111579a;
        List chartPeriods = oVar.f111580b;
        Data midExchangeRateData = (i2 & 4) != 0 ? oVar.f111581c : data;
        boolean z4 = (i2 & 8) != 0 ? oVar.d : z;
        Data pocketData = (i2 & 16) != 0 ? oVar.e : data2;
        Data balanceData = (i2 & 32) != 0 ? oVar.f : data3;
        qta.f fVar2 = (i2 & 64) != 0 ? oVar.f111582g : fVar;
        y5j.b bVar2 = (i2 & 128) != 0 ? oVar.f111583h : bVar;
        Data chartTransactionsData = (i2 & 256) != 0 ? oVar.i : data4;
        Data lineChartData = (i2 & 512) != 0 ? oVar.f111584j : data5;
        int i3 = (i2 & 1024) != 0 ? oVar.k : i;
        Data candleChartData = (i2 & 2048) != 0 ? oVar.f111585l : data6;
        r0 r0Var2 = (i2 & 4096) != 0 ? oVar.f111586m : r0Var;
        List menuItems = (i2 & 8192) != 0 ? oVar.f111587n : list;
        boolean z6 = z4;
        Data data12 = (i2 & 16384) != 0 ? oVar.o : data7;
        Data data13 = (i2 & 32768) != 0 ? oVar.f111588p : data8;
        List list4 = (i2 & 65536) != 0 ? oVar.f111589q : list2;
        Data data14 = (i2 & 131072) != 0 ? oVar.f111590r : data9;
        WealthNewsCategory topStoriesCategory = oVar.f111591s;
        Data data15 = data12;
        TradingLegalEntityInformation tradingLegalEntityInformation2 = (i2 & 524288) != 0 ? oVar.f111592t : tradingLegalEntityInformation;
        ncj.g gVar2 = (i2 & PKIFailureInfo.badCertTemplate) != 0 ? oVar.u : gVar;
        List alertsItems = (i2 & PKIFailureInfo.badSenderNonce) != 0 ? oVar.v : list3;
        qta.f fVar3 = fVar2;
        Data disclaimerData = (i2 & 4194304) != 0 ? oVar.f111593w : data10;
        y5j.b bVar3 = bVar2;
        boolean z11 = (i2 & 8388608) != 0 ? oVar.f111594x : z3;
        Data data16 = (i2 & 16777216) != 0 ? oVar.f111595y : data11;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(midExchangeRateData, "midExchangeRateData");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(balanceData, "balanceData");
        Intrinsics.checkNotNullParameter(chartTransactionsData, "chartTransactionsData");
        Intrinsics.checkNotNullParameter(lineChartData, "lineChartData");
        Intrinsics.checkNotNullParameter(candleChartData, "candleChartData");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(topStoriesCategory, "topStoriesCategory");
        Intrinsics.checkNotNullParameter(alertsItems, "alertsItems");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        return new o(currency, chartPeriods, midExchangeRateData, z6, pocketData, balanceData, fVar3, bVar3, chartTransactionsData, lineChartData, i3, candleChartData, r0Var2, menuItems, data15, data13, list4, data14, topStoriesCategory, tradingLegalEntityInformation2, gVar2, alertsItems, disclaimerData, z11, data16);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.f111588p;
    }

    @Override // fsl.n
    public final Data a() {
        return this.o;
    }

    @Override // q2h.i
    public final Data c() {
        return this.f111595y;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f111579a, oVar.f111579a) && Intrinsics.f(this.f111580b, oVar.f111580b) && Intrinsics.f(this.f111581c, oVar.f111581c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && this.f111582g == oVar.f111582g && this.f111583h == oVar.f111583h && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f111584j, oVar.f111584j) && this.k == oVar.k && Intrinsics.f(this.f111585l, oVar.f111585l) && Intrinsics.f(this.f111586m, oVar.f111586m) && Intrinsics.f(this.f111587n, oVar.f111587n) && Intrinsics.f(this.o, oVar.o) && Intrinsics.f(this.f111588p, oVar.f111588p) && Intrinsics.f(this.f111589q, oVar.f111589q) && Intrinsics.f(this.f111590r, oVar.f111590r) && Intrinsics.f(this.f111591s, oVar.f111591s) && Intrinsics.f(this.f111592t, oVar.f111592t) && Intrinsics.f(this.u, oVar.u) && Intrinsics.f(this.v, oVar.v) && Intrinsics.f(this.f111593w, oVar.f111593w) && this.f111594x == oVar.f111594x && Intrinsics.f(this.f111595y, oVar.f111595y);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f, kii.e.c(this.e, j6.a.c(kii.e.c(this.f111581c, p.a.d(this.f111579a.hashCode() * 31, 31, this.f111580b), 31), 31, this.d), 31), 31);
        qta.f fVar = this.f111582g;
        int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        y5j.b bVar = this.f111583h;
        int iC2 = kii.e.c(this.f111585l, j6.a.b(this.k, kii.e.c(this.f111584j, kii.e.c(this.i, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31), 31), 31);
        r0 r0Var = this.f111586m;
        int iD = p.a.d((iC2 + (r0Var == null ? 0 : r0Var.hashCode())) * 31, 31, this.f111587n);
        Data data = this.o;
        int iHashCode2 = (iD + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f111588p;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        List list = this.f111589q;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Data data3 = this.f111590r;
        int iHashCode5 = (this.f111591s.hashCode() + ((iHashCode4 + (data3 == null ? 0 : data3.hashCode())) * 31)) * 31;
        TradingLegalEntityInformation tradingLegalEntityInformation = this.f111592t;
        int iHashCode6 = (iHashCode5 + (tradingLegalEntityInformation == null ? 0 : tradingLegalEntityInformation.hashCode())) * 31;
        ncj.g gVar = this.u;
        int iC3 = j6.a.c(kii.e.c(this.f111593w, p.a.d((iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.v), 31), 31, this.f111594x);
        Data data4 = this.f111595y;
        return iC3 + (data4 != null ? data4.hashCode() : 0);
    }
}
