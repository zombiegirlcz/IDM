package h02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f148178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f148179b;

    public b(a aVar, a aVar2) {
        this.f148178a = aVar;
        this.f148179b = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f148178a, bVar.f148178a) && Intrinsics.f(this.f148179b, bVar.f148179b);
    }

    public final int hashCode() {
        a aVar = this.f148178a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.f148179b;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
