package zm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f323346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323347c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f323348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f323349h;

    public f(String phone, long j2, String name, String firstName, String lastName, String str, long j3, int i) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f323345a = phone;
        this.f323346b = j2;
        this.f323347c = name;
        this.d = firstName;
        this.e = lastName;
        this.f = str;
        this.f323348g = j3;
        this.f323349h = i;
    }

    @Override // zm3.a
    public final long a() {
        return this.f323348g;
    }

    @Override // zm3.a
    public final int b() {
        return this.f323349h;
    }

    @Override // zm3.g
    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f323345a, fVar.f323345a) && this.f323346b == fVar.f323346b && Intrinsics.f(this.f323347c, fVar.f323347c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f323348g == fVar.f323348g && this.f323349h == fVar.f323349h;
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
        return this.f323347c;
    }

    public final String getPhone() {
        return this.f323345a;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(a0.d.c(this.f323345a.hashCode() * 31, 31, this.f323346b), 31, this.f323347c), 31, this.d), 31, this.e);
        String str = this.f;
        return Integer.hashCode(this.f323349h) + a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f323348g);
    }
}
