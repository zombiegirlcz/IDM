package zsl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f324980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xdf.f f324981c;
    public final BigDecimal d;

    public q(int i, xdf.f fVar, BigDecimal bigDecimal) {
        super(false);
        this.f324980b = i;
        this.f324981c = fVar;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f324980b == qVar.f324980b && Intrinsics.f(this.f324981c, qVar.f324981c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f324980b) * 31;
        xdf.f fVar = this.f324981c;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.f304432a.hashCode())) * 31;
        BigDecimal bigDecimal = this.d;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
