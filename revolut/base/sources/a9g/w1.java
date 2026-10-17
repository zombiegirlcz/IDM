package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2626c;
    public final s1 d;
    public final n1 e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2628h;

    public w1(String id10, long j2, String name, s1 propertyType, n1 location, long j3, long j5, String roomsOccupancy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(propertyType, "propertyType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        this.f2624a = id10;
        this.f2625b = j2;
        this.f2626c = name;
        this.d = propertyType;
        this.e = location;
        this.f = j3;
        this.f2627g = j5;
        this.f2628h = roomsOccupancy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f2624a, w1Var.f2624a) && this.f2625b == w1Var.f2625b && Intrinsics.f(this.f2626c, w1Var.f2626c) && Intrinsics.f(this.d, w1Var.d) && Intrinsics.f(this.e, w1Var.e) && this.f == w1Var.f && this.f2627g == w1Var.f2627g && Intrinsics.f(this.f2628h, w1Var.f2628h);
    }

    public final int hashCode() {
        return this.f2628h.hashCode() + a0.d.c(a0.d.c((this.e.hashCode() + ((this.d.hashCode() + p.a.c(a0.d.c(this.f2624a.hashCode() * 31, 31, this.f2625b), 31, this.f2626c)) * 31)) * 31, 31, this.f), 31, this.f2627g);
    }
}
