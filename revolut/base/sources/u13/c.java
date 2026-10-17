package u13;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276340c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f276342h;
    public final String i;

    public c(String postcode, String country, String cardBrand, String cardDesignCode, String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(cardDesignCode, "cardDesignCode");
        this.f276338a = postcode;
        this.f276339b = country;
        this.f276340c = cardBrand;
        this.d = cardDesignCode;
        this.e = str;
        this.f = str2;
        this.f276341g = str3;
        this.f276342h = z;
        this.i = str4;
    }

    public final String a() {
        return String.valueOf(hashCode());
    }

    public final String b() {
        return this.f276340c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.f276339b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f276338a, cVar.f276338a) && Intrinsics.f(this.f276339b, cVar.f276339b) && Intrinsics.f(this.f276340c, cVar.f276340c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f276341g, cVar.f276341g) && this.f276342h == cVar.f276342h && Intrinsics.f(this.i, cVar.i);
    }

    public final boolean f() {
        return this.f276342h;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.f276338a;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f276338a.hashCode() * 31, 31, this.f276339b), 31, this.f276340c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f276341g;
        int iC2 = j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f276342h);
        String str4 = this.i;
        return (iC2 + (str4 != null ? str4.hashCode() : 0)) * 31;
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.f276341g;
    }
}
