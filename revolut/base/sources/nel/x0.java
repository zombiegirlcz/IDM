package nel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f214636a;

    public x0(BigDecimal openPositionsQuantity) {
        Intrinsics.checkNotNullParameter(openPositionsQuantity, "openPositionsQuantity");
        this.f214636a = openPositionsQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x0) && Intrinsics.f(this.f214636a, ((x0) obj2).f214636a);
    }

    public final int hashCode() {
        return this.f214636a.hashCode();
    }
}
