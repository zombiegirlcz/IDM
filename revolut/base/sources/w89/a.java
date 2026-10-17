package w89;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f295615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f295616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f295617c;
    public final c d;

    public a(boolean z, d dVar, c cVar, c cVar2) {
        this.f295615a = z;
        this.f295616b = dVar;
        this.f295617c = cVar;
        this.d = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f295615a == aVar.f295615a && Intrinsics.f(this.f295616b, aVar.f295616b) && Intrinsics.f(this.f295617c, aVar.f295617c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f295615a) * 31;
        d dVar = this.f295616b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f295617c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.d;
        return iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
