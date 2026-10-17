package x6f;

import com.revolut.data.model.Data;
import com.revolut.feature.robo.api.model.Benchmark;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Benchmark f303089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f303090b;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f303089a, fVar.f303089a) && Intrinsics.f(this.f303090b, fVar.f303090b);
    }

    public final int hashCode() {
        Benchmark benchmark = this.f303089a;
        return this.f303090b.hashCode() + ((benchmark == null ? 0 : benchmark.hashCode()) * 31);
    }

    public f(Benchmark benchmark, Data benchmarks) {
        Intrinsics.checkNotNullParameter(benchmarks, "benchmarks");
        this.f303089a = benchmark;
        this.f303090b = benchmarks;
    }

    public /* synthetic */ f(int i) {
        this(null, new Data(null, null, true, 3, null));
    }
}
