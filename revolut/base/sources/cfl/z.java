package cfl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f23759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f23760b;

    public z(dj0.d dVar, BigDecimal yearlyRate) {
        Intrinsics.checkNotNullParameter(yearlyRate, "yearlyRate");
        this.f23759a = yearlyRate;
        this.f23760b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f23759a, zVar.f23759a) && Intrinsics.f(this.f23760b, zVar.f23760b);
    }

    public final int hashCode() {
        int iHashCode = this.f23759a.hashCode() * 31;
        dj0.d dVar = this.f23760b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
