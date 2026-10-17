package ikg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f161965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skg.c f161966b;

    public b(long j2, skg.c cVar) {
        this.f161965a = j2;
        this.f161966b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f161965a == bVar.f161965a && Intrinsics.f(this.f161966b, bVar.f161966b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f161965a) * 31;
        skg.c cVar = this.f161966b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
