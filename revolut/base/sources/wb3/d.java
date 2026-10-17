package wb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f295999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f296000b;

    public d() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f295999a, dVar.f295999a) && Intrinsics.f(this.f296000b, dVar.f296000b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f295999a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        h hVar = this.f296000b;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public d(dj0.d dVar, h hVar) {
        this.f295999a = dVar;
        this.f296000b = hVar;
    }
}
