package vpk;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f291229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qta.f f291230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f291231c;
    public final Long d;
    public final e e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f291232g;

    public g(Pair ccPair, qta.f plotDuration, f type, Long l2, e eVar, boolean z, int i) {
        l2 = (i & 8) != 0 ? null : l2;
        eVar = (i & 16) != 0 ? null : eVar;
        z = (i & 32) != 0 ? true : z;
        boolean z3 = (i & 64) == 0;
        Intrinsics.checkNotNullParameter(ccPair, "ccPair");
        Intrinsics.checkNotNullParameter(plotDuration, "plotDuration");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f291229a = ccPair;
        this.f291230b = plotDuration;
        this.f291231c = type;
        this.d = l2;
        this.e = eVar;
        this.f = z;
        this.f291232g = z3;
    }

    public final Pair a() {
        return this.f291229a;
    }

    public final boolean b() {
        return this.f291232g;
    }

    public final qta.f c() {
        return this.f291230b;
    }

    public final Long d() {
        return this.d;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f291229a, gVar.f291229a) && this.f291230b == gVar.f291230b && this.f291231c == gVar.f291231c && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.f291232g == gVar.f291232g;
    }

    public final e f() {
        return this.e;
    }

    public final f g() {
        return this.f291231c;
    }

    public final int hashCode() {
        int iHashCode = (this.f291231c.hashCode() + ((this.f291230b.hashCode() + (this.f291229a.hashCode() * 31)) * 31)) * 31;
        Long l2 = this.d;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        e eVar = this.e;
        return Boolean.hashCode(this.f291232g) + j6.a.c((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.f);
    }
}
