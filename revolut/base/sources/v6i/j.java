package v6i;

import aii.r;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f286399a;

    public j(BigDecimal inputRate) {
        Intrinsics.checkNotNullParameter(inputRate, "inputRate");
        this.f286399a = inputRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f286399a, ((j) obj2).f286399a);
    }

    public final int hashCode() {
        return this.f286399a.hashCode();
    }
}
