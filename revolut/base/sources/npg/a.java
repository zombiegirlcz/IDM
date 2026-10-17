package npg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f218206b;

    public a(dj0.d dVar, Object obj2) {
        this.f218205a = dVar;
        this.f218206b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f218205a, aVar.f218205a) && Intrinsics.f(this.f218206b, aVar.f218206b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f218205a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Object obj2 = this.f218206b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
