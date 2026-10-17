package zh9;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f322323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f322324b;

    public q1(int i, BigDecimal feeRate) {
        Intrinsics.checkNotNullParameter(feeRate, "feeRate");
        this.f322323a = i;
        this.f322324b = feeRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return this.f322323a == q1Var.f322323a && Intrinsics.f(this.f322324b, q1Var.f322324b);
    }

    public final int hashCode() {
        return this.f322324b.hashCode() + (Integer.hashCode(this.f322323a) * 31);
    }
}
