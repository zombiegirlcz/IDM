package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2552c;
    public final String d;
    public final double e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0 f2554h;

    public o0(String id10, String type, String start, String end2, double d, String locationId, boolean z, p0 p0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        this.f2550a = id10;
        this.f2551b = type;
        this.f2552c = start;
        this.d = end2;
        this.e = d;
        this.f = locationId;
        this.f2553g = z;
        this.f2554h = p0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f2550a, o0Var.f2550a) && Intrinsics.f(this.f2551b, o0Var.f2551b) && Intrinsics.f(this.f2552c, o0Var.f2552c) && Intrinsics.f(this.d, o0Var.d) && Double.compare(this.e, o0Var.e) == 0 && Intrinsics.f(this.f, o0Var.f) && this.f2553g == o0Var.f2553g && Intrinsics.f(this.f2554h, o0Var.f2554h);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(m72.b.c(p.a.c(p.a.c(p.a.c(this.f2550a.hashCode() * 31, 31, this.f2551b), 31, this.f2552c), 31, this.d), this.e, 31), 31, this.f), 31, this.f2553g);
        p0 p0Var = this.f2554h;
        return iC + (p0Var == null ? 0 : p0Var.hashCode());
    }
}
