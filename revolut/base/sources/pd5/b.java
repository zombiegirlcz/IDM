package pd5;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f235093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f235094b;

    public b(BigDecimal smallPercent, BigDecimal largePercent) {
        Intrinsics.checkNotNullParameter(smallPercent, "smallPercent");
        Intrinsics.checkNotNullParameter(largePercent, "largePercent");
        this.f235093a = smallPercent;
        this.f235094b = largePercent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f235093a, bVar.f235093a) && Intrinsics.f(this.f235094b, bVar.f235094b);
    }

    public final int hashCode() {
        return this.f235094b.hashCode() + (this.f235093a.hashCode() * 31);
    }
}
