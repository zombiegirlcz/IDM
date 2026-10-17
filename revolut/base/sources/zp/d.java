package zp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f324087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f324088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f324089c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f324090g;

    public d(c priority, int i, long j2, int i2, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f324087a = priority;
        this.f324088b = i;
        this.f324089c = j2;
        this.d = i2;
        this.e = z;
        this.f = z3;
        this.f324090g = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f324087a == dVar.f324087a && this.f324088b == dVar.f324088b && this.f324089c == dVar.f324089c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.f324090g == dVar.f324090g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f324090g) + j6.a.c(j6.a.c(j6.a.b(this.d, a0.d.c(j6.a.b(this.f324088b, this.f324087a.hashCode() * 31, 31), 31, this.f324089c), 31), 31, this.e), 31, this.f);
    }
}
