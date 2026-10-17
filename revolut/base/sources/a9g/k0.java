package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f2523c;
    public final a d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f2525h;

    public k0(String id10, String name, l0 l0Var, a address, String str, String str2, String str3, i0 i0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f2521a = id10;
        this.f2522b = name;
        this.f2523c = l0Var;
        this.d = address;
        this.e = str;
        this.f = str2;
        this.f2524g = str3;
        this.f2525h = i0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f2521a, k0Var.f2521a) && Intrinsics.f(this.f2522b, k0Var.f2522b) && Intrinsics.f(this.f2523c, k0Var.f2523c) && Intrinsics.f(this.d, k0Var.d) && Intrinsics.f(this.e, k0Var.e) && Intrinsics.f(this.f, k0Var.f) && Intrinsics.f(this.f2524g, k0Var.f2524g) && Intrinsics.f(this.f2525h, k0Var.f2525h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f2521a.hashCode() * 31, 31, this.f2522b);
        l0 l0Var = this.f2523c;
        int iHashCode = (this.d.hashCode() + ((iC + (l0Var == null ? 0 : l0Var.hashCode())) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2524g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i0 i0Var = this.f2525h;
        return iHashCode4 + (i0Var != null ? i0Var.hashCode() : 0);
    }
}
