package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215839c;
    public final String d;
    public final String e;
    public final String f;

    public h(String id10, String str, String str2, String type, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f215837a = id10;
        this.f215838b = str;
        this.f215839c = str2;
        this.d = type;
        this.e = str3;
        this.f = str4;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.f215839c;
    }

    public final String d() {
        return this.f215837a;
    }

    public final String e() {
        return this.f215838b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f215837a, hVar.f215837a) && Intrinsics.f(this.f215838b, hVar.f215838b) && Intrinsics.f(this.f215839c, hVar.f215839c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f215837a.hashCode() * 31;
        String str = this.f215838b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215839c;
        int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
