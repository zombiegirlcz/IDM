package s6i;

import kotlin.jvm.internal.Intrinsics;
import q6i.r;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends hd.e {
    public final dj0.d d;
    public final d e;
    public final r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dj0.d tax, d taxMode, r reason) {
        super(tax, taxMode, reason);
        Intrinsics.checkNotNullParameter(tax, "tax");
        Intrinsics.checkNotNullParameter(taxMode, "taxMode");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.d = tax;
        this.e = taxMode;
        this.f = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
