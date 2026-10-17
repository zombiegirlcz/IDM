package a4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f1246a;

    public m(BigDecimal maxQuantity) {
        Intrinsics.checkNotNullParameter(maxQuantity, "maxQuantity");
        this.f1246a = maxQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f1246a, ((m) obj2).f1246a);
    }

    public final int hashCode() {
        return this.f1246a.hashCode();
    }
}
