package l12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f191424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hrf.f f191425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r02.e f191426c;

    public h(long j2, hrf.f direction, r02.e eVar) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f191424a = j2;
        this.f191425b = direction;
        this.f191426c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f191424a == hVar.f191424a && this.f191425b == hVar.f191425b && Intrinsics.f(this.f191426c, hVar.f191426c);
    }

    public final int hashCode() {
        int iHashCode = (this.f191425b.hashCode() + (Long.hashCode(this.f191424a) * 31)) * 31;
        r02.e eVar = this.f191426c;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
