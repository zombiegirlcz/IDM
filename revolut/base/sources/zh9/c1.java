package zh9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f322255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f322256c;
    public final dj0.d d;
    public final dj0.d e;

    public c1(dj0.d firstRepaymentAmount, dj0.d secondRepaymentAmount, long j2, dj0.d totalFeeAmount, dj0.d amountToTopUp) {
        Intrinsics.checkNotNullParameter(firstRepaymentAmount, "firstRepaymentAmount");
        Intrinsics.checkNotNullParameter(secondRepaymentAmount, "secondRepaymentAmount");
        Intrinsics.checkNotNullParameter(totalFeeAmount, "totalFeeAmount");
        Intrinsics.checkNotNullParameter(amountToTopUp, "amountToTopUp");
        this.f322254a = firstRepaymentAmount;
        this.f322255b = secondRepaymentAmount;
        this.f322256c = j2;
        this.d = totalFeeAmount;
        this.e = amountToTopUp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f322254a, c1Var.f322254a) && Intrinsics.f(this.f322255b, c1Var.f322255b) && this.f322256c == c1Var.f322256c && Intrinsics.f(this.d, c1Var.d) && Intrinsics.f(this.e, c1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(a0.d.c(v7.c(this.f322254a.hashCode() * 31, 31, this.f322255b), 31, this.f322256c), 31, this.d);
    }
}
