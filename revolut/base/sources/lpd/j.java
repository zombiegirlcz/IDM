package lpd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.g f198975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.f f198976b;

    public j(lzi.g cycle, lzi.f fVar) {
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        this.f198975a = cycle;
        this.f198976b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f198975a, jVar.f198975a) && this.f198976b == jVar.f198976b;
    }

    public final int hashCode() {
        int iHashCode = this.f198975a.f200979a.hashCode() * 31;
        lzi.f fVar = this.f198976b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
