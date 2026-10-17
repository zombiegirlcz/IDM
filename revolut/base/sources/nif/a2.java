package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215700c;
    public final String d;
    public final String e;
    public final String f;

    public a2(String firstName, String lastName, String state, String lastFour, String scheme, String str) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.f215698a = firstName;
        this.f215699b = lastName;
        this.f215700c = state;
        this.d = lastFour;
        this.e = scheme;
        this.f = str;
    }

    public final String a() {
        return this.f215698a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f215699b;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.f215698a, a2Var.f215698a) && Intrinsics.f(this.f215699b, a2Var.f215699b) && Intrinsics.f(this.f215700c, a2Var.f215700c) && Intrinsics.f(this.d, a2Var.d) && Intrinsics.f(this.e, a2Var.e) && Intrinsics.f(this.f, a2Var.f);
    }

    public final String f() {
        return this.f215700c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f215698a.hashCode() * 31, 31, this.f215699b), 31, this.f215700c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
