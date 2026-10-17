package vel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f288358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f288359c;
    public final ej0.b d;
    public final xi0.b e;

    public g(String str, h hVar, dj0.d dVar, ej0.b bVar, xi0.b bVar2) {
        this.f288357a = str;
        this.f288358b = hVar;
        this.f288359c = dVar;
        this.d = bVar;
        this.e = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f288357a, gVar.f288357a) && this.f288358b == gVar.f288358b && Intrinsics.f(this.f288359c, gVar.f288359c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f288358b.hashCode() + (this.f288357a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f288359c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ej0.b bVar = this.d;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        xi0.b bVar2 = this.e;
        return iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String ref2, h assetType, dj0.d dVar, ej0.b bVar) {
        this(ref2, assetType, dVar, bVar, dVar != null ? dVar.f115083b : null);
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
    }

    public /* synthetic */ g(String str, h hVar, dj0.d dVar, int i) {
        this(str, hVar, (i & 4) != 0 ? null : dVar, (ej0.b) null);
    }
}
