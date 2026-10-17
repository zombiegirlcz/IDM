package dfl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f114516a;

    public x(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f114516a = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f114516a, ((x) obj2).f114516a);
    }

    public final int hashCode() {
        return this.f114516a.hashCode();
    }
}
