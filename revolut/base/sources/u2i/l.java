package u2i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f276682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f276683b;

    public l(dj0.d dVar, dj0.d dVar2) {
        this.f276682a = dVar;
        this.f276683b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f276682a, lVar.f276682a) && Intrinsics.f(this.f276683b, lVar.f276683b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f276682a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f276683b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
