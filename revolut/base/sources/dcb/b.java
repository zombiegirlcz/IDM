package dcb;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f112852c;
    public final xi0.b d;
    public final long e;

    public b(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, long j5) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f112850a = j2;
        this.f112851b = j3;
        this.f112852c = targetCurrency;
        this.d = sourceCurrency;
        this.e = j5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f112850a == bVar.f112850a && this.f112851b == bVar.f112851b && Intrinsics.f(this.f112852c, bVar.f112852c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + l.j(this.d, l.j(this.f112852c, a0.d.c(Long.hashCode(this.f112850a) * 31, 31, this.f112851b), 31), 31);
    }
}
