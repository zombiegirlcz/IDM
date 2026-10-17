package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l4 {

    @NotNull
    public static final c4 Companion = new c4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5 f117745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f117746c;
    public final i1 d;
    public final i0 e;
    public final e7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f117747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f117748h;
    public final d3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k7 f117749j;
    public final h7 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t4 f117750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h4 f117751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k4 f117752n;
    public final t1 o;

    public /* synthetic */ l4(int i, String str, h5 h5Var, a4 a4Var, i1 i1Var, i0 i0Var, e7 e7Var, c cVar, r0 r0Var, d3 d3Var, k7 k7Var, h7 h7Var, t4 t4Var, h4 h4Var, k4 k4Var, t1 t1Var) {
        if (32767 != (i & 32767)) {
            qlm.j1.f(b4.f117611a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f117744a = str;
        this.f117745b = h5Var;
        this.f117746c = a4Var;
        this.d = i1Var;
        this.e = i0Var;
        this.f = e7Var;
        this.f117747g = cVar;
        this.f117748h = r0Var;
        this.i = d3Var;
        this.f117749j = k7Var;
        this.k = h7Var;
        this.f117750l = t4Var;
        this.f117751m = h4Var;
        this.f117752n = k4Var;
        this.o = t1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj2;
        return Intrinsics.f(this.f117744a, l4Var.f117744a) && Intrinsics.f(this.f117745b, l4Var.f117745b) && Intrinsics.f(this.f117746c, l4Var.f117746c) && Intrinsics.f(this.d, l4Var.d) && Intrinsics.f(this.e, l4Var.e) && Intrinsics.f(this.f, l4Var.f) && Intrinsics.f(this.f117747g, l4Var.f117747g) && Intrinsics.f(this.f117748h, l4Var.f117748h) && Intrinsics.f(this.i, l4Var.i) && Intrinsics.f(this.f117749j, l4Var.f117749j) && Intrinsics.f(this.k, l4Var.k) && Intrinsics.f(this.f117750l, l4Var.f117750l) && Intrinsics.f(this.f117751m, l4Var.f117751m) && Intrinsics.f(this.f117752n, l4Var.f117752n) && Intrinsics.f(this.o, l4Var.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f117745b.hashCode() + (this.f117744a.hashCode() * 31)) * 31;
        a4 a4Var = this.f117746c;
        int iHashCode2 = (iHashCode + (a4Var == null ? 0 : a4Var.hashCode())) * 31;
        i1 i1Var = this.d;
        int iHashCode3 = (iHashCode2 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        i0 i0Var = this.e;
        int iHashCode4 = (iHashCode3 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        e7 e7Var = this.f;
        int iHashCode5 = (iHashCode4 + (e7Var == null ? 0 : e7Var.hashCode())) * 31;
        c cVar = this.f117747g;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        r0 r0Var = this.f117748h;
        int iHashCode7 = (iHashCode6 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        d3 d3Var = this.i;
        int iHashCode8 = (iHashCode7 + (d3Var == null ? 0 : d3Var.hashCode())) * 31;
        k7 k7Var = this.f117749j;
        int iHashCode9 = (iHashCode8 + (k7Var == null ? 0 : k7Var.hashCode())) * 31;
        h7 h7Var = this.k;
        int iHashCode10 = (iHashCode9 + (h7Var == null ? 0 : h7Var.hashCode())) * 31;
        t4 t4Var = this.f117750l;
        int iHashCode11 = (iHashCode10 + (t4Var == null ? 0 : t4Var.hashCode())) * 31;
        h4 h4Var = this.f117751m;
        int iHashCode12 = (iHashCode11 + (h4Var == null ? 0 : h4Var.hashCode())) * 31;
        k4 k4Var = this.f117752n;
        int iHashCode13 = (iHashCode12 + (k4Var == null ? 0 : k4Var.hashCode())) * 31;
        t1 t1Var = this.o;
        return iHashCode13 + (t1Var != null ? t1Var.hashCode() : 0);
    }
}
