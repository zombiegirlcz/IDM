package nrf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218640b;

    public g(dj0.d lower, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        this.f218639a = lower;
        this.f218640b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f218639a, gVar.f218639a) && Intrinsics.f(this.f218640b, gVar.f218640b);
    }

    public final int hashCode() {
        int iHashCode = this.f218639a.hashCode() * 31;
        dj0.d dVar = this.f218640b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
