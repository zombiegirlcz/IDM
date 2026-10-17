package aul;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f9864a;

    public e(BigDecimal lotQuantity) {
        Intrinsics.checkNotNullParameter(lotQuantity, "lotQuantity");
        this.f9864a = lotQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f9864a, ((e) obj2).f9864a);
    }

    public final int hashCode() {
        return this.f9864a.hashCode();
    }
}
