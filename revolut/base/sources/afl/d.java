package afl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f4585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f4586c;

    public d(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.f4584a = bigDecimal;
        this.f4585b = bigDecimal2;
        this.f4586c = bigDecimal3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f4584a, dVar.f4584a) && Intrinsics.f(this.f4585b, dVar.f4585b) && Intrinsics.f(this.f4586c, dVar.f4586c);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f4584a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f4585b;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f4586c;
        return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }
}
