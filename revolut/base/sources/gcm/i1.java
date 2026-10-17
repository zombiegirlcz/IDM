package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i1 extends ecm.v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.v1 f142678a;

    public i1(ecm.v1 v1Var) {
        Preconditions.checkNotNull(v1Var, "delegate can not be null");
        this.f142678a = v1Var;
    }

    @Override // ecm.v1
    public String a() {
        return this.f142678a.a();
    }

    @Override // ecm.v1
    public final void b() {
        this.f142678a.b();
    }

    @Override // ecm.v1
    public void c() {
        this.f142678a.c();
    }

    @Override // ecm.v1
    public void d(ecm.t1 t1Var) {
        this.f142678a.d(t1Var);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", this.f142678a).toString();
    }
}
