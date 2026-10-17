package gcm;

import com.google.common.base.MoreObjects;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h1 extends ecm.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f142671a;

    public h1(k3 k3Var) {
        this.f142671a = k3Var;
    }

    @Override // ecm.e
    public final String e() {
        return this.f142671a.u.e();
    }

    @Override // ecm.e
    public final ecm.i f(ecm.p1 p1Var, ecm.d dVar) {
        return this.f142671a.u.f(p1Var, dVar);
    }

    @Override // ecm.d1
    public final void g() {
        this.f142671a.g();
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", this.f142671a).toString();
    }
}
