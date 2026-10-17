package x5f;

import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BenchmarkInfo f302959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pdh.c f302960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f302961c;

    public f(BenchmarkInfo selectedBenchmark, pdh.c selectedTimeSpan, boolean z) {
        Intrinsics.checkNotNullParameter(selectedBenchmark, "selectedBenchmark");
        Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
        this.f302959a = selectedBenchmark;
        this.f302960b = selectedTimeSpan;
        this.f302961c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f302959a, fVar.f302959a) && this.f302960b == fVar.f302960b && this.f302961c == fVar.f302961c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302961c) + ((this.f302960b.hashCode() + (this.f302959a.hashCode() * 31)) * 31);
    }
}
