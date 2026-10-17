package ip0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FlexibleBarChartDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ui implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f166669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.m5 f166670c;
    public final aw0.j1 d;
    public final aw0.e5 e;
    public final aw0.t5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f166671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f166672h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aw0.s5 f166673j;
    public final aw0.d5 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f166674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f166675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f166676n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f166677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f166678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f166679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f166680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uw0.i f166681t;
    public final aw0.q5 u;
    public qv0.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p31.c f166682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p31.c f166683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p31.c f166684y;
    public p31.c z;

    public ui(String listId, List items, aw0.m5 barGapType, aw0.e5 e5Var, aw0.t5 t5Var, Float f, Float f4, boolean z, aw0.s5 s5Var, aw0.d5 d5Var, String str, ind.f fVar, int i, int i2, int i3, int i5, int i6) {
        aw0.e5 e5Var2 = (i6 & 16) != 0 ? null : e5Var;
        Float f5 = (i6 & 64) != 0 ? null : f;
        boolean z3 = (i6 & 256) != 0 ? false : z;
        aw0.s5 s5Var2 = (i6 & 512) != 0 ? null : s5Var;
        aw0.d5 heightMode = (i6 & 1024) != 0 ? aw0.d5.REGULAR : d5Var;
        String str2 = (i6 & 2048) != 0 ? null : str;
        boolean z4 = (i6 & 8192) != 0;
        ind.f fVar2 = (i6 & 16384) != 0 ? null : fVar;
        int i21 = (i6 & 32768) != 0 ? R$attr.uikit_dp0 : i;
        int i22 = (i6 & 65536) != 0 ? R$attr.uikit_dp0 : i2;
        int i32 = (i6 & 131072) != 0 ? R$attr.uikit_dp0 : i3;
        int i33 = (i6 & 262144) != 0 ? R$attr.uikit_dp0 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(barGapType, "barGapType");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f166668a = listId;
        this.f166669b = items;
        this.f166670c = barGapType;
        this.d = null;
        this.e = e5Var2;
        this.f = t5Var;
        this.f166671g = f5;
        this.f166672h = f4;
        this.i = z3;
        this.f166673j = s5Var2;
        this.k = heightMode;
        this.f166674l = str2;
        this.f166675m = null;
        this.f166676n = z4;
        this.o = fVar2;
        this.f166677p = i21;
        this.f166678q = i22;
        this.f166679r = i32;
        this.f166680s = i33;
        this.f166681t = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, false);
        this.u = new aw0.q5(-1.0f, f4 != null ? f4.floatValue() : 84.0f, new aw0.l5(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), aw0.o5.COLOR, barGapType, (aw0.k0) null, (aw0.p5) null, 208);
        this.v = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FlexibleBarChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51565t() {
        return this.o;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51552a() {
        return this.f166668a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ui)) {
            return false;
        }
        ui uiVar = (ui) obj2;
        return Intrinsics.f(this.f166668a, uiVar.f166668a) && Intrinsics.f(this.f166669b, uiVar.f166669b) && this.f166670c == uiVar.f166670c && Intrinsics.f(this.d, uiVar.d) && Intrinsics.f(this.e, uiVar.e) && Intrinsics.f(this.f, uiVar.f) && Intrinsics.f(this.f166671g, uiVar.f166671g) && Intrinsics.f(this.f166672h, uiVar.f166672h) && this.i == uiVar.i && Intrinsics.f(this.f166673j, uiVar.f166673j) && this.k == uiVar.k && Intrinsics.f(this.f166674l, uiVar.f166674l) && Intrinsics.f(this.f166675m, uiVar.f166675m) && this.f166676n == uiVar.f166676n && Intrinsics.f(this.o, uiVar.o) && this.f166677p == uiVar.f166677p && this.f166678q == uiVar.f166678q && this.f166679r == uiVar.f166679r && this.f166680s == uiVar.f166680s;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51561p() {
        return this.f166677p;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166677p = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f166670c.hashCode() + p.a.d(this.f166668a.hashCode() * 31, 31, this.f166669b)) * 31;
        aw0.j1 j1Var = this.d;
        int iHashCode2 = (iHashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        aw0.e5 e5Var = this.e;
        int iHashCode3 = (iHashCode2 + (e5Var == null ? 0 : e5Var.hashCode())) * 31;
        aw0.t5 t5Var = this.f;
        int iHashCode4 = (iHashCode3 + (t5Var == null ? 0 : t5Var.f10541a.hashCode())) * 31;
        Float f = this.f166671g;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f166672h;
        int iC = j6.a.c((iHashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31, 31, this.i);
        aw0.s5 s5Var = this.f166673j;
        int iHashCode6 = (this.k.hashCode() + ((iC + (s5Var == null ? 0 : s5Var.hashCode())) * 31)) * 31;
        String str = this.f166674l;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Clause clause = this.f166675m;
        int iC2 = j6.a.c((iHashCode7 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f166676n);
        Object obj2 = this.o;
        return Integer.hashCode(this.f166680s) + j6.a.b(this.f166679r, j6.a.b(this.f166678q, j6.a.b(this.f166677p, (iC2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51558l() {
        return this.f166682w;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.v = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51559m() {
        return this.f166683x;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166684y = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51562q() {
        return this.f166678q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51564s() {
        return this.f166680s;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166678q = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.v;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.z;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51560n() {
        return this.f166684y;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166682w = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51563r() {
        return this.f166679r;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166683x = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.z = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ui ? (ui) oldItem : null) == null) {
            return null;
        }
        ui uiVar = (ui) oldItem;
        return new vi(!Intrinsics.f(uiVar.f166669b, this.f166669b), !Intrinsics.f(uiVar.f, this.f), !Intrinsics.e(uiVar.f166671g, this.f166671g), !Intrinsics.f(uiVar.u, this.u), !Intrinsics.f(uiVar.d, this.d), !Intrinsics.f(uiVar.e, this.e), uiVar.k != this.k, or0.b.l(this, (qv0.i) oldItem), uiVar.i != this.i, !Intrinsics.f(uiVar.f166673j, this.f166673j), !Intrinsics.f(uiVar.f166681t, this.f166681t), !Intrinsics.f(uiVar.f166674l, this.f166674l), !Intrinsics.f(uiVar.f166675m, this.f166675m), uiVar.f166676n != this.f166676n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ui(String listId, List items, aw0.e5 e5Var, aw0.t5 t5Var, boolean z, aw0.s5 s5Var, aw0.d5 heightMode, int i, int i2, int i3, int i5) {
        Float fValueOf = Float.valueOf(40.0f);
        aw0.e5 e5Var2 = (i5 & 8) != 0 ? null : e5Var;
        Float f = (i5 & 32) != 0 ? null : fValueOf;
        boolean z3 = (i5 & 64) != 0 ? false : z;
        aw0.s5 s5Var2 = (i5 & 256) != 0 ? null : s5Var;
        String str = (i5 & 512) == 0 ? "FlexibleBarChart" : null;
        int i6 = R$attr.uikit_dp0;
        int i21 = (i5 & 16384) != 0 ? i6 : i;
        int i22 = (32768 & i5) != 0 ? i6 : i2;
        int i32 = (i5 & 65536) != 0 ? i6 : i3;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this(listId, items, z3 ? aw0.m5.SPACE_BETWEEN : aw0.m5.FIXED, e5Var2, t5Var, null, f, false, s5Var2, heightMode, str, null, i6, i21, i22, i32, 8192);
    }
}
