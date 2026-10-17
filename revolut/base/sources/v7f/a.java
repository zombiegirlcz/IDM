package v7f;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f286624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f286625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BenchmarkInfo f286626c;
    public final pdh.c d;
    public final boolean e;

    public a(Data drawdownData, Data riskMetrics, BenchmarkInfo benchmarkInfo, pdh.c selectedChartPeriod, boolean z) {
        Intrinsics.checkNotNullParameter(drawdownData, "drawdownData");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        this.f286624a = drawdownData;
        this.f286625b = riskMetrics;
        this.f286626c = benchmarkInfo;
        this.d = selectedChartPeriod;
        this.e = z;
    }

    public static a a(a aVar, Data data, Data data2, BenchmarkInfo benchmarkInfo, pdh.c cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            data = aVar.f286624a;
        }
        Data drawdownData = data;
        if ((i & 2) != 0) {
            data2 = aVar.f286625b;
        }
        Data riskMetrics = data2;
        if ((i & 4) != 0) {
            benchmarkInfo = aVar.f286626c;
        }
        BenchmarkInfo benchmarkInfo2 = benchmarkInfo;
        if ((i & 8) != 0) {
            cVar = aVar.d;
        }
        pdh.c selectedChartPeriod = cVar;
        if ((i & 16) != 0) {
            z = aVar.e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(drawdownData, "drawdownData");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        return new a(drawdownData, riskMetrics, benchmarkInfo2, selectedChartPeriod, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f286624a, aVar.f286624a) && Intrinsics.f(this.f286625b, aVar.f286625b) && Intrinsics.f(this.f286626c, aVar.f286626c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f286625b, this.f286624a.hashCode() * 31, 31);
        BenchmarkInfo benchmarkInfo = this.f286626c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iC + (benchmarkInfo == null ? 0 : benchmarkInfo.hashCode())) * 31)) * 31);
    }
}
