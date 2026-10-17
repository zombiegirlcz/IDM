package gsb;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f146356a;

    public e(BigDecimal minQuantity) {
        Intrinsics.checkNotNullParameter(minQuantity, "minQuantity");
        this.f146356a = minQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f146356a, ((e) obj2).f146356a);
    }

    public final int hashCode() {
        return this.f146356a.hashCode();
    }
}
