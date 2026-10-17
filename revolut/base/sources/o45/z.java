package o45;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f222153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f222154c;
    public final long d;
    public final c e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f222155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f222156h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f222157j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f222158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f222159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f222160n;
    public final String o;

    public z(String id10, int i, int i2, long j2, c accruedInterest, c accruedFee, c oneTimeFee, long j3, boolean z, v unavailableFeatures, List borrowers, g gVar, j jVar, s repaymentConfig, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
        Intrinsics.checkNotNullParameter(accruedFee, "accruedFee");
        Intrinsics.checkNotNullParameter(oneTimeFee, "oneTimeFee");
        Intrinsics.checkNotNullParameter(unavailableFeatures, "unavailableFeatures");
        Intrinsics.checkNotNullParameter(borrowers, "borrowers");
        Intrinsics.checkNotNullParameter(repaymentConfig, "repaymentConfig");
        this.f222152a = id10;
        this.f222153b = i;
        this.f222154c = i2;
        this.d = j2;
        this.e = accruedInterest;
        this.f = accruedFee;
        this.f222155g = oneTimeFee;
        this.f222156h = j3;
        this.i = z;
        this.f222157j = unavailableFeatures;
        this.k = borrowers;
        this.f222158l = gVar;
        this.f222159m = jVar;
        this.f222160n = repaymentConfig;
        this.o = str;
    }

    public final c a() {
        return this.f;
    }

    public final c b() {
        return this.e;
    }

    public final String c() {
        return this.o;
    }

    public final g d() {
        return this.f222158l;
    }

    public final j e() {
        return this.f222159m;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f222152a, zVar.f222152a) && this.f222153b == zVar.f222153b && this.f222154c == zVar.f222154c && this.d == zVar.d && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f222155g, zVar.f222155g) && this.f222156h == zVar.f222156h && this.i == zVar.i && Intrinsics.f(this.f222157j, zVar.f222157j) && Intrinsics.f(this.k, zVar.k) && Intrinsics.f(this.f222158l, zVar.f222158l) && Intrinsics.f(this.f222159m, zVar.f222159m) && Intrinsics.f(this.f222160n, zVar.f222160n) && Intrinsics.f(this.o, zVar.o);
    }

    public final List f() {
        return this.k;
    }

    public final int g() {
        return this.f222153b;
    }

    public final String h() {
        return this.f222152a;
    }

    public final int hashCode() {
        int iD = p.a.d((this.f222157j.hashCode() + j6.a.c(a0.d.c((this.f222155g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + a0.d.c(j6.a.b(this.f222154c, j6.a.b(this.f222153b, this.f222152a.hashCode() * 31, 31), 31), 31, this.d)) * 31)) * 31)) * 31, 31, this.f222156h), 31, this.i)) * 31, 31, this.k);
        g gVar = this.f222158l;
        int iHashCode = (iD + (gVar == null ? 0 : gVar.hashCode())) * 31;
        j jVar = this.f222159m;
        int iHashCode2 = (this.f222160n.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31;
        String str = this.o;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final long i() {
        return this.f222156h;
    }

    public final c j() {
        return this.f222155g;
    }

    public final long k() {
        return this.d;
    }

    public final s l() {
        return this.f222160n;
    }

    public final int m() {
        return this.f222154c;
    }

    public final v n() {
        return this.f222157j;
    }

    public final boolean o() {
        return this.i;
    }
}
