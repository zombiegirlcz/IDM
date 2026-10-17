package il4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f162081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f162082b;

    public g(a aVar, d dVar) {
        this.f162081a = aVar;
        this.f162082b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f162081a, gVar.f162081a) && Intrinsics.f(this.f162082b, gVar.f162082b);
    }

    public final int hashCode() {
        a aVar = this.f162081a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        d dVar = this.f162082b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
