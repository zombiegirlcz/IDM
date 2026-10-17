package bec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f14801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f14802b;

    public n(dj0.d dVar, xi0.b bVar) {
        this.f14801a = bVar;
        this.f14802b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f14801a, nVar.f14801a) && Intrinsics.f(this.f14802b, nVar.f14802b);
    }

    public final int hashCode() {
        xi0.b bVar = this.f14801a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        dj0.d dVar = this.f14802b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
