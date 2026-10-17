package iw0;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f168886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168887b;

    public b(BigDecimal amount, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f168886a = amount;
        this.f168887b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f168886a, bVar.f168886a) && this.f168887b == bVar.f168887b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168887b) + (this.f168886a.hashCode() * 31);
    }
}
