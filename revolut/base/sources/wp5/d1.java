package wp5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f299113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eq5.p f299114b;

    public d1(xi0.b currency, eq5.p amountError) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountError, "amountError");
        this.f299113a = currency;
        this.f299114b = amountError;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f299113a, d1Var.f299113a) && Intrinsics.f(this.f299114b, d1Var.f299114b);
    }

    public final int hashCode() {
        return this.f299114b.hashCode() + (this.f299113a.hashCode() * 31);
    }
}
