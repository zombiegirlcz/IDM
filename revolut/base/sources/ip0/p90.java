package ip0;

import com.revolut.core.ui_kit.delegates.RatingBarDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class p90 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f165791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o90 f165792c;
    public final int d;
    public final Integer e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f165793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165794h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165795j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f165796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f165797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f165798n;
    public final int o;

    public p90(String listId, float f, o90 o90Var, int i, Integer num, int i2, int i3, int i5) {
        o90Var = (i5 & 4) != 0 ? null : o90Var;
        i = (i5 & 8) != 0 ? R$attr.uikit_colorTerracotta : i;
        num = (i5 & 16) != 0 ? Integer.valueOf(R$attr.uikit_colorYellow) : num;
        i2 = (i5 & 32) != 0 ? R$attr.uikit_colorGreen : i2;
        int i6 = R$attr.uikit_dp16;
        i3 = (i5 & 128) != 0 ? i6 : i3;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f165790a = listId;
        this.f165791b = f;
        this.f165792c = o90Var;
        this.d = i;
        this.e = num;
        this.f = i2;
        this.f165793g = c.d.f249513a;
        this.f165794h = null;
        this.i = null;
        this.f165795j = null;
        this.k = null;
        this.f165796l = i6;
        this.f165797m = i3;
        this.f165798n = i6;
        this.o = i6;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RatingBarDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f165790a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj2;
        return Intrinsics.f(this.f165790a, p90Var.f165790a) && Float.compare(this.f165791b, p90Var.f165791b) == 0 && Intrinsics.f(this.f165792c, p90Var.f165792c) && this.d == p90Var.d && Intrinsics.f(this.e, p90Var.e) && this.f == p90Var.f && Intrinsics.f(this.f165793g, p90Var.f165793g) && Intrinsics.f(this.f165794h, p90Var.f165794h) && Intrinsics.f(this.i, p90Var.i) && Intrinsics.f(this.f165795j, p90Var.f165795j) && Intrinsics.f(this.k, p90Var.k) && this.f165796l == p90Var.f165796l && this.f165797m == p90Var.f165797m && this.f165798n == p90Var.f165798n && this.o == p90Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.f165796l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165796l = i;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f165791b, this.f165790a.hashCode() * 31, 31);
        o90 o90Var = this.f165792c;
        int iB2 = j6.a.b(this.d, (iB + (o90Var == null ? 0 : o90Var.hashCode())) * 31, 31);
        Integer num = this.e;
        int i = h30.l.i(this.f165793g, j6.a.b(this.f, (iB2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        p31.c cVar = this.f165794h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165795j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f165798n, j6.a.b(this.f165797m, j6.a.b(this.f165796l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f165794h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165793g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165795j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.f165797m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165797m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.f165793g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f165795j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165794h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f165798n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof p90 ? (p90) oldItem : null) == null) {
            return null;
        }
        p90 p90Var = (p90) oldItem;
        return new q90(!(p90Var.f165791b == this.f165791b), !Intrinsics.f(p90Var.f165792c, this.f165792c), p90Var.d != this.d, !Intrinsics.f(p90Var.e, this.e), p90Var.f != this.f, (Intrinsics.f(p90Var.f165794h, this.f165794h) && Intrinsics.f(p90Var.i, this.i) && Intrinsics.f(p90Var.f165795j, this.f165795j) && Intrinsics.f(p90Var.k, this.k)) ? false : true, (p90Var.f165796l == this.f165796l && p90Var.f165797m == this.f165797m && p90Var.f165798n == this.f165798n && p90Var.o == this.o) ? false : true, !Intrinsics.f(p90Var.f165793g, this.f165793g));
    }
}
