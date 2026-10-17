package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f2606c;
    public final long d;
    public final long e;
    public final String f;

    public v1(int i, long j2, z1 type, long j3, long j5, String roomsOccupancy) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        this.f2604a = i;
        this.f2605b = j2;
        this.f2606c = type;
        this.d = j3;
        this.e = j5;
        this.f = roomsOccupancy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return this.f2604a == v1Var.f2604a && this.f2605b == v1Var.f2605b && Intrinsics.f(this.f2606c, v1Var.f2606c) && this.d == v1Var.d && this.e == v1Var.e && Intrinsics.f(this.f, v1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a0.d.c(a0.d.c((this.f2606c.hashCode() + a0.d.c(Integer.hashCode(this.f2604a) * 31, 31, this.f2605b)) * 31, 31, this.d), 31, this.e);
    }
}
