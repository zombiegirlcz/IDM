package a5i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f1420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f1421b;

    public i(ej0.b bVar, ej0.b bVar2) {
        this.f1420a = bVar;
        this.f1421b = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f1420a, iVar.f1420a) && Intrinsics.f(this.f1421b, iVar.f1421b);
    }

    public final int hashCode() {
        ej0.b bVar = this.f1420a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ej0.b bVar2 = this.f1421b;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
