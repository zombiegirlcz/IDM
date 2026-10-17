package c97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f22318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f22319b;

    public d(l timings, n nVar) {
        Intrinsics.checkNotNullParameter(timings, "timings");
        this.f22318a = timings;
        this.f22319b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f22318a, dVar.f22318a) && Intrinsics.f(this.f22319b, dVar.f22319b);
    }

    public final int hashCode() {
        int iHashCode = this.f22318a.hashCode() * 31;
        n nVar = this.f22319b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
