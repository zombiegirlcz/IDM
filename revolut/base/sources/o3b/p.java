package o3b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f221754a;

    public p(BigDecimal threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f221754a = threshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f221754a, ((p) obj2).f221754a);
    }

    public final int hashCode() {
        return this.f221754a.hashCode();
    }
}
