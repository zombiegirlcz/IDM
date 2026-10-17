package fzg;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f139201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f139202b;

    public g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.f139201a = bigDecimal;
        this.f139202b = bigDecimal2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f139201a, gVar.f139201a) && Intrinsics.f(this.f139202b, gVar.f139202b);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f139201a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f139202b;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }
}
