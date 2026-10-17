package r02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f250682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f250683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f250684c;
    public final d d;
    public final Long e;

    public e(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, d period, Long l2) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f250682a = dVar;
        this.f250683b = dVar2;
        this.f250684c = dVar3;
        this.d = period;
        this.e = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f250682a, eVar.f250682a) && Intrinsics.f(this.f250683b, eVar.f250683b) && Intrinsics.f(this.f250684c, eVar.f250684c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        dj0.d dVar = this.f250682a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f250683b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f250684c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31)) * 31;
        Long l2 = this.e;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }
}
