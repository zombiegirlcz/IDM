package xzg;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f310002a;

    public j(BigDecimal percentageChange) {
        Intrinsics.checkNotNullParameter(percentageChange, "percentageChange");
        this.f310002a = percentageChange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f310002a, ((j) obj2).f310002a);
    }

    public final int hashCode() {
        return this.f310002a.hashCode();
    }
}
