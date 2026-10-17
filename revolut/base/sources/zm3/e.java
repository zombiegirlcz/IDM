package zm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f323341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323342c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f323343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f323344h;

    public e(String email, long j2, String name, String firstName, String lastName, String str, long j3, int i) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f323340a = email;
        this.f323341b = j2;
        this.f323342c = name;
        this.d = firstName;
        this.e = lastName;
        this.f = str;
        this.f323343g = j3;
        this.f323344h = i;
    }

    @Override // zm3.a
    public final long a() {
        return this.f323343g;
    }

    @Override // zm3.a
    public final int b() {
        return this.f323344h;
    }

    @Override // zm3.g
    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f323340a, eVar.f323340a) && this.f323341b == eVar.f323341b && Intrinsics.f(this.f323342c, eVar.f323342c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f323343g == eVar.f323343g && this.f323344h == eVar.f323344h;
    }

    public final String getEmail() {
        return this.f323340a;
    }

    @Override // zm3.g
    public final String getFirstName() {
        return this.d;
    }

    @Override // zm3.g
    public final String getLastName() {
        return this.e;
    }

    @Override // zm3.g
    public final String getName() {
        return this.f323342c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(a0.d.c(this.f323340a.hashCode() * 31, 31, this.f323341b), 31, this.f323342c), 31, this.d), 31, this.e);
        String str = this.f;
        return Integer.hashCode(this.f323344h) + a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f323343g);
    }
}
