package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class rl0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ql0 f166206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166207c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166209h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166210j;
    public final int k;

    public rl0(String listId, ql0 style) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        int i = R$attr.uikit_dp0;
        this.f166205a = listId;
        this.f166206b = style;
        this.f166207c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166208g = null;
        this.f166209h = i;
        this.i = i;
        this.f166210j = i;
        this.k = i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59201a() {
        return this.f166205a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rl0)) {
            return false;
        }
        rl0 rl0Var = (rl0) obj2;
        return Intrinsics.f(this.f166205a, rl0Var.f166205a) && this.f166206b == rl0Var.f166206b && Intrinsics.f(this.f166207c, rl0Var.f166207c) && Intrinsics.f(this.d, rl0Var.d) && Intrinsics.f(this.e, rl0Var.e) && Intrinsics.f(this.f, rl0Var.f) && Intrinsics.f(this.f166208g, rl0Var.f166208g) && this.f166209h == rl0Var.f166209h && this.i == rl0Var.i && this.f166210j == rl0Var.f166210j && this.k == rl0Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.f166209h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166209h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166207c, (this.f166206b.hashCode() + (this.f166205a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166208g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166210j, j6.a.b(this.i, j6.a.b(this.f166209h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166207c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52330l() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52333p() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52335r() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52329j() {
        return this.f166207c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52332n() {
        return this.f166208g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52331m() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52334q() {
        return this.f166210j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166208g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof rl0 ? (rl0) oldItem : null) != null) {
            return new sl0(or0.b.l(this, (qv0.i) oldItem), ((rl0) oldItem).f166206b != this.f166206b);
        }
        return null;
    }
}
