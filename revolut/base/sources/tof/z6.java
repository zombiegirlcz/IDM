package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273198c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f273199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f273200h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f273201j;
    public final w5 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final do3.b f273202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final do3.c f273203m;

    public z6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, w5 w5Var, do3.b appMode, do3.c cVar) {
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        this.f273196a = str;
        this.f273197b = str2;
        this.f273198c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f273199g = str7;
        this.f273200h = str8;
        this.i = str9;
        this.f273201j = str10;
        this.k = w5Var;
        this.f273202l = appMode;
        this.f273203m = cVar;
    }

    public final String N0() {
        return this.f273200h;
    }

    public final do3.b a() {
        return this.f273202l;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        String str = this.f273197b;
        if (str != null && str.length() != 0) {
            return str;
        }
        String str2 = this.d;
        String str3 = this.f273198c;
        if ((str3 == null || str3.length() == 0) && (str2 == null || str2.length() == 0)) {
            String str4 = this.f;
            return (str4 == null || str4.length() == 0) ? "" : str4;
        }
        String[] elements = {str3, str2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62);
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj2;
        return Intrinsics.f(this.f273196a, z6Var.f273196a) && Intrinsics.f(this.f273197b, z6Var.f273197b) && Intrinsics.f(this.f273198c, z6Var.f273198c) && Intrinsics.f(this.d, z6Var.d) && Intrinsics.f(this.e, z6Var.e) && Intrinsics.f(this.f, z6Var.f) && Intrinsics.f(this.f273199g, z6Var.f273199g) && Intrinsics.f(this.f273200h, z6Var.f273200h) && Intrinsics.f(this.i, z6Var.i) && Intrinsics.f(this.f273201j, z6Var.f273201j) && Intrinsics.f(this.k, z6Var.k) && this.f273202l == z6Var.f273202l && this.f273203m == z6Var.f273203m;
    }

    public final String getCode() {
        return this.i;
    }

    public final String getCountry() {
        return this.f273201j;
    }

    public final String getFirstName() {
        return this.f273198c;
    }

    public final String getLastName() {
        return this.d;
    }

    public final String getLegalName() {
        return this.f273197b;
    }

    public final String getPhone() {
        return this.f273199g;
    }

    public final int hashCode() {
        String str = this.f273196a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273197b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f273198c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f273199g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f273200h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f273201j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        w5 w5Var = this.k;
        int iHashCode11 = (this.f273202l.hashCode() + ((iHashCode10 + (w5Var == null ? 0 : w5Var.hashCode())) * 31)) * 31;
        do3.c cVar = this.f273203m;
        return iHashCode11 + (cVar != null ? cVar.hashCode() : 0);
    }
}
