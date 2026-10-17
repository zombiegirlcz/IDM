package cm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25134c;
    public final Long d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xi0.b f25135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f25136h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f25137j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f25138l;

    public p(long j2, long j3, long j5, Long l2, long j16, long j22, xi0.b currency, long j42, Long l3, Long l4, long j46, long j47) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f25132a = j2;
        this.f25133b = j3;
        this.f25134c = j5;
        this.d = l2;
        this.e = j16;
        this.f = j22;
        this.f25135g = currency;
        this.f25136h = j42;
        this.i = l3;
        this.f25137j = l4;
        this.k = j46;
        this.f25138l = j47;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f25132a == pVar.f25132a && this.f25133b == pVar.f25133b && this.f25134c == pVar.f25134c && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e && this.f == pVar.f && Intrinsics.f(this.f25135g, pVar.f25135g) && this.f25136h == pVar.f25136h && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f25137j, pVar.f25137j) && this.k == pVar.k && this.f25138l == pVar.f25138l;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(Long.hashCode(this.f25132a) * 31, 31, this.f25133b), 31, this.f25134c);
        Long l2 = this.d;
        int iC2 = a0.d.c(h30.l.j(this.f25135g, a0.d.c(a0.d.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f), 31), 31, this.f25136h);
        Long l3 = this.i;
        int iHashCode = (iC2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f25137j;
        return Long.hashCode(this.f25138l) + a0.d.c((iHashCode + (l4 != null ? l4.hashCode() : 0)) * 31, 31, this.k);
    }
}
