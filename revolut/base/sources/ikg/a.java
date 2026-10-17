package ikg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f161963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skg.c f161964b;

    public a(long j2, skg.c cVar) {
        this.f161963a = j2;
        this.f161964b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f161963a == aVar.f161963a && Intrinsics.f(this.f161964b, aVar.f161964b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f161963a) * 31;
        skg.c cVar = this.f161964b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
