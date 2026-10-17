package ml3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f206617c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f206618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f206619h;

    public p(String code, String username, String str, String str2, String legalName, String firstName, String lastName, String str3) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f206615a = code;
        this.f206616b = username;
        this.f206617c = str;
        this.d = str2;
        this.e = legalName;
        this.f = firstName;
        this.f206618g = lastName;
        this.f206619h = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f206619h;
    }

    public final String c() {
        return this.f206615a;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.f206618g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f206615a, pVar.f206615a) && Intrinsics.f(this.f206616b, pVar.f206616b) && Intrinsics.f(this.f206617c, pVar.f206617c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f206618g, pVar.f206618g) && Intrinsics.f(this.f206619h, pVar.f206619h);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.f206617c;
    }

    public final String h() {
        return this.f206616b;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f206615a.hashCode() * 31, 31, this.f206616b);
        String str = this.f206617c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC2 = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f206618g);
        String str3 = this.f206619h;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }
}
