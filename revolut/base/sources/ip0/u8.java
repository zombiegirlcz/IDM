package ip0;

import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class u8 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f166618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166619c;
    public final Object d;
    public final Image e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ms0.h4 f166620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ms0.h4 f166621h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166622j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f166623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f166625n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f166626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f166627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f166628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f166629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f166630t;

    public u8(String listId, Clause title, Clause clause, Clause value, ResourceImage incrementButtonIcon, ResourceImage decrementButtonIcon, boolean z, boolean z3, Object obj2, int i) {
        ms0.h4 decrementButtonStyle = ms0.h4.SEMIACCENT;
        boolean z4 = (i & 512) != 0 ? true : z;
        boolean z6 = (i & 1024) == 0 ? z3 : true;
        Object obj3 = (i & 2048) != 0 ? null : obj2;
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(incrementButtonIcon, "incrementButtonIcon");
        Intrinsics.checkNotNullParameter(decrementButtonIcon, "decrementButtonIcon");
        Intrinsics.checkNotNullParameter(decrementButtonStyle, "incrementButtonStyle");
        Intrinsics.checkNotNullParameter(decrementButtonStyle, "decrementButtonStyle");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(incrementButtonIcon, "incrementButtonIcon");
        Intrinsics.checkNotNullParameter(decrementButtonIcon, "decrementButtonIcon");
        Intrinsics.checkNotNullParameter(decrementButtonStyle, "incrementButtonStyle");
        Intrinsics.checkNotNullParameter(decrementButtonStyle, "decrementButtonStyle");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166617a = listId;
        this.f166618b = title;
        this.f166619c = clause;
        this.d = value;
        this.e = incrementButtonIcon;
        this.f = decrementButtonIcon;
        this.f166620g = decrementButtonStyle;
        this.f166621h = decrementButtonStyle;
        this.i = z4;
        this.f166622j = z6;
        this.k = obj3;
        this.f166623l = positionInBox;
        this.f166624m = null;
        this.f166625n = null;
        this.o = null;
        this.f166626p = null;
        this.f166627q = i2;
        this.f166628r = i2;
        this.f166629s = i3;
        this.f166630t = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellIncrementDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return this.k;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f166617a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj2;
        return Intrinsics.f(this.f166617a, u8Var.f166617a) && Intrinsics.f(this.f166618b, u8Var.f166618b) && Intrinsics.f(this.f166619c, u8Var.f166619c) && Intrinsics.f(this.d, u8Var.d) && Intrinsics.f(this.e, u8Var.e) && Intrinsics.f(this.f, u8Var.f) && this.f166620g == u8Var.f166620g && this.f166621h == u8Var.f166621h && this.i == u8Var.i && this.f166622j == u8Var.f166622j && Intrinsics.f(this.k, u8Var.k) && Intrinsics.f(this.f166623l, u8Var.f166623l) && Intrinsics.f(this.f166624m, u8Var.f166624m) && Intrinsics.f(this.f166625n, u8Var.f166625n) && Intrinsics.f(this.o, u8Var.o) && Intrinsics.f(this.f166626p, u8Var.f166626p) && this.f166627q == u8Var.f166627q && this.f166628r == u8Var.f166628r && this.f166629s == u8Var.f166629s && this.f166630t == u8Var.f166630t;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f166627q;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166627q = i;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f166617a.hashCode() * 961, 31, this.f166618b);
        Clause clause = this.f166619c;
        int iC = j6.a.c(j6.a.c((this.f166621h.hashCode() + ((this.f166620g.hashCode() + a10.b.c(this.f, a10.b.c(this.e, p.a.b((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31), 31)) * 31)) * 31, 31, this.i), 31, this.f166622j);
        Object obj2 = this.k;
        int i = h30.l.i(this.f166623l, (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f166624m;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166625n;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.o;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166626p;
        return Integer.hashCode(this.f166630t) + j6.a.b(this.f166629s, j6.a.b(this.f166628r, j6.a.b(this.f166627q, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f166624m;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166623l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f166625n;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f166628r;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f166630t;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166628r = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f166623l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f166626p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.o;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166624m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f166629s;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166625n = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166626p = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof u8 ? (u8) oldItem : null) == null) {
            return null;
        }
        u8 u8Var = (u8) oldItem;
        u8Var.getClass();
        boolean z3 = !true;
        boolean z4 = !Intrinsics.f(u8Var.f166618b, this.f166618b);
        boolean z6 = !Intrinsics.f(u8Var.f166619c, this.f166619c);
        boolean z11 = !Intrinsics.f(u8Var.d, this.d);
        boolean z12 = false;
        boolean z29 = u8Var.f166620g != this.f166620g;
        if (u8Var.f166621h != this.f166621h) {
            z = false;
            z12 = true;
        } else {
            z = false;
        }
        return new v8(z3, z4, z6, z11, z29, z12, !Intrinsics.f(u8Var.e, this.e), !Intrinsics.f(u8Var.f, this.f), (Intrinsics.f(u8Var.f166624m, this.f166624m) && Intrinsics.f(u8Var.f166625n, this.f166625n) && Intrinsics.f(u8Var.o, this.o) && Intrinsics.f(u8Var.f166626p, this.f166626p)) ? z : true, u8Var.i != this.i ? true : z, u8Var.f166622j != this.f166622j ? true : z);
    }
}
