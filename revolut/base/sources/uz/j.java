package uz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz.b f284526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz.u f284527b;

    public j() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f284526a, jVar.f284526a) && Intrinsics.f(this.f284527b, jVar.f284527b);
    }

    public final int hashCode() {
        rz.b bVar = this.f284526a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        rz.u uVar = this.f284527b;
        return iHashCode + (uVar != null ? uVar.hashCode() : 0);
    }

    public j(rz.b bVar, rz.u uVar) {
        this.f284526a = bVar;
        this.f284527b = uVar;
    }
}
