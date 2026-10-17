package afl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f4599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f4600b;

    public h(BigDecimal low, BigDecimal high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        this.f4599a = low;
        this.f4600b = high;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f4599a, hVar.f4599a) && Intrinsics.f(this.f4600b, hVar.f4600b);
    }

    public final int hashCode() {
        return this.f4600b.hashCode() + (this.f4599a.hashCode() * 31);
    }
}
