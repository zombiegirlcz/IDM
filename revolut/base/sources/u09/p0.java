package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f276144a;

    public p0(dj0.d dVar) {
        this.f276144a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f276144a, ((p0) obj2).f276144a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f276144a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
