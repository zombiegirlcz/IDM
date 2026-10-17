package rdj;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f253465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f253466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f253467c;
    public final int d;
    public final int e;

    public f(BigDecimal low, BigDecimal avg, BigDecimal high, int i, int i2) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(avg, "avg");
        Intrinsics.checkNotNullParameter(high, "high");
        this.f253465a = low;
        this.f253466b = avg;
        this.f253467c = high;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f253465a, fVar.f253465a) && Intrinsics.f(this.f253466b, fVar.f253466b) && Intrinsics.f(this.f253467c, fVar.f253467c) && this.d == fVar.d && this.e == fVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, t61.a.d(this.f253467c, t61.a.d(this.f253466b, this.f253465a.hashCode() * 31, 31), 31), 31);
    }
}
