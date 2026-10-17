package sqg;

import a0.d;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f265093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f265094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f265095c;
    public final xi0.b d;
    public final long e;
    public final long f;

    public b(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, long j5, long j16) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f265093a = j2;
        this.f265094b = j3;
        this.f265095c = targetCurrency;
        this.d = sourceCurrency;
        this.e = j5;
        this.f = j16;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f265093a == bVar.f265093a && this.f265094b == bVar.f265094b && Intrinsics.f(this.f265095c, bVar.f265095c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + d.c(l.j(this.d, l.j(this.f265095c, d.c(Long.hashCode(this.f265093a) * 31, 31, this.f265094b), 31), 31), 31, this.e);
    }
}
