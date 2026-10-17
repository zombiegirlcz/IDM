package h3a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f149064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv0.i f149065b;

    public m(TextClause textClause, qv0.i wrappedItem) {
        Intrinsics.checkNotNullParameter(wrappedItem, "wrappedItem");
        this.f149064a = textClause;
        this.f149065b = wrappedItem;
    }

    @Override // koi.j
    public final koi.k T1() {
        return this.f149065b.T1();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51552a() {
        return this.f149065b.getF51552a();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f149064a, mVar.f149064a) && Intrinsics.f(this.f149065b, mVar.f149065b);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51561p() {
        return this.f149065b.getF51561p();
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f149065b.g(i);
    }

    public final int hashCode() {
        Clause clause = this.f149064a;
        return this.f149065b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51558l() {
        return this.f149065b.getF51558l();
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f149065b.j(cVar);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51559m() {
        return this.f149065b.getF51559m();
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f149065b.l(cVar);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51562q() {
        return this.f149065b.getF51562q();
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51564s() {
        return this.f149065b.getF51564s();
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f149065b.o(i);
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f149065b.getK();
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f149065b.getO();
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51560n() {
        return this.f149065b.getF51560n();
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f149065b.s(cVar);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51563r() {
        return this.f149065b.getF51563r();
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f149065b.u(cVar);
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f149065b.w(cVar);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return this.f149065b.z(oldItem);
    }
}
