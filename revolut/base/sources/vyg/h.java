package vyg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f293319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lwg.a f293320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f293321c;
    public final String d;

    public h(boolean z, lwg.a benchmark) {
        Intrinsics.checkNotNullParameter(benchmark, "benchmark");
        this.f293319a = z;
        this.f293320b = benchmark;
        this.f293321c = benchmark.f200457a;
        this.d = benchmark.f200458b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f293319a == hVar.f293319a && Intrinsics.f(this.f293320b, hVar.f293320b);
    }

    public final int hashCode() {
        return this.f293320b.hashCode() + (Boolean.hashCode(this.f293319a) * 31);
    }
}
