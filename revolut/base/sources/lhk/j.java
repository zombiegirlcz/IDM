package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qha.g f195351b;

    public j(String planId, qha.g gVar) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f195350a = planId;
        this.f195351b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f195350a, jVar.f195350a) && Intrinsics.f(this.f195351b, jVar.f195351b);
    }

    public final int hashCode() {
        int iHashCode = this.f195350a.hashCode() * 31;
        qha.g gVar = this.f195351b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
