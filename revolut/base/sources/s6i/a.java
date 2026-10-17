package s6i;

import kotlin.jvm.internal.Intrinsics;
import q6i.r;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends hd.e {
    public final dj0.d d;
    public final d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dj0.d fee2, d feeMode) {
        super(fee2, feeMode, r.a.f242633a);
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(feeMode, "feeMode");
        this.d = fee2;
        this.e = feeMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
