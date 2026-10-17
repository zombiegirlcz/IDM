package ip0;

import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class r70 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f166130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166131c;
    public final Object d;
    public final Object e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f166132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f166133h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f166134j;
    public qv0.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f166137n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f166138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f166139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f166140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f166141s;

    public r70(String listId, Clause title, TextLocalisedClause textLocalisedClause, Clause startLabel, Clause endLabel, int i, int i2, int i3, int i5, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        int i6 = R$attr.uikit_dp16;
        this.f166129a = listId;
        this.f166130b = title;
        this.f166131c = textLocalisedClause;
        this.d = startLabel;
        this.e = endLabel;
        this.f = i;
        this.f166132g = i2;
        this.f166133h = i3;
        this.i = i5;
        this.f166134j = obj2;
        this.k = c.d.f249513a;
        this.f166135l = null;
        this.f166136m = null;
        this.f166137n = null;
        this.o = null;
        this.f166138p = i6;
        this.f166139q = i6;
        this.f166140r = i6;
        this.f166141s = i6;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RangeSliderTitleDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55089j() {
        return this.f166134j;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55086c() {
        return this.f166129a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r70)) {
            return false;
        }
        r70 r70Var = (r70) obj2;
        return Intrinsics.f(this.f166129a, r70Var.f166129a) && Intrinsics.f(this.f166130b, r70Var.f166130b) && Intrinsics.f(this.f166131c, r70Var.f166131c) && Intrinsics.f(this.d, r70Var.d) && Intrinsics.f(this.e, r70Var.e) && this.f == r70Var.f && this.f166132g == r70Var.f166132g && this.f166133h == r70Var.f166133h && this.i == r70Var.i && Intrinsics.f(this.f166134j, r70Var.f166134j) && Intrinsics.f(this.k, r70Var.k) && Intrinsics.f(this.f166135l, r70Var.f166135l) && Intrinsics.f(this.f166136m, r70Var.f166136m) && Intrinsics.f(this.f166137n, r70Var.f166137n) && Intrinsics.f(this.o, r70Var.o) && this.f166138p == r70Var.f166138p && this.f166139q == r70Var.f166139q && this.f166140r == r70Var.f166140r && this.f166141s == r70Var.f166141s;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53621s() {
        return this.f166138p;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166138p = i;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f166129a.hashCode() * 31, 31, this.f166130b);
        Clause clause = this.f166131c;
        int iB2 = j6.a.b(this.i, j6.a.b(this.f166133h, j6.a.b(this.f166132g, j6.a.b(this.f, p.a.b(p.a.b((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31), 31), 31);
        Object obj2 = this.f166134j;
        int i = h30.l.i(this.k, (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f166135l;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166136m;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166137n;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.o;
        return Integer.hashCode(this.f166141s) + j6.a.b(this.f166140r, j6.a.b(this.f166139q, j6.a.b(this.f166138p, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53624x() {
        return this.f166135l;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53625y() {
        return this.f166136m;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166137n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53622t() {
        return this.f166139q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.f166141s;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166139q = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getB() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getA() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getZ() {
        return this.f166137n;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166135l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.f166140r;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166136m = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.o = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof r70 ? (r70) oldItem : null) == null) {
            return null;
        }
        r70 r70Var = (r70) oldItem;
        boolean z3 = !Intrinsics.f(r70Var.f166130b, this.f166130b);
        boolean z4 = !Intrinsics.f(r70Var.f166131c, this.f166131c);
        boolean z6 = !Intrinsics.f(r70Var.d, this.d);
        boolean z11 = !Intrinsics.f(r70Var.e, this.e);
        boolean z12 = false;
        boolean z29 = r70Var.f != this.f;
        if (r70Var.f166132g != this.f166132g) {
            z = false;
            z12 = true;
        } else {
            z = false;
        }
        return new s70(z3, z4, z6, z11, z29, z12, (r70Var.f166133h == this.f166133h && r70Var.i == this.i) ? z : true, (Intrinsics.f(r70Var.f166135l, this.f166135l) && Intrinsics.f(r70Var.f166136m, this.f166136m) && Intrinsics.f(r70Var.f166137n, this.f166137n) && Intrinsics.f(r70Var.o, this.o)) ? z : true);
    }
}
