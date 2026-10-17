package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1717c;
    public final String d;
    public final String e;
    public final String f;

    public a(String firstName, String lastName, String phone, String birthDate, String email, String address) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f1715a = firstName;
        this.f1716b = lastName;
        this.f1717c = phone;
        this.d = birthDate;
        this.e = email;
        this.f = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f1715a, aVar.f1715a) && Intrinsics.f(this.f1716b, aVar.f1716b) && Intrinsics.f(this.f1717c, aVar.f1717c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f1715a.hashCode() * 31, 31, this.f1716b), 31, this.f1717c), 31, this.d), 31, this.e);
    }
}
