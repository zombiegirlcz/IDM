package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4 f272881b;

    public k4(List previousTransactionIds, l4 l4Var) {
        Intrinsics.checkNotNullParameter(previousTransactionIds, "previousTransactionIds");
        this.f272880a = previousTransactionIds;
        this.f272881b = l4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.f272880a, k4Var.f272880a) && Intrinsics.f(this.f272881b, k4Var.f272881b);
    }

    public final int hashCode() {
        int iHashCode = this.f272880a.hashCode() * 31;
        l4 l4Var = this.f272881b;
        return iHashCode + (l4Var == null ? 0 : l4Var.hashCode());
    }
}
