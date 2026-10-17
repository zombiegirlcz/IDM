package k4l;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f180988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f180989b;

    public k0(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.f180988a = bigDecimal;
        this.f180989b = bigDecimal2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f180988a, k0Var.f180988a) && Intrinsics.f(this.f180989b, k0Var.f180989b);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f180988a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f180989b;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }
}
