package zsl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f324960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xdf.f f324961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f324962c;

    public d(int i, xdf.f fVar, BigDecimal bigDecimal) {
        this.f324960a = i;
        this.f324961b = fVar;
        this.f324962c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f324960a == dVar.f324960a && Intrinsics.f(this.f324961b, dVar.f324961b) && Intrinsics.f(this.f324962c, dVar.f324962c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f324960a) * 31;
        xdf.f fVar = this.f324961b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.f304432a.hashCode())) * 31;
        BigDecimal bigDecimal = this.f324962c;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
