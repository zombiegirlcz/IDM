package a97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2369b;

    public d(c cVar, c cVar2) {
        this.f2368a = cVar;
        this.f2369b = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f2368a, dVar.f2368a) && Intrinsics.f(this.f2369b, dVar.f2369b);
    }

    public final int hashCode() {
        c cVar = this.f2368a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f2369b;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
