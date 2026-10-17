package xwd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f309352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f309353b;

    public k(dj0.d dVar, dj0.d dVar2) {
        this.f309352a = dVar;
        this.f309353b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f309352a, kVar.f309352a) && Intrinsics.f(this.f309353b, kVar.f309353b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f309352a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f309353b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
