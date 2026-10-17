package bq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f17746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f17747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17748c;
    public final String d;
    public final String e;
    public final String f;

    public q0(l0 tab2, j0 recipientType, String firstName, String lastName, String companyName, String businessRegistrationNumber) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(businessRegistrationNumber, "businessRegistrationNumber");
        this.f17746a = tab2;
        this.f17747b = recipientType;
        this.f17748c = firstName;
        this.d = lastName;
        this.e = companyName;
        this.f = businessRegistrationNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f17746a == q0Var.f17746a && this.f17747b == q0Var.f17747b && Intrinsics.f(this.f17748c, q0Var.f17748c) && Intrinsics.f(this.d, q0Var.d) && Intrinsics.f(this.e, q0Var.e) && Intrinsics.f(this.f, q0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c((this.f17747b.hashCode() + (this.f17746a.hashCode() * 31)) * 31, 31, this.f17748c), 31, this.d), 31, this.e);
    }
}
