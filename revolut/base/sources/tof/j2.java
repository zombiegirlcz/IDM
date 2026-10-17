package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f272841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f272842b;

    public j2(dj0.d fee2, Double d) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f272841a = fee2;
        this.f272842b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.f272841a, j2Var.f272841a) && Intrinsics.f(this.f272842b, j2Var.f272842b);
    }

    public final int hashCode() {
        int iHashCode = this.f272841a.hashCode() * 31;
        Double d = this.f272842b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
