package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f324041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f324042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f324043c;
    public final dj0.d d;

    public z(dj0.d amount, y status, x periodState, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(periodState, "periodState");
        this.f324041a = amount;
        this.f324042b = status;
        this.f324043c = periodState;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f324041a, zVar.f324041a) && this.f324042b == zVar.f324042b && this.f324043c == zVar.f324043c && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f324043c.hashCode() + ((this.f324042b.hashCode() + (this.f324041a.hashCode() * 31)) * 31)) * 31;
        dj0.d dVar = this.d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
