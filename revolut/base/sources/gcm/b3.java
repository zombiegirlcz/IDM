package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class b3 extends ecm.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.firebase.messaging.t f142588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k3 f142589b;

    public b3(k3 k3Var) {
        this.f142589b = k3Var;
    }

    @Override // ecm.u0
    public final ecm.x0 a(ecm.r0 r0Var) {
        k3 k3Var = this.f142589b;
        k3Var.f142719n.d();
        Preconditions.checkState(!k3Var.H, "Channel is being terminated");
        return new j3(k3Var, r0Var);
    }

    @Override // ecm.u0
    public final ecm.g b() {
        return this.f142589b.N;
    }

    @Override // ecm.u0
    public final ScheduledExecutorService c() {
        return this.f142589b.f142715h;
    }

    @Override // ecm.u0
    public final ecm.k2 d() {
        return this.f142589b.f142719n;
    }

    @Override // ecm.u0
    public final void e() {
        ecm.k2 k2Var = this.f142589b.f142719n;
        k2Var.d();
        k2Var.execute(new ag.q(this, 11));
    }

    @Override // ecm.u0
    public final void f(ecm.r rVar, ecm.y0 y0Var) {
        ecm.k2 k2Var = this.f142589b.f142719n;
        k2Var.d();
        Preconditions.checkNotNull(rVar, "newState");
        Preconditions.checkNotNull(y0Var, "newPicker");
        k2Var.execute(new ecm.h2(this, 3, y0Var, rVar));
    }
}
