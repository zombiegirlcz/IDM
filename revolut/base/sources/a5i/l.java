package a5i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f1425b;

    public l(ej0.b bVar, ej0.b bVar2) {
        this.f1424a = bVar;
        this.f1425b = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f1424a, lVar.f1424a) && Intrinsics.f(this.f1425b, lVar.f1425b);
    }

    public final int hashCode() {
        ej0.b bVar = this.f1424a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ej0.b bVar2 = this.f1425b;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
