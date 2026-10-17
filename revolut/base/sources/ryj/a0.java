package ryj;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f258391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f258392b;

    public a0(TextClause textClause, qv0.i wrappedItem) {
        Intrinsics.checkNotNullParameter(wrappedItem, "wrappedItem");
        this.f258391a = textClause;
        this.f258392b = wrappedItem;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koi.j] */
    @Override // koi.j
    public final koi.k T1() {
        return this.f258392b.T1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koi.j] */
    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52539a() {
        return this.f258392b.getF52539a();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f258391a.equals(a0Var.f258391a) && this.f258392b.equals(a0Var.f258392b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.o] */
    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52545l() {
        return this.f258392b.getF52545l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.o] */
    @Override // qv0.o
    public final void g(int i) {
        this.f258392b.g(i);
    }

    public final int hashCode() {
        return this.f258392b.hashCode() + (this.f258391a.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o31.c] */
    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.f258392b.getK();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qv0.i] */
    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f258392b.j(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o31.c] */
    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52543h() {
        return this.f258392b.getF52543h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.n] */
    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f258392b.l(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.o] */
    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52546m() {
        return this.f258392b.getF52546m();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.o] */
    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.f258392b.getO();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.o] */
    @Override // qv0.o
    public final void o(int i) {
        this.f258392b.o(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.i] */
    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52542g() {
        return this.f258392b.getF52542g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o31.c] */
    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52544j() {
        return this.f258392b.getF52544j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o31.c] */
    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getI() {
        return this.f258392b.getI();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o31.c] */
    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f258392b.s(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.o] */
    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52547n() {
        return this.f258392b.getF52547n();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o31.c] */
    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f258392b.u(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qv0.n] */
    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f258392b.w(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koi.j] */
    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return this.f258392b.z(oldItem);
    }
}
