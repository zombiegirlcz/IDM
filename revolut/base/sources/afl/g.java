package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f4596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f4597b;

    public g(ej0.b low, ej0.b high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        this.f4596a = low;
        this.f4597b = high;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f4596a, gVar.f4596a) && Intrinsics.f(this.f4597b, gVar.f4597b);
    }

    public final int hashCode() {
        return this.f4597b.hashCode() + (this.f4596a.hashCode() * 31);
    }
}
