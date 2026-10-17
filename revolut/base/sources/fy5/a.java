package fy5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qta.f f138911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f138912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f138913c;
    public final Data d;

    public a(qta.f selectedChartPeriod, od0.i selectedChartPoint, Data collectionData, Data chartData) {
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(selectedChartPoint, "selectedChartPoint");
        Intrinsics.checkNotNullParameter(collectionData, "collectionData");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.f138911a = selectedChartPeriod;
        this.f138912b = selectedChartPoint;
        this.f138913c = collectionData;
        this.d = chartData;
    }

    public static a a(a aVar, qta.f selectedChartPeriod, od0.i selectedChartPoint, Data collectionData, Data chartData, int i) {
        if ((i & 1) != 0) {
            selectedChartPeriod = aVar.f138911a;
        }
        if ((i & 2) != 0) {
            selectedChartPoint = aVar.f138912b;
        }
        if ((i & 4) != 0) {
            collectionData = aVar.f138913c;
        }
        if ((i & 8) != 0) {
            chartData = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(selectedChartPoint, "selectedChartPoint");
        Intrinsics.checkNotNullParameter(collectionData, "collectionData");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new a(selectedChartPeriod, selectedChartPoint, collectionData, chartData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f138911a == aVar.f138911a && Intrinsics.f(this.f138912b, aVar.f138912b) && Intrinsics.f(this.f138913c, aVar.f138913c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f138913c, r6.b.f(this.f138912b, this.f138911a.hashCode() * 31, 31), 31);
    }
}
