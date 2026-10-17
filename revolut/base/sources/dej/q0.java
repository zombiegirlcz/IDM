package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f113624c;

    public q0(int i, String number, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f113622a = number;
        this.f113623b = i;
        this.f113624c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f113622a, q0Var.f113622a) && this.f113623b == q0Var.f113623b && Intrinsics.f(this.f113624c, q0Var.f113624c);
    }

    public final int hashCode() {
        return this.f113624c.f297794a.hashCode() + j6.a.b(this.f113623b, this.f113622a.hashCode() * 31, 31);
    }
}
