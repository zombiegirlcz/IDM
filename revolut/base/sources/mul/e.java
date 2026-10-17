package mul;

import java.math.BigDecimal;
import kel.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f209051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f209052b;

    public e(n stockHolding, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(stockHolding, "stockHolding");
        this.f209051a = stockHolding;
        this.f209052b = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f209051a, eVar.f209051a) && Intrinsics.f(this.f209052b, eVar.f209052b);
    }

    public final int hashCode() {
        int iHashCode = this.f209051a.hashCode() * 31;
        BigDecimal bigDecimal = this.f209052b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
