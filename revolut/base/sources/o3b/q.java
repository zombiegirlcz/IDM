package o3b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f221758a;

    public q(BigDecimal threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f221758a = threshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f221758a, ((q) obj2).f221758a);
    }

    public final int hashCode() {
        return this.f221758a.hashCode();
    }
}
