package ip0;

import com.revolut.core.ui_kit.delegates.LogosDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dw implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f163964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bw f163965c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163967h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163968j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f163969l;

    public dw(Set items) {
        bw size = bw.COMPACT;
        Intrinsics.checkNotNullParameter("logos", "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(size, "size");
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        this.f163963a = "logos";
        this.f163964b = items;
        this.f163965c = size;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f163966g = null;
        this.f163967h = null;
        this.i = i;
        this.f163968j = i;
        this.k = i2;
        this.f163969l = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LogosDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51573a() {
        return this.f163963a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj2;
        return Intrinsics.f(this.f163963a, dwVar.f163963a) && Intrinsics.f(this.f163964b, dwVar.f163964b) && this.f163965c == dwVar.f163965c && Intrinsics.f(this.d, dwVar.d) && Intrinsics.f(this.e, dwVar.e) && Intrinsics.f(this.f, dwVar.f) && Intrinsics.f(this.f163966g, dwVar.f163966g) && Intrinsics.f(this.f163967h, dwVar.f163967h) && this.i == dwVar.i && this.f163968j == dwVar.f163968j && this.k == dwVar.k && this.f163969l == dwVar.f163969l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51584r() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, (this.f163965c.hashCode() + p.a.f(this.f163963a.hashCode() * 31, 31, this.f163964b)) * 31, 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163966g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163967h;
        return Integer.hashCode(this.f163969l) + j6.a.b(this.k, j6.a.b(this.f163968j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51581n() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163966g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51585s() {
        return this.f163968j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f163969l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163968j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51580m() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51583q() {
        return this.f163967h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51582p() {
        return this.f163966g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51586t() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163967h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof dw ? (dw) oldItem : null) == null) {
            return null;
        }
        dw dwVar = (dw) oldItem;
        return new ew((Intrinsics.f(dwVar.f163964b, this.f163964b) && dwVar.f163965c == this.f163965c) ? false : true, or0.b.l(this, (qv0.i) oldItem));
    }
}
