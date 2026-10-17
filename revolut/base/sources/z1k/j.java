package z1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f318867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f318868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f318869c;
    public final long d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f318870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f318871h;

    public j(f fVar, f fVar2, long j2, long j3, long j5, long j16, long j22, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f318867a = fVar;
        this.f318868b = fVar2;
        this.f318869c = j2;
        this.d = j3;
        this.e = j5;
        this.f = j16;
        this.f318870g = j22;
        this.f318871h = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f318867a, jVar.f318867a) && Intrinsics.f(this.f318868b, jVar.f318868b) && this.f318869c == jVar.f318869c && this.d == jVar.d && this.e == jVar.e && this.f == jVar.f && this.f318870g == jVar.f318870g && Intrinsics.f(this.f318871h, jVar.f318871h);
    }

    public final int hashCode() {
        f fVar = this.f318867a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.f318868b;
        return this.f318871h.hashCode() + a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c((iHashCode + (fVar2 != null ? fVar2.hashCode() : 0)) * 31, 31, this.f318869c), 31, this.d), 31, this.e), 31, this.f), 31, this.f318870g);
    }
}
