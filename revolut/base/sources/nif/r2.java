package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f216024c;
    public final String d;
    public final String e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f216025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f216026h;
    public final jo3.b i;

    public r2(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, jo3.b bVar, jo3.b bVar2) {
        this.f216022a = str;
        this.f216023b = str2;
        this.f216024c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.f216025g = bool2;
        this.f216026h = bVar;
        this.i = bVar2;
    }

    public final Boolean a() {
        return this.f216025g;
    }

    public final jo3.b b() {
        return this.i;
    }

    public final String c() {
        return this.f216022a;
    }

    public final jo3.b d() {
        return this.f216026h;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f216022a, r2Var.f216022a) && Intrinsics.f(this.f216023b, r2Var.f216023b) && Intrinsics.f(this.f216024c, r2Var.f216024c) && Intrinsics.f(this.d, r2Var.d) && Intrinsics.f(this.e, r2Var.e) && Intrinsics.f(this.f, r2Var.f) && Intrinsics.f(this.f216025g, r2Var.f216025g) && Intrinsics.f(this.f216026h, r2Var.f216026h) && Intrinsics.f(this.i, r2Var.i);
    }

    public final String f() {
        return this.f216023b;
    }

    public final Boolean g() {
        return this.f;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f216022a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f216023b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f216024c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f216025g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        jo3.b bVar = this.f216026h;
        int iHashCode8 = (iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.i;
        return iHashCode8 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public final String i() {
        return this.f216024c;
    }
}
