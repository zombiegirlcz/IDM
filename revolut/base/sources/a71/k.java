package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1748c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1750h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f1751j;

    public k(String firstName, String lastName, String dateOfBirth, String phoneNumber, String email, String address, String accountStatus, String openingDate, String referenceNumber, String terminatedDate) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(accountStatus, "accountStatus");
        Intrinsics.checkNotNullParameter(openingDate, "openingDate");
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        Intrinsics.checkNotNullParameter(terminatedDate, "terminatedDate");
        this.f1746a = firstName;
        this.f1747b = lastName;
        this.f1748c = dateOfBirth;
        this.d = phoneNumber;
        this.e = email;
        this.f = address;
        this.f1749g = accountStatus;
        this.f1750h = openingDate;
        this.i = referenceNumber;
        this.f1751j = terminatedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f1746a, kVar.f1746a) && Intrinsics.f(this.f1747b, kVar.f1747b) && Intrinsics.f(this.f1748c, kVar.f1748c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f1749g, kVar.f1749g) && Intrinsics.f(this.f1750h, kVar.f1750h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f1751j, kVar.f1751j);
    }

    public final int hashCode() {
        return this.f1751j.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f1746a.hashCode() * 31, 31, this.f1747b), 31, this.f1748c), 31, this.d), 31, this.e), 31, this.f), 31, this.f1749g), 31, this.f1750h), 31, this.i);
    }
}
