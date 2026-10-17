package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f4647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f4648b;

    public t0(dj0.d low, dj0.d high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        this.f4647a = low;
        this.f4648b = high;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f4647a, t0Var.f4647a) && Intrinsics.f(this.f4648b, t0Var.f4648b);
    }

    public final int hashCode() {
        return this.f4648b.hashCode() + (this.f4647a.hashCode() * 31);
    }
}
