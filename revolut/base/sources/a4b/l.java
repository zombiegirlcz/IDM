package a4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f1245a;

    public l(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f1245a = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f1245a, ((l) obj2).f1245a);
    }

    public final int hashCode() {
        return this.f1245a.hashCode();
    }
}
