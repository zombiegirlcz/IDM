package jel;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes12.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f173604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f173605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f173606c;
    public final int d;
    public final Instant e;

    public x2(dj0.d high, dj0.d low, dj0.d mean, int i, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f173604a = high;
        this.f173605b = low;
        this.f173606c = mean;
        this.d = i;
        this.e = updatedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.f173604a, x2Var.f173604a) && Intrinsics.f(this.f173605b, x2Var.f173605b) && Intrinsics.f(this.f173606c, x2Var.f173606c) && this.d == x2Var.d && Intrinsics.f(this.e, x2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, v7.c(v7.c(this.f173604a.hashCode() * 31, 31, this.f173605b), 31, this.f173606c), 31);
    }
}
