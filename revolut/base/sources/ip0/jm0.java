package ip0;

import aw0.l1;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class jm0 implements qv0.i, qv0.p {
    public int A;
    public int B;
    public int C;
    public int D;
    public final Object E;
    public final Object F;
    public final uw0.i G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.cb f164880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f164881c;
    public final boolean d;
    public final hw0.x e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164883h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Pair f164884j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f164885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hw0.z f164886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f164887n;
    public final aw0.l1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hm0 f164888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f164889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hw0.t f164890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hw0.f f164891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f164892t;
    public final Integer u;
    public p31.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p31.c f164893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p31.c f164894x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p31.c f164895y;
    public qv0.c z;

    public jm0(String listId, aw0.cb colorScheme, List list, boolean z, hw0.x xVar, List lines, int i, boolean z3, int i2, Pair pair, boolean z4, boolean z6, hw0.z zVar, List list2, aw0.l1 interpolation, hm0 lineStyle, List levelLines, hw0.t tVar, hw0.f fVar, String str, Integer num, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, qv0.c positionInBox, int i3, int i5, int i6, int i21, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(interpolation, "interpolation");
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        Intrinsics.checkNotNullParameter(levelLines, "levelLines");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f164879a = listId;
        this.f164880b = colorScheme;
        this.f164881c = list;
        this.d = z;
        this.e = xVar;
        this.f = lines;
        this.f164882g = i;
        this.f164883h = z3;
        this.i = i2;
        this.f164884j = pair;
        this.k = z4;
        this.f164885l = z6;
        this.f164886m = zVar;
        this.f164887n = list2;
        this.o = interpolation;
        this.f164888p = lineStyle;
        this.f164889q = levelLines;
        this.f164890r = tVar;
        this.f164891s = fVar;
        this.f164892t = str;
        this.u = num;
        this.v = cVar;
        this.f164893w = cVar2;
        this.f164894x = cVar3;
        this.f164895y = cVar4;
        this.z = positionInBox;
        this.A = i3;
        this.B = i5;
        this.C = i6;
        this.D = i21;
        this.E = obj2;
        this.F = te0.w.y0(new ie7.a(this, 21));
        this.G = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, false);
    }

    public static jm0 e(jm0 jm0Var, aw0.cb cbVar, zhm.f0 f0Var, int i, int i2, int i3, int i5, int i6) {
        List list;
        List levelLines;
        boolean z;
        int i21;
        String listId = (i6 & 1) != 0 ? jm0Var.f164879a : "PERFORMANCE_CHART_LIST_ID";
        aw0.cb colorScheme = (i6 & 2) != 0 ? jm0Var.f164880b : cbVar;
        List list2 = jm0Var.f164881c;
        boolean z3 = jm0Var.d;
        hw0.x xVar = jm0Var.e;
        List lines = jm0Var.f;
        int i22 = jm0Var.f164882g;
        boolean z4 = jm0Var.f164883h;
        int i32 = (i6 & 256) != 0 ? jm0Var.i : 230;
        Pair pair = jm0Var.f164884j;
        boolean z6 = jm0Var.k;
        boolean z11 = (i6 & 2048) != 0 ? jm0Var.f164885l : true;
        hw0.z zVar = jm0Var.f164886m;
        List list3 = jm0Var.f164887n;
        aw0.l1 interpolation = jm0Var.o;
        hm0 lineStyle = jm0Var.f164888p;
        if ((i6 & 65536) != 0) {
            list = list3;
            levelLines = jm0Var.f164889q;
        } else {
            list = list3;
            levelLines = f0Var;
        }
        hw0.t tVar = jm0Var.f164890r;
        hw0.f fVar = jm0Var.f164891s;
        String str = jm0Var.f164892t;
        jm0Var.getClass();
        Integer num = jm0Var.u;
        p31.c cVar = jm0Var.v;
        p31.c cVar2 = jm0Var.f164893w;
        p31.c cVar3 = jm0Var.f164894x;
        p31.c cVar4 = jm0Var.f164895y;
        qv0.c positionInBox = jm0Var.z;
        if ((i6 & 134217728) != 0) {
            z = z3;
            i21 = jm0Var.A;
        } else {
            z = z3;
            i21 = i;
        }
        int i33 = (i6 & 268435456) != 0 ? jm0Var.B : i2;
        int i43 = (i6 & PKIFailureInfo.duplicateCertReq) != 0 ? jm0Var.C : i3;
        int i59 = (i6 & 1073741824) != 0 ? jm0Var.D : i5;
        Object obj2 = jm0Var.E;
        jm0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(interpolation, "interpolation");
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        Intrinsics.checkNotNullParameter(levelLines, "levelLines");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return new jm0(listId, colorScheme, list2, z, xVar, lines, i22, z4, i32, pair, z6, z11, zVar, list, interpolation, lineStyle, levelLines, tVar, fVar, str, num, cVar, cVar2, cVar3, cVar4, positionInBox, i21, i33, i43, i59, obj2);
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51719g() {
        return this.E;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53413a() {
        return this.f164879a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jm0)) {
            return false;
        }
        jm0 jm0Var = (jm0) obj2;
        return Intrinsics.f(this.f164879a, jm0Var.f164879a) && Intrinsics.f(this.f164880b, jm0Var.f164880b) && Intrinsics.f(this.f164881c, jm0Var.f164881c) && this.d == jm0Var.d && Intrinsics.f(this.e, jm0Var.e) && Intrinsics.f(this.f, jm0Var.f) && this.f164882g == jm0Var.f164882g && this.f164883h == jm0Var.f164883h && this.i == jm0Var.i && Intrinsics.f(this.f164884j, jm0Var.f164884j) && this.k == jm0Var.k && this.f164885l == jm0Var.f164885l && Intrinsics.f(this.f164886m, jm0Var.f164886m) && Intrinsics.f(this.f164887n, jm0Var.f164887n) && Intrinsics.f(this.o, jm0Var.o) && this.f164888p == jm0Var.f164888p && Intrinsics.f(this.f164889q, jm0Var.f164889q) && Intrinsics.f(this.f164890r, jm0Var.f164890r) && Intrinsics.f(this.f164891s, jm0Var.f164891s) && Intrinsics.f(this.f164892t, jm0Var.f164892t) && Intrinsics.f(this.u, jm0Var.u) && Intrinsics.f(this.v, jm0Var.v) && Intrinsics.f(this.f164893w, jm0Var.f164893w) && Intrinsics.f(this.f164894x, jm0Var.f164894x) && Intrinsics.f(this.f164895y, jm0Var.f164895y) && Intrinsics.f(this.z, jm0Var.z) && this.A == jm0Var.A && this.B == jm0Var.B && this.C == jm0Var.C && this.D == jm0Var.D && Intrinsics.f(this.E, jm0Var.E);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53416g() {
        return this.A;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.A = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f164880b.hashCode() + (this.f164879a.hashCode() * 31)) * 31;
        List list = this.f164881c;
        int iC = j6.a.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.d);
        hw0.x xVar = this.e;
        int iB = j6.a.b(this.i, j6.a.c(j6.a.b(this.f164882g, p.a.d((iC + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f), 31), 31, this.f164883h), 31);
        Pair pair = this.f164884j;
        int iC2 = j6.a.c(j6.a.c((iB + (pair == null ? 0 : pair.hashCode())) * 31, 31, this.k), 31, this.f164885l);
        hw0.z zVar = this.f164886m;
        int iHashCode2 = (iC2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        List list2 = this.f164887n;
        int iD = p.a.d((this.f164888p.hashCode() + ((this.o.hashCode() + ((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31)) * 31, 31, this.f164889q);
        hw0.t tVar = this.f164890r;
        int iHashCode3 = (iD + (tVar == null ? 0 : tVar.hashCode())) * 31;
        hw0.f fVar = this.f164891s;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f164892t;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 961;
        Integer num = this.u;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        p31.c cVar = this.v;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164893w;
        int iHashCode8 = (iHashCode7 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164894x;
        int iHashCode9 = (iHashCode8 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164895y;
        int iB2 = j6.a.b(this.D, j6.a.b(this.C, j6.a.b(this.B, j6.a.b(this.A, h30.l.i(this.z, (iHashCode9 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31), 31);
        Object obj2 = this.E;
        return iB2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53415c() {
        return this.v;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.z = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getD() {
        return this.f164893w;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164894x = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53417h() {
        return this.B;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53418j() {
        return this.D;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.B = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53414b() {
        return this.z;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF() {
        return this.f164895y;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getE() {
        return this.f164894x;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.v = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.C;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164893w = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164895y = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // koi.j
    public final Object z(Object oldItem) {
        List list;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        jm0 jm0Var = oldItem instanceof jm0 ? (jm0) oldItem : null;
        if (jm0Var == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(jm0Var, "<this>");
        Intrinsics.checkNotNullParameter(this, "newItem");
        boolean z = !Intrinsics.f(jm0Var.f164880b, this.f164880b);
        List list2 = jm0Var.f164881c;
        List list3 = this.f164881c;
        boolean z3 = !Intrinsics.f(list2, list3);
        List list4 = list2;
        boolean z4 = ((list4 != null && !list4.isEmpty()) || (list = list3) == null || list.isEmpty()) ? false : true;
        int i = this.f164882g;
        Integer numValueOf = Integer.valueOf(i);
        if (jm0Var.f164882g == i) {
            numValueOf = null;
        }
        boolean z6 = this.f164883h;
        Boolean boolValueOf = Boolean.valueOf(z6);
        if (jm0Var.f164883h == z6) {
            boolValueOf = null;
        }
        boolean z11 = this.d;
        Boolean boolValueOf2 = Boolean.valueOf(z11);
        if (jm0Var.d == z11) {
            boolValueOf2 = null;
        }
        return new br0.a(z, z3, Boolean.valueOf(z4), numValueOf, boolValueOf, boolValueOf2, !Intrinsics.f((List) this.F.getValue(), (List) jm0Var.F.getValue()), !Intrinsics.f(jm0Var.f164884j, this.f164884j), !Intrinsics.f(this.f164886m, jm0Var.f164886m), !Intrinsics.f(this.f164887n, jm0Var.f164887n), !Intrinsics.f(this.o, jm0Var.o), this.f164888p != jm0Var.f164888p, or0.b.l(this, jm0Var), !Intrinsics.f(this.f164890r, jm0Var.f164890r), this.f164885l != jm0Var.f164885l, !Intrinsics.f(this.f164891s, jm0Var.f164891s), !Intrinsics.f(this.G, jm0Var.G), !Intrinsics.f(jm0Var.f164892t, this.f164892t), this.k != jm0Var.k, !true, !Intrinsics.f(this.u, jm0Var.u));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jm0(String str, aw0.cb cbVar, List list, boolean z, hw0.x xVar, List list2, int i, boolean z3, int i2, Pair pair, boolean z4, boolean z6, hw0.z zVar, List list3, aw0.l1 l1Var, hm0 hm0Var, List list4, hw0.t tVar, hw0.f fVar, Integer num, int i3, int i5, int i6, int i21, int i22) {
        aw0.cb cbVarD;
        if ((i22 & 2) != 0) {
            aw0.cb.Companion.getClass();
            cbVarD = aw0.bb.d();
        } else {
            cbVarD = cbVar;
        }
        this(str, cbVarD, list, (i22 & 8) != 0 ? false : z, (i22 & 16) != 0 ? null : xVar, (i22 & 32) != 0 ? zhm.f0.f322471a : list2, i, z3, (i22 & 256) != 0 ? 200 : i2, (i22 & 512) != 0 ? null : pair, (i22 & 1024) != 0 ? true : z4, (i22 & 2048) != 0 ? false : z6, (i22 & 4096) != 0 ? null : zVar, (i22 & 8192) != 0 ? null : list3, (i22 & 16384) != 0 ? l1.d.f10401a : l1Var, (32768 & i22) != 0 ? hm0.Thin : hm0Var, (65536 & i22) != 0 ? zhm.f0.f322471a : list4, (131072 & i22) != 0 ? null : tVar, (262144 & i22) != 0 ? null : fVar, (524288 & i22) != 0 ? null : "Chart", (2097152 & i22) != 0 ? null : num, null, null, null, null, c.d.f249513a, (134217728 & i22) != 0 ? R$attr.uikit_dp0 : i3, (268435456 & i22) != 0 ? R$attr.uikit_dp0 : i5, (536870912 & i22) != 0 ? R$attr.uikit_dp0 : i6, (1073741824 & i22) != 0 ? R$attr.uikit_dp0 : i21, (i22 & Integer.MIN_VALUE) == 0 ? doc.c0.f116493a : null);
    }
}
