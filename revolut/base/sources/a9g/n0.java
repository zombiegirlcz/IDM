package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2541c;
    public final String d;
    public final String e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f2542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f2543h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2544j;

    public n0(String id10, String type, String name, String description, String str, k country, Integer num, i coordinates, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f2539a = id10;
        this.f2540b = type;
        this.f2541c = name;
        this.d = description;
        this.e = str;
        this.f = country;
        this.f2542g = num;
        this.f2543h = coordinates;
        this.i = z;
        this.f2544j = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f2539a, n0Var.f2539a) && Intrinsics.f(this.f2540b, n0Var.f2540b) && Intrinsics.f(this.f2541c, n0Var.f2541c) && Intrinsics.f(this.d, n0Var.d) && Intrinsics.f(this.e, n0Var.e) && Intrinsics.f(this.f, n0Var.f) && Intrinsics.f(this.f2542g, n0Var.f2542g) && Intrinsics.f(this.f2543h, n0Var.f2543h) && this.i == n0Var.i && this.f2544j == n0Var.f2544j;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f2539a.hashCode() * 31, 31, this.f2540b), 31, this.f2541c), 31, this.d);
        String str = this.e;
        int iHashCode = (this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.f2542g;
        return Boolean.hashCode(this.f2544j) + j6.a.c((this.f2543h.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.i);
    }
}
