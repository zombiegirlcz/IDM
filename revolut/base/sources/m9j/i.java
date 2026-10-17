package m9j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.g f203806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f203807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f203808c;
    public final vtd.c d;

    public i(io3.g pocketBalance, ej0.b bVar, ej0.b bVar2, vtd.c cVar) {
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        this.f203806a = pocketBalance;
        this.f203807b = bVar;
        this.f203808c = bVar2;
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f203806a, iVar.f203806a) && Intrinsics.f(this.f203807b, iVar.f203807b) && Intrinsics.f(this.f203808c, iVar.f203808c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f203806a.hashCode() * 31;
        ej0.b bVar = this.f203807b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ej0.b bVar2 = this.f203808c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        vtd.c cVar = this.d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }
}
