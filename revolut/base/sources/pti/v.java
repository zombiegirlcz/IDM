package pti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.time.b f239763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.time.b f239764c;

    public v(String slotId, kotlin.time.b bVar, kotlin.time.b bVar2) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.f239762a = slotId;
        this.f239763b = bVar;
        this.f239764c = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f239762a, vVar.f239762a) && Intrinsics.f(this.f239763b, vVar.f239763b) && Intrinsics.f(this.f239764c, vVar.f239764c);
    }

    public final int hashCode() {
        int iHashCode = this.f239762a.hashCode() * 31;
        kotlin.time.b bVar = this.f239763b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : Long.hashCode(bVar.f187924a))) * 31;
        kotlin.time.b bVar2 = this.f239764c;
        return iHashCode2 + (bVar2 != null ? Long.hashCode(bVar2.f187924a) : 0);
    }
}
