package p35;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f232667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f232668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f232669c;
    public final dj0.d d;

    public r0(dj0.d principalAmount, dj0.d loanAmount, dj0.d interestAmount, dj0.d totalAmount) {
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(loanAmount, "loanAmount");
        Intrinsics.checkNotNullParameter(interestAmount, "interestAmount");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f232667a = principalAmount;
        this.f232668b = loanAmount;
        this.f232669c = interestAmount;
        this.d = totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f232667a, r0Var.f232667a) && Intrinsics.f(this.f232668b, r0Var.f232668b) && Intrinsics.f(this.f232669c, r0Var.f232669c) && Intrinsics.f(this.d, r0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f232667a.hashCode() * 31, 31, this.f232668b), 31, this.f232669c);
    }
}
