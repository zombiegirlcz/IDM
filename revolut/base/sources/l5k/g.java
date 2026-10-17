package l5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f192330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f192331b;

    public g(dj0.d dVar, wi0.b bVar) {
        this.f192330a = bVar;
        this.f192331b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f192330a, gVar.f192330a) && Intrinsics.f(this.f192331b, gVar.f192331b);
    }

    public final int hashCode() {
        wi0.b bVar = this.f192330a;
        int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
        dj0.d dVar = this.f192331b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
