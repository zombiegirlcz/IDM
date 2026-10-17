package nnb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncd.g f217495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f217496b;

    public i(ncd.g gVar, xi0.b bVar) {
        this.f217495a = gVar;
        this.f217496b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f217495a == iVar.f217495a && Intrinsics.f(this.f217496b, iVar.f217496b);
    }

    public final int hashCode() {
        ncd.g gVar = this.f217495a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        xi0.b bVar = this.f217496b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
