package i6f;

import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BenchmarkInfo f158918a;

    public c0(BenchmarkInfo benchmark) {
        Intrinsics.checkNotNullParameter(benchmark, "benchmark");
        this.f158918a = benchmark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f158918a, ((c0) obj2).f158918a);
    }

    public final int hashCode() {
        return this.f158918a.hashCode();
    }
}
