package j4h;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f171383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f171384c;
    public final List d;
    public final eel.c e;
    public final TrendViewDelegate.a f;

    public e(String widgetId, Data data, Data data2, List chartPeriods, eel.c selectedChartPeriod, TrendViewDelegate.a trendViewState) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        this.f171382a = widgetId;
        this.f171383b = data;
        this.f171384c = data2;
        this.d = chartPeriods;
        this.e = selectedChartPeriod;
        this.f = trendViewState;
    }

    public static e a(e eVar, Data data, Data data2, eel.c cVar, TrendViewDelegate.a aVar, int i) {
        String widgetId = eVar.f171382a;
        if ((i & 2) != 0) {
            data = eVar.f171383b;
        }
        Data data3 = data;
        if ((i & 4) != 0) {
            data2 = eVar.f171384c;
        }
        Data data4 = data2;
        List chartPeriods = eVar.d;
        if ((i & 16) != 0) {
            cVar = eVar.e;
        }
        eel.c selectedChartPeriod = cVar;
        if ((i & 32) != 0) {
            aVar = eVar.f;
        }
        TrendViewDelegate.a trendViewState = aVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        return new e(widgetId, data3, data4, chartPeriods, selectedChartPeriod, trendViewState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f171382a, eVar.f171382a) && Intrinsics.f(this.f171383b, eVar.f171383b) && Intrinsics.f(this.f171384c, eVar.f171384c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f171382a.hashCode() * 31;
        Data data = this.f171383b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f171384c;
        return this.f.hashCode() + prk.o.c(this.e, p.a.d((iHashCode2 + (data2 != null ? data2.hashCode() : 0)) * 31, 31, this.d), 31);
    }
}
