package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f272965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f272966b;

    public o3(dj0.d amount, w5 w5Var) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f272965a = amount;
        this.f272966b = w5Var;
    }

    public final dj0.d a() {
        return this.f272965a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Intrinsics.f(this.f272965a, o3Var.f272965a) && Intrinsics.f(this.f272966b, o3Var.f272966b);
    }

    public final int hashCode() {
        int iHashCode = this.f272965a.hashCode() * 31;
        w5 w5Var = this.f272966b;
        return iHashCode + (w5Var == null ? 0 : w5Var.hashCode());
    }
}
