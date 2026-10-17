package ip0;

import com.revolut.core.ui_kit.delegates.AvatarLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class d2 implements qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f163825c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163827h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163828j;
    public final c2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g2 f163829l;

    public d2(String listId, c2 shape, g2 widthMode) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        int i = R$attr.uikit_dp0;
        this.f163823a = listId;
        this.f163824b = c.d.f249513a;
        this.f163825c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163826g = i;
        this.f163827h = i;
        this.i = i;
        this.f163828j = i;
        this.k = shape;
        this.f163829l = widthMode;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AvatarLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52560a() {
        return this.f163823a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f163823a, d2Var.f163823a) && Intrinsics.f(this.f163824b, d2Var.f163824b) && Intrinsics.f(this.f163825c, d2Var.f163825c) && Intrinsics.f(this.d, d2Var.d) && Intrinsics.f(this.e, d2Var.e) && Intrinsics.f(this.f, d2Var.f) && this.f163826g == d2Var.f163826g && this.f163827h == d2Var.f163827h && this.i == d2Var.i && this.f163828j == d2Var.f163828j && this.k == d2Var.k && this.f163829l == d2Var.f163829l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52568n() {
        return this.f163826g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163826g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163824b, this.f163823a.hashCode() * 31, 31);
        p31.c cVar = this.f163825c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return this.f163829l.hashCode() + ((this.k.hashCode() + j6.a.b(this.f163828j, j6.a.b(this.i, j6.a.b(this.f163827h, j6.a.b(this.f163826g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52572s() {
        return this.f163825c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163824b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52573t() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.f163827h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52570q() {
        return this.f163828j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163827h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52571r() {
        return this.f163824b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163825c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52569p() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        d2 d2Var = oldItem instanceof d2 ? (d2) oldItem : null;
        if (d2Var != null) {
            return new b2(this.k != d2Var.k, this.f163829l != d2Var.f163829l);
        }
        return null;
    }

    public /* synthetic */ d2(String str, c2 c2Var) {
        this(str, c2Var, g2.WRAP_CONTENT);
    }
}
