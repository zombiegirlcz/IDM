package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f216086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f216087c;
    public final long d;
    public final double e;

    public z0(String facilityId, double d, double d5, long j2, double d6) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f216085a = facilityId;
        this.f216086b = d;
        this.f216087c = d5;
        this.d = j2;
        this.e = d6;
    }

    public final double a() {
        return this.e;
    }

    public final String b() {
        return this.f216085a;
    }

    public final double c() {
        return this.f216086b;
    }

    public final long d() {
        return this.d;
    }

    public final double e() {
        return this.f216087c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f216085a, z0Var.f216085a) && Double.compare(this.f216086b, z0Var.f216086b) == 0 && Double.compare(this.f216087c, z0Var.f216087c) == 0 && this.d == z0Var.d && Double.compare(this.e, z0Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + a0.d.c(m72.b.c(m72.b.c(this.f216085a.hashCode() * 31, this.f216086b, 31), this.f216087c, 31), 31, this.d);
    }
}
