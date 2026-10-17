package g6f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdh.c f140920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f140921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f140922c;

    public b(pdh.c selectedChartPeriod, od0.i chartSelection, Data chartData) {
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(chartSelection, "chartSelection");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.f140920a = selectedChartPeriod;
        this.f140921b = chartSelection;
        this.f140922c = chartData;
    }

    public static b a(b bVar, pdh.c selectedChartPeriod, od0.i chartSelection, Data chartData, int i) {
        if ((i & 1) != 0) {
            selectedChartPeriod = bVar.f140920a;
        }
        if ((i & 2) != 0) {
            chartSelection = bVar.f140921b;
        }
        if ((i & 4) != 0) {
            chartData = bVar.f140922c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(chartSelection, "chartSelection");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new b(selectedChartPeriod, chartSelection, chartData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f140920a == bVar.f140920a && Intrinsics.f(this.f140921b, bVar.f140921b) && Intrinsics.f(this.f140922c, bVar.f140922c);
    }

    public final int hashCode() {
        return this.f140922c.hashCode() + r6.b.f(this.f140921b, this.f140920a.hashCode() * 31, 31);
    }
}
