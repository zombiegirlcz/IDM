package ml3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f206611c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f206612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f206613h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f206614j;
    public final long k;

    public o(String code, String username, String legalName, String firstName, String lastName, String country, String appMode, String type, String str, int i, long j2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f206609a = code;
        this.f206610b = username;
        this.f206611c = legalName;
        this.d = firstName;
        this.e = lastName;
        this.f = country;
        this.f206612g = appMode;
        this.f206613h = type;
        this.i = str;
        this.f206614j = i;
        this.k = j2;
    }

    public final String a() {
        return this.f206612g;
    }

    public final String b() {
        return this.i;
    }

    public final String c() {
        return this.f206609a;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f206609a, oVar.f206609a) && Intrinsics.f(this.f206610b, oVar.f206610b) && Intrinsics.f(this.f206611c, oVar.f206611c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f206612g, oVar.f206612g) && Intrinsics.f(this.f206613h, oVar.f206613h) && Intrinsics.f(this.i, oVar.i) && this.f206614j == oVar.f206614j && this.k == oVar.k;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.f206611c;
    }

    public final long h() {
        return this.k;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f206609a.hashCode() * 31, 31, this.f206610b), 31, this.f206611c), 31, this.d), 31, this.e), 31, this.f), 31, this.f206612g), 31, this.f206613h);
        String str = this.i;
        return Long.hashCode(this.k) + j6.a.b(this.f206614j, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final int i() {
        return this.f206614j;
    }

    public final String j() {
        return this.f206613h;
    }

    public final String k() {
        return this.f206610b;
    }
}
