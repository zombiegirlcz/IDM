package zsl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f324957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xdf.f f324958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f324959c;

    public c(BigDecimal minQuantity, xdf.f fVar, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(minQuantity, "minQuantity");
        this.f324957a = minQuantity;
        this.f324958b = fVar;
        this.f324959c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f324957a, cVar.f324957a) && Intrinsics.f(this.f324958b, cVar.f324958b) && Intrinsics.f(this.f324959c, cVar.f324959c);
    }

    public final int hashCode() {
        int iHashCode = this.f324957a.hashCode() * 31;
        xdf.f fVar = this.f324958b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.f304432a.hashCode())) * 31;
        BigDecimal bigDecimal = this.f324959c;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
