package h7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f149889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f149890b;

    public g(dj0.d sourceBalance, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(sourceBalance, "sourceBalance");
        this.f149889a = sourceBalance;
        this.f149890b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f149889a, gVar.f149889a) && Intrinsics.f(this.f149890b, gVar.f149890b);
    }

    public final int hashCode() {
        int iHashCode = this.f149889a.hashCode() * 31;
        dj0.d dVar = this.f149890b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
