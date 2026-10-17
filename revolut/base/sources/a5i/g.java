package a5i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f1415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f1416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f1417c;

    public g(dj0.d dVar, ej0.b bVar, ej0.b bVar2) {
        this.f1415a = bVar;
        this.f1416b = bVar2;
        this.f1417c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f1415a, gVar.f1415a) && Intrinsics.f(this.f1416b, gVar.f1416b) && Intrinsics.f(this.f1417c, gVar.f1417c);
    }

    public final int hashCode() {
        ej0.b bVar = this.f1415a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ej0.b bVar2 = this.f1416b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        dj0.d dVar = this.f1417c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
