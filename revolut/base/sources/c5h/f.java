package c5h;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f21560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f21561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f21562c;

    public f(BigDecimal amount, g unit, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f21560a = amount;
        this.f21561b = unit;
        this.f21562c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f21560a, fVar.f21560a) && this.f21561b == fVar.f21561b && Intrinsics.f(this.f21562c, fVar.f21562c);
    }

    public final int hashCode() {
        int iHashCode = (this.f21561b.hashCode() + (this.f21560a.hashCode() * 31)) * 31;
        BigDecimal bigDecimal = this.f21562c;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
