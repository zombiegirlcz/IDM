package urf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f282311b;

    public d(dj0.d dVar, dj0.d dVar2) {
        this.f282310a = dVar;
        this.f282311b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f282310a, dVar.f282310a) && Intrinsics.f(this.f282311b, dVar.f282311b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f282310a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f282311b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
