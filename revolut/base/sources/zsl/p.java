package zsl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f324978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xdf.f f324979c;
    public final BigDecimal d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BigDecimal minQuantity, xdf.f fVar, BigDecimal bigDecimal) {
        super(false);
        Intrinsics.checkNotNullParameter(minQuantity, "minQuantity");
        this.f324978b = minQuantity;
        this.f324979c = fVar;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f324978b, pVar.f324978b) && Intrinsics.f(this.f324979c, pVar.f324979c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f324978b.hashCode() * 31;
        xdf.f fVar = this.f324979c;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.f304432a.hashCode())) * 31;
        BigDecimal bigDecimal = this.d;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
