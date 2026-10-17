package s1l;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Lazy[] f259225m = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s1g.a(2)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f259226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f259227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f259228c;
    public final y0 d;
    public final v0 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f259229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f259230h;
    public final p0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ld7.f f259231j;
    public final d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f259232l;

    public /* synthetic */ z0(int i, m0 m0Var, n nVar, w wVar, y0 y0Var, v0 v0Var, List list, d dVar, String str, p0 p0Var, ld7.f fVar, d0 d0Var, g0 g0Var) {
        if (18 != (i & 18)) {
            j1.f(a.f259157a.getDescriptor(), i, 18);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f259226a = null;
        } else {
            this.f259226a = m0Var;
        }
        this.f259227b = nVar;
        if ((i & 4) == 0) {
            this.f259228c = null;
        } else {
            this.f259228c = wVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = y0Var;
        }
        this.e = v0Var;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.f259229g = null;
        } else {
            this.f259229g = dVar;
        }
        if ((i & 128) == 0) {
            this.f259230h = null;
        } else {
            this.f259230h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = p0Var;
        }
        if ((i & 512) == 0) {
            this.f259231j = null;
        } else {
            this.f259231j = fVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = d0Var;
        }
        if ((i & 2048) == 0) {
            this.f259232l = null;
        } else {
            this.f259232l = g0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f259226a, z0Var.f259226a) && Intrinsics.f(this.f259227b, z0Var.f259227b) && Intrinsics.f(this.f259228c, z0Var.f259228c) && Intrinsics.f(this.d, z0Var.d) && Intrinsics.f(this.e, z0Var.e) && Intrinsics.f(this.f, z0Var.f) && Intrinsics.f(this.f259229g, z0Var.f259229g) && Intrinsics.f(this.f259230h, z0Var.f259230h) && Intrinsics.f(this.i, z0Var.i) && Intrinsics.f(this.f259231j, z0Var.f259231j) && Intrinsics.f(this.k, z0Var.k) && Intrinsics.f(this.f259232l, z0Var.f259232l);
    }

    public final int hashCode() {
        m0 m0Var = this.f259226a;
        int iHashCode = (this.f259227b.hashCode() + ((m0Var == null ? 0 : m0Var.hashCode()) * 31)) * 31;
        w wVar = this.f259228c;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.f259216a.hashCode())) * 31;
        y0 y0Var = this.d;
        int iHashCode3 = (iHashCode2 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        v0 v0Var = this.e;
        int iHashCode4 = (iHashCode3 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        List list = this.f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        d dVar = this.f259229g;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f259230h;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        p0 p0Var = this.i;
        int iHashCode8 = (iHashCode7 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        ld7.f fVar = this.f259231j;
        int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.f194043a.hashCode())) * 31;
        d0 d0Var = this.k;
        int iHashCode10 = (iHashCode9 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        g0 g0Var = this.f259232l;
        return iHashCode10 + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public z0(m0 m0Var, n header, w wVar, y0 y0Var, v0 v0Var, List list, d dVar, String str, p0 p0Var, ld7.f fVar, d0 d0Var, g0 g0Var) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f259226a = m0Var;
        this.f259227b = header;
        this.f259228c = wVar;
        this.d = y0Var;
        this.e = v0Var;
        this.f = list;
        this.f259229g = dVar;
        this.f259230h = str;
        this.i = p0Var;
        this.f259231j = fVar;
        this.k = d0Var;
        this.f259232l = g0Var;
    }
}
