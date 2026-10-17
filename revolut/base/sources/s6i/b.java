package s6i;

import kotlin.jvm.internal.Intrinsics;
import q6i.r;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends hd.e {
    public final dj0.d d;
    public final d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dj0.d feeAndTax, d feeAndTaxMode) {
        super(feeAndTax, feeAndTaxMode, r.a.f242633a);
        Intrinsics.checkNotNullParameter(feeAndTax, "feeAndTax");
        Intrinsics.checkNotNullParameter(feeAndTaxMode, "feeAndTaxMode");
        this.d = feeAndTax;
        this.e = feeAndTaxMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
