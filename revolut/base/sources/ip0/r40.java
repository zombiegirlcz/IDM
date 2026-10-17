package ip0;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class r40 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166106c;
    public final Clause d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f166107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166108h;
    public final q40 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f166109j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f166112n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f166113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f166114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f166115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f166116s;

    /* JADX WARN: Illegal instructions before constructor call */
    public r40(String listId, Clause clause, Clause clause2, Clause clause3, Clause clause4, List list, int i, boolean z, q40 q40Var, int i2, int i3, int i5, Object obj2, int i6) {
        Clause clause5 = (i6 & 2) != 0 ? null : clause;
        Clause clause6 = (i6 & 8) != 0 ? null : clause3;
        Clause clause7 = (i6 & 16) != 0 ? null : clause4;
        List endIcons = (i6 & 32) != 0 ? zhm.f0.f322471a : list;
        boolean z3 = (i6 & 128) != 0 ? false : z;
        q40 style = (i6 & 256) != 0 ? p40.f165765a : q40Var;
        int i21 = (i6 & 512) != 0 ? R$attr.uikit_dp4 : i2;
        int i22 = (i6 & 1024) != 0 ? R$attr.uikit_dp4 : i3;
        int i32 = R$attr.uikit_dp16;
        int i33 = (i6 & 4096) != 0 ? i32 : i5;
        Object obj3 = (i6 & 8192) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(endIcons, "endIcons");
        Intrinsics.checkNotNullParameter(style, "style");
        this(listId, clause5, clause2, clause6, clause7, endIcons, i, z3, style, c.d.f249513a, null, null, null, null, i21, i22, i32, i33, obj3);
    }

    public static r40 e(r40 r40Var, Clause clause, int i, int i2) {
        String listId = r40Var.f166104a;
        Clause clause2 = (i2 & 2) != 0 ? r40Var.f166105b : clause;
        Clause clause3 = r40Var.f166106c;
        Clause clause4 = r40Var.d;
        Clause clause5 = r40Var.e;
        List endIcons = r40Var.f;
        int i3 = r40Var.f166107g;
        boolean z = r40Var.f166108h;
        q40 style = r40Var.i;
        qv0.c positionInBox = r40Var.f166109j;
        p31.c cVar = r40Var.k;
        p31.c cVar2 = r40Var.f166110l;
        p31.c cVar3 = r40Var.f166111m;
        p31.c cVar4 = r40Var.f166112n;
        int i5 = r40Var.o;
        Clause clause6 = clause2;
        int i6 = (i2 & 32768) != 0 ? r40Var.f166113p : i;
        int i21 = r40Var.f166114q;
        int i22 = r40Var.f166115r;
        Object obj2 = r40Var.f166116s;
        r40Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(endIcons, "endIcons");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return new r40(listId, clause6, clause3, clause4, clause5, endIcons, i3, z, style, positionInBox, cVar, cVar2, cVar3, cVar4, i5, i6, i21, i22, obj2);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressStepVerticalDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52567m() {
        return this.f166116s;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55132b() {
        return this.f166104a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r40)) {
            return false;
        }
        r40 r40Var = (r40) obj2;
        return Intrinsics.f(this.f166104a, r40Var.f166104a) && Intrinsics.f(this.f166105b, r40Var.f166105b) && Intrinsics.f(this.f166106c, r40Var.f166106c) && Intrinsics.f(this.d, r40Var.d) && Intrinsics.f(this.e, r40Var.e) && Intrinsics.f(this.f, r40Var.f) && this.f166107g == r40Var.f166107g && this.f166108h == r40Var.f166108h && Intrinsics.f(this.i, r40Var.i) && Intrinsics.f(this.f166109j, r40Var.f166109j) && Intrinsics.f(this.k, r40Var.k) && Intrinsics.f(this.f166110l, r40Var.f166110l) && Intrinsics.f(this.f166111m, r40Var.f166111m) && Intrinsics.f(this.f166112n, r40Var.f166112n) && this.o == r40Var.o && this.f166113p == r40Var.f166113p && this.f166114q == r40Var.f166114q && this.f166115r == r40Var.f166115r && Intrinsics.f(this.f166116s, r40Var.f166116s);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.o;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.o = i;
    }

    public final int hashCode() {
        int iHashCode = this.f166104a.hashCode() * 31;
        Clause clause = this.f166105b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f166106c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.e;
        int i = h30.l.i(this.f166109j, (this.i.hashCode() + j6.a.c(j6.a.b(this.f166107g, p.a.d((iHashCode4 + (clause4 == null ? 0 : clause4.hashCode())) * 31, 31, this.f), 31), 31, this.f166108h)) * 31, 31);
        p31.c cVar = this.k;
        int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166110l;
        int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166111m;
        int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166112n;
        int iB = j6.a.b(this.f166115r, j6.a.b(this.f166114q, j6.a.b(this.f166113p, j6.a.b(this.o, (iHashCode7 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
        Object obj2 = this.f166116s;
        return iB + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f166112n;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166109j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166110l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.f166113p;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.f166115r;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166113p = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f166109j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.f166111m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.f166110l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166112n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f166114q;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166111m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof r40)) {
            return null;
        }
        r40 r40Var = (r40) oldItem;
        boolean z12 = !Intrinsics.f(this.f166105b, r40Var.f166105b);
        boolean z29 = !Intrinsics.f(this.f166106c, r40Var.f166106c);
        boolean z31 = !Intrinsics.f(this.d, r40Var.d);
        boolean z41 = !Intrinsics.f(this.e, r40Var.e);
        if (this.f166107g != r40Var.f166107g) {
            z = true;
            z3 = z29;
            z4 = z31;
            z6 = z41;
            z11 = true;
        } else {
            z = true;
            z3 = z29;
            z4 = z31;
            z6 = z41;
            z11 = false;
        }
        return new s40(z12, z3, z4, z6, z11, Intrinsics.f(this.f, r40Var.f) ^ z, this.f166108h != r40Var.f166108h ? z : false, Intrinsics.f(this.i, r40Var.i) ^ z);
    }

    public r40(String str, Clause clause, Clause clause2, Clause clause3, Clause clause4, List list, int i, boolean z, q40 q40Var, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i2, int i3, int i5, int i6, Object obj2) {
        this.f166104a = str;
        this.f166105b = clause;
        this.f166106c = clause2;
        this.d = clause3;
        this.e = clause4;
        this.f = list;
        this.f166107g = i;
        this.f166108h = z;
        this.i = q40Var;
        this.f166109j = cVar;
        this.k = cVar2;
        this.f166110l = cVar3;
        this.f166111m = cVar4;
        this.f166112n = cVar5;
        this.o = i2;
        this.f166113p = i3;
        this.f166114q = i5;
        this.f166115r = i6;
        this.f166116s = obj2;
    }
}
