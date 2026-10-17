package wyg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vyg.h f301285a;

    public d(vyg.h benchmark) {
        Intrinsics.checkNotNullParameter(benchmark, "benchmark");
        this.f301285a = benchmark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f301285a, ((d) obj2).f301285a);
    }

    public final int hashCode() {
        return this.f301285a.hashCode();
    }
}
