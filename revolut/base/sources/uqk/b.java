package uqk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f282202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f282203c;
    public final dj0.d d;

    public b(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4) {
        this.f282201a = dVar;
        this.f282202b = dVar2;
        this.f282203c = dVar3;
        this.d = dVar4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f282201a, bVar.f282201a) && Intrinsics.f(this.f282202b, bVar.f282202b) && Intrinsics.f(this.f282203c, bVar.f282203c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        dj0.d dVar = this.f282201a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f282202b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f282203c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.d;
        return iHashCode3 + (dVar4 != null ? dVar4.hashCode() : 0);
    }
}
