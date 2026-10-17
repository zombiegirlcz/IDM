package uqk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f282205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f282206c;

    public c(dj0.d dVar, dj0.d dVar2, Double d) {
        this.f282204a = dVar;
        this.f282205b = dVar2;
        this.f282206c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f282204a, cVar.f282204a) && Intrinsics.f(this.f282205b, cVar.f282205b) && Intrinsics.f(this.f282206c, cVar.f282206c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f282204a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f282205b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Double d = this.f282206c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }
}
