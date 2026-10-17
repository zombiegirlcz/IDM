package x6f;

import aii.r;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements r {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BenchmarkInfo f303091a;

    public h(BenchmarkInfo benchmarkInfo) {
        this.f303091a = benchmarkInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f303091a, ((h) obj2).f303091a);
    }

    public final int hashCode() {
        BenchmarkInfo benchmarkInfo = this.f303091a;
        if (benchmarkInfo == null) {
            return 0;
        }
        return benchmarkInfo.hashCode();
    }
}
