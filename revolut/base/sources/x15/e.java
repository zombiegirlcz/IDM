package x15;

import ft3.d1;
import ft3.g1;
import ft3.j1;
import ft3.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb5.c f302252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou3.g f302253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu3.p f302254c;

    public e(bb5.c tile, ou3.g gVar, vu3.p pVar) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f302252a = tile;
        this.f302253b = gVar;
        this.f302254c = pVar;
    }

    public final q0 a() {
        bb5.c cVar = this.f302252a;
        j1 j1Var = cVar.f14164b;
        String str = cVar.f14167h;
        it3.k kVar = cVar.f14168j;
        Object obj2 = g1.f137832a;
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        return g1.c(new d1(j1Var, null, null), str, kVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f302252a, eVar.f302252a) && Intrinsics.f(this.f302253b, eVar.f302253b) && Intrinsics.f(this.f302254c, eVar.f302254c);
    }

    public final int hashCode() {
        int iHashCode = this.f302252a.hashCode() * 31;
        ou3.g gVar = this.f302253b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        vu3.p pVar = this.f302254c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }
}
