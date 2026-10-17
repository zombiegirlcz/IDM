package t7f;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f268658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f268659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v7f.a f268660c;
    public final w7f.a d;
    public final d1h.g e;

    public d(Data benchmarkInfo, Data riskMetrics, v7f.a aVar, w7f.a aVar2, d1h.g gVar) {
        Intrinsics.checkNotNullParameter(benchmarkInfo, "benchmarkInfo");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        this.f268658a = benchmarkInfo;
        this.f268659b = riskMetrics;
        this.f268660c = aVar;
        this.d = aVar2;
        this.e = gVar;
    }

    public static d a(d dVar, Data data, Data data2, v7f.a aVar, w7f.a aVar2, d1h.g gVar, int i) {
        if ((i & 1) != 0) {
            data = dVar.f268658a;
        }
        Data benchmarkInfo = data;
        if ((i & 2) != 0) {
            data2 = dVar.f268659b;
        }
        Data riskMetrics = data2;
        if ((i & 4) != 0) {
            aVar = dVar.f268660c;
        }
        v7f.a aVar3 = aVar;
        if ((i & 8) != 0) {
            aVar2 = dVar.d;
        }
        w7f.a aVar4 = aVar2;
        if ((i & 16) != 0) {
            gVar = dVar.e;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(benchmarkInfo, "benchmarkInfo");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        return new d(benchmarkInfo, riskMetrics, aVar3, aVar4, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f268658a, dVar.f268658a) && Intrinsics.f(this.f268659b, dVar.f268659b) && Intrinsics.f(this.f268660c, dVar.f268660c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f268659b, this.f268658a.hashCode() * 31, 31);
        v7f.a aVar = this.f268660c;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        w7f.a aVar2 = this.d;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        d1h.g gVar = this.e;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }
}
