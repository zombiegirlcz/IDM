package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f216083c;
    public final Boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f216084g;

    public z(String legId, String str, a3 a3Var, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f216081a = legId;
        this.f216082b = str;
        this.f216083c = a3Var;
        this.d = bool;
        this.e = str2;
        this.f = str3;
        this.f216084g = str4;
    }

    public final Boolean a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final a3 c() {
        return this.f216083c;
    }

    public final String d() {
        return this.f216081a;
    }

    public final String e() {
        return this.f216084g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f216081a, zVar.f216081a) && Intrinsics.f(this.f216082b, zVar.f216082b) && Intrinsics.f(this.f216083c, zVar.f216083c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f216084g, zVar.f216084g);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.f216082b;
    }

    public final int hashCode() {
        int iHashCode = this.f216081a.hashCode() * 31;
        String str = this.f216082b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a3 a3Var = this.f216083c;
        int iHashCode3 = (iHashCode2 + (a3Var == null ? 0 : a3Var.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f216084g;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }
}
