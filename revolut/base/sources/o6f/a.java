package o6f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdh.c f222572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6f.f f222573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f222574c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, false, 63);
    }

    public static a a(a aVar, pdh.c cVar, a6f.f fVar, Data data, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            cVar = aVar.f222572a;
        }
        pdh.c selectedChartPeriod = cVar;
        if ((i & 2) != 0) {
            fVar = aVar.f222573b;
        }
        a6f.f chartSelection = fVar;
        if ((i & 4) != 0) {
            data = aVar.f222574c;
        }
        Data chartData = data;
        boolean z4 = aVar.d;
        if ((i & 16) != 0) {
            z = aVar.e;
        }
        boolean z6 = z;
        if ((i & 32) != 0) {
            z3 = aVar.f;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(chartSelection, "chartSelection");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new a(selectedChartPeriod, chartSelection, chartData, z4, z6, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f222572a == aVar.f222572a && Intrinsics.f(this.f222573b, aVar.f222573b) && Intrinsics.f(this.f222574c, aVar.f222574c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(kii.e.c(this.f222574c, (this.f222573b.hashCode() + (this.f222572a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
    }

    public a(pdh.c selectedChartPeriod, a6f.f chartSelection, Data chartData, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(chartSelection, "chartSelection");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.f222572a = selectedChartPeriod;
        this.f222573b = chartSelection;
        this.f222574c = chartData;
        this.d = z;
        this.e = z3;
        this.f = z4;
    }

    public /* synthetic */ a(pdh.c cVar, Data data, boolean z, int i) {
        this((i & 1) != 0 ? pdh.c.FIVE_YEARS : cVar, a6f.d.f1671a, (i & 4) != 0 ? new Data(null, null, false, 7, null) : data, (i & 8) != 0 ? false : z, false, true);
    }
}
