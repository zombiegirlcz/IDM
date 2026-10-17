package gcm;

import com.google.common.base.MoreObjects;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e1 implements a0 {
    @Override // gcm.a0
    public final void a(int i) {
        ((a2) this).f142556a.a(i);
    }

    @Override // gcm.f6
    public final void b(ecm.o oVar) {
        ((a2) this).f142556a.b(oVar);
    }

    @Override // gcm.f6
    public final void c(kcm.a aVar) {
        ((a2) this).f142556a.c(aVar);
    }

    @Override // gcm.a0
    public final void d(e4m.f fVar) {
        ((a2) this).f142556a.d(fVar);
    }

    @Override // gcm.a0
    public final void e(int i) {
        ((a2) this).f142556a.e(i);
    }

    @Override // gcm.f6
    public final void f() {
        ((a2) this).f142556a.f();
    }

    @Override // gcm.f6
    public final void flush() {
        ((a2) this).f142556a.flush();
    }

    @Override // gcm.a0
    public final void g() {
        ((a2) this).f142556a.g();
    }

    @Override // gcm.a0
    public final void i(ecm.w wVar) {
        ((a2) this).f142556a.i(wVar);
    }

    @Override // gcm.f6
    public final boolean isReady() {
        return ((a2) this).f142556a.isReady();
    }

    @Override // gcm.a0
    public final void j(ecm.y yVar) {
        ((a2) this).f142556a.j(yVar);
    }

    @Override // gcm.a0
    public final void k(ecm.g2 g2Var) {
        ((a2) this).f142556a.k(g2Var);
    }

    @Override // gcm.f6
    public final void request() {
        ((a2) this).f142556a.request();
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", ((a2) this).f142556a).toString();
    }
}
