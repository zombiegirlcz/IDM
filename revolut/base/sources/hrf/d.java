package hrf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f154812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f154813b;

    public d(dj0.d dVar, dj0.d dVar2) {
        this.f154812a = dVar;
        this.f154813b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f154812a, dVar.f154812a) && Intrinsics.f(this.f154813b, dVar.f154813b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f154812a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f154813b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
