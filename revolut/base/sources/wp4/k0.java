package wp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nb5.g f299073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f299074c;

    public k0(String paymentId, nb5.g accountNumberFormat, xi0.b currency) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(accountNumberFormat, "accountNumberFormat");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f299072a = paymentId;
        this.f299073b = accountNumberFormat;
        this.f299074c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f299072a, k0Var.f299072a) && this.f299073b == k0Var.f299073b && Intrinsics.f(this.f299074c, k0Var.f299074c);
    }

    public final int hashCode() {
        return this.f299074c.hashCode() + ((this.f299073b.hashCode() + (this.f299072a.hashCode() * 31)) * 31);
    }
}
