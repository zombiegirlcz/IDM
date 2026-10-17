package pti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.time.b f239746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.time.b f239747c;

    public m(String id10, kotlin.time.b bVar, kotlin.time.b bVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f239745a = id10;
        this.f239746b = bVar;
        this.f239747c = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f239745a, mVar.f239745a) && Intrinsics.f(this.f239746b, mVar.f239746b) && Intrinsics.f(this.f239747c, mVar.f239747c);
    }

    public final int hashCode() {
        int iHashCode = this.f239745a.hashCode() * 31;
        kotlin.time.b bVar = this.f239746b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : Long.hashCode(bVar.f187924a))) * 31;
        kotlin.time.b bVar2 = this.f239747c;
        return iHashCode2 + (bVar2 != null ? Long.hashCode(bVar2.f187924a) : 0);
    }
}
