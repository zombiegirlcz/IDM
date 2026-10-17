package e3h;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4l.a f122273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f122274c;
    public final n d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eel.c f122275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f122276h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final eel.b f122277j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TrendViewDelegate.a f122278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final eel.i f122279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f122280n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f122281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f122282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f122283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final eel.d f122284s;

    public c(String ref2, i4l.a chartType, Data instrumentTicker, n nVar, Data data, Data candleStickData, eel.c selectedPeriod, List chartPeriods, Data tradingLegalEntityInformation, eel.b bVar, Data historicalChartData, TrendViewDelegate.a trendViewState, eel.i selectedChartValueType, Data data2, boolean z, boolean z3, boolean z4, boolean z6, eel.d chartTabStyle) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(candleStickData, "candleStickData");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(historicalChartData, "historicalChartData");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        Intrinsics.checkNotNullParameter(selectedChartValueType, "selectedChartValueType");
        Intrinsics.checkNotNullParameter(chartTabStyle, "chartTabStyle");
        this.f122272a = ref2;
        this.f122273b = chartType;
        this.f122274c = instrumentTicker;
        this.d = nVar;
        this.e = data;
        this.f = candleStickData;
        this.f122275g = selectedPeriod;
        this.f122276h = chartPeriods;
        this.i = tradingLegalEntityInformation;
        this.f122277j = bVar;
        this.k = historicalChartData;
        this.f122278l = trendViewState;
        this.f122279m = selectedChartValueType;
        this.f122280n = data2;
        this.o = z;
        this.f122281p = z3;
        this.f122282q = z4;
        this.f122283r = z6;
        this.f122284s = chartTabStyle;
    }

    public static c a(c cVar, String str, i4l.a aVar, Data data, n nVar, Data data2, Data data3, eel.c cVar2, Data data4, eel.b bVar, Data data5, TrendViewDelegate.a aVar2, eel.i iVar, Data data6, int i) {
        String ref2 = (i & 1) != 0 ? cVar.f122272a : str;
        i4l.a chartType = (i & 2) != 0 ? cVar.f122273b : aVar;
        Data instrumentTicker = (i & 4) != 0 ? cVar.f122274c : data;
        n nVar2 = (i & 8) != 0 ? cVar.d : nVar;
        Data data7 = (i & 16) != 0 ? cVar.e : data2;
        Data candleStickData = (i & 32) != 0 ? cVar.f : data3;
        eel.c selectedPeriod = (i & 64) != 0 ? cVar.f122275g : cVar2;
        List chartPeriods = cVar.f122276h;
        Data tradingLegalEntityInformation = (i & 256) != 0 ? cVar.i : data4;
        eel.b bVar2 = (i & 512) != 0 ? cVar.f122277j : bVar;
        cVar.getClass();
        Data historicalChartData = (i & 2048) != 0 ? cVar.k : data5;
        TrendViewDelegate.a trendViewState = (i & 4096) != 0 ? cVar.f122278l : aVar2;
        eel.i selectedChartValueType = (i & 8192) != 0 ? cVar.f122279m : iVar;
        Data data8 = (i & 16384) != 0 ? cVar.f122280n : data6;
        cVar.getClass();
        cVar.getClass();
        boolean z = cVar.o;
        boolean z3 = cVar.f122281p;
        boolean z4 = cVar.f122282q;
        boolean z6 = cVar.f122283r;
        eel.d chartTabStyle = cVar.f122284s;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(candleStickData, "candleStickData");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(historicalChartData, "historicalChartData");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        Intrinsics.checkNotNullParameter(selectedChartValueType, "selectedChartValueType");
        Intrinsics.checkNotNullParameter(chartTabStyle, "chartTabStyle");
        return new c(ref2, chartType, instrumentTicker, nVar2, data7, candleStickData, selectedPeriod, chartPeriods, tradingLegalEntityInformation, bVar2, historicalChartData, trendViewState, selectedChartValueType, data8, z, z3, z4, z6, chartTabStyle);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f122272a, cVar.f122272a) && this.f122273b == cVar.f122273b && Intrinsics.f(this.f122274c, cVar.f122274c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f122275g == cVar.f122275g && Intrinsics.f(this.f122276h, cVar.f122276h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f122277j, cVar.f122277j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f122278l, cVar.f122278l) && this.f122279m == cVar.f122279m && Intrinsics.f(this.f122280n, cVar.f122280n) && this.o == cVar.o && this.f122281p == cVar.f122281p && this.f122282q == cVar.f122282q && this.f122283r == cVar.f122283r && this.f122284s == cVar.f122284s;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f122274c, (this.f122273b.hashCode() + (this.f122272a.hashCode() * 31)) * 31, 31);
        n nVar = this.d;
        int iHashCode = (iC + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Data data = this.e;
        int iC2 = kii.e.c(this.i, p.a.d(o.c(this.f122275g, kii.e.c(this.f, (iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31), 31), 31, this.f122276h), 31);
        eel.b bVar = this.f122277j;
        int iHashCode2 = (this.f122279m.hashCode() + ((this.f122278l.hashCode() + kii.e.c(this.k, j6.a.c((iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, true), 31)) * 31)) * 31;
        Data data2 = this.f122280n;
        return this.f122284s.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (data2 != null ? data2.hashCode() : 0)) * 31, 31, true), 31, true), 31, this.o), 31, this.f122281p), 31, this.f122282q), 31, this.f122283r);
    }
}
