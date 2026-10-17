package tof;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f272656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f272657b;

    public c0(ej0.b fiatAmount, BigDecimal points) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        this.f272656a = points;
        this.f272657b = fiatAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f272656a, c0Var.f272656a) && Intrinsics.f(this.f272657b, c0Var.f272657b);
    }

    public final int hashCode() {
        return this.f272657b.hashCode() + (this.f272656a.hashCode() * 31);
    }
}
