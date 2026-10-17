package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f272676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f272677b;

    public d0(dj0.d pointsAmount, c0 exchangeRate) {
        Intrinsics.checkNotNullParameter(pointsAmount, "pointsAmount");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        this.f272676a = pointsAmount;
        this.f272677b = exchangeRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f272676a, d0Var.f272676a) && Intrinsics.f(this.f272677b, d0Var.f272677b);
    }

    public final int hashCode() {
        return this.f272677b.hashCode() + (this.f272676a.hashCode() * 31);
    }
}
