package a4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f1247a;

    public n(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f1247a = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f1247a, ((n) obj2).f1247a);
    }

    public final int hashCode() {
        return this.f1247a.hashCode();
    }
}
