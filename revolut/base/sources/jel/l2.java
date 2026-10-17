package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173497b;

    public l2(String fullName, BigDecimal expectedReturn) {
        Intrinsics.checkNotNullParameter(expectedReturn, "expectedReturn");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f173496a = expectedReturn;
        this.f173497b = fullName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f173496a, l2Var.f173496a) && Intrinsics.f(this.f173497b, l2Var.f173497b);
    }

    public final int hashCode() {
        return this.f173497b.hashCode() + (this.f173496a.hashCode() * 31);
    }
}
