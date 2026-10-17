package uqk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f282199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f282200c;

    public a(dj0.d dVar, dj0.d dVar2, Double d) {
        this.f282198a = dVar;
        this.f282199b = dVar2;
        this.f282200c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282198a, aVar.f282198a) && Intrinsics.f(this.f282199b, aVar.f282199b) && Intrinsics.f(this.f282200c, aVar.f282200c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f282198a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f282199b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Double d = this.f282200c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }
}
