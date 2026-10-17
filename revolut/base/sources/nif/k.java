package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215879c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f215880g;

    public k(String str, String str2, String str3, String str4, String str5, String str6, m mVar) {
        this.f215877a = str;
        this.f215878b = str2;
        this.f215879c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f215880g = mVar;
    }

    public final String a() {
        return this.f215879c;
    }

    public final String b() {
        return this.e;
    }

    public final m c() {
        return this.f215880g;
    }

    public final String d() {
        return this.f215877a;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f215877a, kVar.f215877a) && Intrinsics.f(this.f215878b, kVar.f215878b) && Intrinsics.f(this.f215879c, kVar.f215879c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f215880g, kVar.f215880g);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.f215878b;
    }

    public final int hashCode() {
        String str = this.f215877a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215878b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215879c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        m mVar = this.f215880g;
        return iHashCode6 + (mVar != null ? mVar.hashCode() : 0);
    }
}
