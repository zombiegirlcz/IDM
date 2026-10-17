package gsb;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f146355a;

    public d(BigDecimal maxQuantity) {
        Intrinsics.checkNotNullParameter(maxQuantity, "maxQuantity");
        this.f146355a = maxQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f146355a, ((d) obj2).f146355a);
    }

    public final int hashCode() {
        return this.f146355a.hashCode();
    }
}
