package lha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f195214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.o f195215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f195216c;

    public j(g family, hha.o oVar, i iVar) {
        Intrinsics.checkNotNullParameter(family, "family");
        this.f195214a = family;
        this.f195215b = oVar;
        this.f195216c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f195214a, jVar.f195214a) && Intrinsics.f(this.f195215b, jVar.f195215b) && Intrinsics.f(this.f195216c, jVar.f195216c);
    }

    public final int hashCode() {
        int iHashCode = this.f195214a.hashCode() * 31;
        hha.o oVar = this.f195215b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        i iVar = this.f195216c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
