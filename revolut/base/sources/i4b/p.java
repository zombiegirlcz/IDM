package i4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f158368a;

    public p(BigDecimal rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f158368a = rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f158368a, ((p) obj2).f158368a);
    }

    public final int hashCode() {
        return this.f158368a.hashCode();
    }
}
