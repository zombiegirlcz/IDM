package srf;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f265207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f265208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f265209c;
    public final xi0.b d;
    public final double e;
    public final long f;

    public b(long j2, long j3, xi0.b sourceCurrency, xi0.b targetCurrency, double d, long j5) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f265207a = j2;
        this.f265208b = j3;
        this.f265209c = sourceCurrency;
        this.d = targetCurrency;
        this.e = d;
        this.f = j5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f265207a == bVar.f265207a && this.f265208b == bVar.f265208b && Intrinsics.f(this.f265209c, bVar.f265209c) && Intrinsics.f(this.d, bVar.d) && Double.compare(this.e, bVar.e) == 0 && this.f == bVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + m72.b.c(l.j(this.d, l.j(this.f265209c, a0.d.c(Long.hashCode(this.f265207a) * 31, 31, this.f265208b), 31), 31), this.e, 31);
    }
}
