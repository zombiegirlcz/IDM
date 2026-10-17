package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f4604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4605b;

    public j(dj0.d dVar, Double d) {
        this.f4604a = dVar;
        this.f4605b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f4604a, jVar.f4604a) && Intrinsics.f(this.f4605b, jVar.f4605b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f4604a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Double d = this.f4605b;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }
}
