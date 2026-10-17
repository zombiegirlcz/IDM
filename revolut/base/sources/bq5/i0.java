package bq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17721c;
    public final String d;
    public final j0 e;

    public i0(String name, String surname, String companyName, String businessRegistrationNumber, j0 recipientType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(surname, "surname");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(businessRegistrationNumber, "businessRegistrationNumber");
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        this.f17719a = name;
        this.f17720b = surname;
        this.f17721c = companyName;
        this.d = businessRegistrationNumber;
        this.e = recipientType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f17719a, i0Var.f17719a) && Intrinsics.f(this.f17720b, i0Var.f17720b) && Intrinsics.f(this.f17721c, i0Var.f17721c) && Intrinsics.f(this.d, i0Var.d) && this.e == i0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f17719a.hashCode() * 31, 31, this.f17720b), 31, this.f17721c), 31, this.d);
    }
}
