package l9j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vtd.c f193257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f193258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f193259c;

    public g(vtd.c cVar, ej0.b bVar, ej0.b bVar2) {
        this.f193257a = cVar;
        this.f193258b = bVar;
        this.f193259c = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f193257a, gVar.f193257a) && Intrinsics.f(this.f193258b, gVar.f193258b) && Intrinsics.f(this.f193259c, gVar.f193259c);
    }

    public final int hashCode() {
        vtd.c cVar = this.f193257a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        ej0.b bVar = this.f193258b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ej0.b bVar2 = this.f193259c;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
