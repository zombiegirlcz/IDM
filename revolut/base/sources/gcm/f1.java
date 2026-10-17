package gcm;

import com.google.common.base.MoreObjects;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f1 implements c0 {
    @Override // gcm.c0
    public final void a(a31.a aVar) {
        ((z1) this).f143006a.a(aVar);
    }

    @Override // gcm.c0
    public final void b(ecm.m1 m1Var) {
        ((z1) this).f143006a.b(m1Var);
    }

    @Override // gcm.c0
    public final void d() {
        ((z1) this).f143006a.d();
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", ((z1) this).f143006a).toString();
    }
}
