package ip0;

import com.revolut.core.ui_kit.delegates.CalendarRowLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class b5 implements tw0.y, qv0.p, qv0.q, qv0.l {

    @NotNull
    public static final a5 Companion = new a5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f163531c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163533h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163534j;
    public qv0.k k;

    public b5(String str, int i, int i2, int i3, int i5) {
        qv0.k kVar = qv0.k.OutOfGroup;
        this.f163529a = str;
        this.f163530b = c.d.f249513a;
        this.f163531c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163532g = i;
        this.f163533h = i2;
        this.i = i3;
        this.f163534j = i5;
        this.k = kVar;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getE() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.k = kVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CalendarRowLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53016n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53008a() {
        return this.f163529a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj2;
        return Intrinsics.f(this.f163529a, b5Var.f163529a) && Intrinsics.f(this.f163530b, b5Var.f163530b) && Intrinsics.f(this.f163531c, b5Var.f163531c) && Intrinsics.f(this.d, b5Var.d) && Intrinsics.f(this.e, b5Var.e) && Intrinsics.f(this.f, b5Var.f) && this.f163532g == b5Var.f163532g && this.f163533h == b5Var.f163533h && this.i == b5Var.i && this.f163534j == b5Var.f163534j && this.k == b5Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f163532g;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getU() {
        return this.k;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163532g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163530b, this.f163529a.hashCode() * 961, 31);
        p31.c cVar = this.f163531c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return this.k.hashCode() + j6.a.b(this.f163534j, j6.a.b(this.i, j6.a.b(this.f163533h, j6.a.b(this.f163532g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163530b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.f163531c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f163533h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.f163534j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163533h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f163530b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163531c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof b5 ? (b5) oldItem : null) != null) {
            return new c5(or0.b.m(this, (qv0.l) oldItem));
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b5(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp18;
        int i2 = R$attr.uikit_dp16;
        this(listId, i, i, i2, i2);
    }
}
