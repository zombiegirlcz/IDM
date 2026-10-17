package u87;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f278129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f278130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f278131c;
    public final Data d;
    public final TrendViewDelegate.a e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f278132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TradingLegalEntityInformation f278133h;
    public final Data i;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data data, eel.c cVar, Data data2, Data data3, TrendViewDelegate.a aVar, Data data4, Data data5, TradingLegalEntityInformation tradingLegalEntityInformation, Data data6, int i) {
        if ((i & 1) != 0) {
            data = eVar.f278129a;
        }
        Data details = data;
        if ((i & 2) != 0) {
            cVar = eVar.f278130b;
        }
        eel.c cVar2 = cVar;
        if ((i & 4) != 0) {
            data2 = eVar.f278131c;
        }
        Data instrumentTicker = data2;
        if ((i & 8) != 0) {
            data3 = eVar.d;
        }
        Data historicalChartData = data3;
        if ((i & 16) != 0) {
            aVar = eVar.e;
        }
        TrendViewDelegate.a trendViewState = aVar;
        Data data7 = (i & 32) != 0 ? eVar.f : data4;
        Data data8 = (i & 64) != 0 ? eVar.f278132g : data5;
        TradingLegalEntityInformation tradingLegalEntityInformation2 = (i & 128) != 0 ? eVar.f278133h : tradingLegalEntityInformation;
        Data data9 = (i & 256) != 0 ? eVar.i : data6;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(historicalChartData, "historicalChartData");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        return new e(details, cVar2, instrumentTicker, historicalChartData, trendViewState, data7, data8, tradingLegalEntityInformation2, data9);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f278129a, eVar.f278129a) && this.f278130b == eVar.f278130b && Intrinsics.f(this.f278131c, eVar.f278131c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f278132g, eVar.f278132g) && Intrinsics.f(this.f278133h, eVar.f278133h) && Intrinsics.f(this.i, eVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f278129a.hashCode() * 31;
        eel.c cVar = this.f278130b;
        int iHashCode2 = (this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f278131c, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31)) * 31;
        Data data = this.f;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f278132g;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        TradingLegalEntityInformation tradingLegalEntityInformation = this.f278133h;
        int iHashCode5 = (iHashCode4 + (tradingLegalEntityInformation == null ? 0 : tradingLegalEntityInformation.hashCode())) * 31;
        Data data3 = this.i;
        return iHashCode5 + (data3 != null ? data3.hashCode() : 0);
    }

    public e(Data details, eel.c cVar, Data instrumentTicker, Data historicalChartData, TrendViewDelegate.a trendViewState, Data data, Data data2, TradingLegalEntityInformation tradingLegalEntityInformation, Data data3) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(historicalChartData, "historicalChartData");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        this.f278129a = details;
        this.f278130b = cVar;
        this.f278131c = instrumentTicker;
        this.d = historicalChartData;
        this.e = trendViewState;
        this.f = data;
        this.f278132g = data2;
        this.f278133h = tradingLegalEntityInformation;
        this.i = data3;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), TrendViewDelegate.a.C0428a.f53562a, null, null, null, null);
    }
}
