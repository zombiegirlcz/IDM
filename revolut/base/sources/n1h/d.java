package n1h;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f211359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f211360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f211361c;

    public d(dj0.d exchangedAmount, dj0.d estimatedTotalCost, c cVar) {
        Intrinsics.checkNotNullParameter(exchangedAmount, "exchangedAmount");
        Intrinsics.checkNotNullParameter(estimatedTotalCost, "estimatedTotalCost");
        this.f211359a = exchangedAmount;
        this.f211360b = estimatedTotalCost;
        this.f211361c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f211359a, dVar.f211359a) && Intrinsics.f(this.f211360b, dVar.f211360b) && Intrinsics.f(this.f211361c, dVar.f211361c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f211359a.hashCode() * 31, 31, this.f211360b);
        c cVar = this.f211361c;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
