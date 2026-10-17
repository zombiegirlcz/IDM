package ip0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class y7 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f167260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f167261c;
    public final Clause d;
    public final int e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f167262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167263h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f167264j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f167265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f167266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f167267n;
    public final int o;

    public y7(String listId, Clause price, Clause title, MoneyClause moneyClause, int i, Parcelable parcelable, int i2, int i3, int i5) {
        moneyClause = (i5 & 8) != 0 ? null : moneyClause;
        i = (i5 & 16) != 0 ? 0 : i;
        parcelable = (i5 & 32) != 0 ? null : parcelable;
        i2 = (i5 & 128) != 0 ? R$attr.uikit_dp0 : i2;
        i3 = (i5 & 256) != 0 ? R$attr.uikit_dp0 : i3;
        int i6 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f167259a = listId;
        this.f167260b = price;
        this.f167261c = title;
        this.d = moneyClause;
        this.e = i;
        this.f = parcelable;
        this.f167262g = c.d.f249513a;
        this.f167263h = null;
        this.i = null;
        this.f167264j = null;
        this.k = null;
        this.f167265l = i2;
        this.f167266m = i3;
        this.f167267n = i6;
        this.o = i6;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsPriceDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52731b() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52730a() {
        return this.f167259a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj2;
        return Intrinsics.f(this.f167259a, y7Var.f167259a) && this.f167260b.equals(y7Var.f167260b) && this.f167261c.equals(y7Var.f167261c) && Intrinsics.f(this.d, y7Var.d) && this.e == y7Var.e && Intrinsics.f(this.f, y7Var.f) && Intrinsics.f(this.f167262g, y7Var.f167262g) && Intrinsics.f(this.f167263h, y7Var.f167263h) && Intrinsics.f(this.i, y7Var.i) && Intrinsics.f(this.f167264j, y7Var.f167264j) && Intrinsics.f(this.k, y7Var.k) && this.f167265l == y7Var.f167265l && this.f167266m == y7Var.f167266m && this.f167267n == y7Var.f167267n && this.o == y7Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52739p() {
        return this.f167265l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167265l = i;
    }

    public final int hashCode() {
        int iB = p.a.b(p.a.b(this.f167259a.hashCode() * 31, 31, this.f167260b), 31, this.f167261c);
        Clause clause = this.d;
        int iB2 = j6.a.b(this.e, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 961);
        Object obj2 = this.f;
        int i = h30.l.i(this.f167262g, (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f167263h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167264j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f167267n, j6.a.b(this.f167266m, j6.a.b(this.f167265l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getV() {
        return this.f167263h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167262g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52744w() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167264j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52740q() {
        return this.f167266m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52742s() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167266m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getU() {
        return this.f167262g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52746y() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52745x() {
        return this.f167264j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167263h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52741r() {
        return this.f167267n;
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
        if ((oldItem instanceof y7 ? (y7) oldItem : null) == null) {
            return null;
        }
        y7 y7Var = (y7) oldItem;
        return new z7(!y7Var.f167260b.equals(this.f167260b), !y7Var.f167261c.equals(this.f167261c), !Intrinsics.f(y7Var.d, this.d), y7Var.e != this.e, (Intrinsics.f(y7Var.f167263h, this.f167263h) && Intrinsics.f(y7Var.i, this.i) && Intrinsics.f(y7Var.f167264j, this.f167264j) && Intrinsics.f(y7Var.k, this.k)) ? false : true, !true, !true, !true);
    }
}
