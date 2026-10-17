package ewh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f130271a;

    public j(io3.d dVar) {
        this.f130271a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f130271a, ((j) obj2).f130271a);
    }

    public final int hashCode() {
        io3.d dVar = this.f130271a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
