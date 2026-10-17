package gcm;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class d3 extends ecm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g3 f142614a;

    public d3(g3 g3Var) {
        this.f142614a = g3Var;
    }

    @Override // ecm.e
    public final String e() {
        return this.f142614a.f142660b;
    }

    @Override // ecm.e
    public final ecm.i f(ecm.p1 p1Var, ecm.d dVar) {
        k3 k3Var = this.f142614a.d;
        Logger logger = k3.f142706d0;
        Executor executor = dVar.f124791b;
        if (executor == null) {
            executor = k3Var.i;
        }
        z zVar = new z(p1Var, executor, dVar, k3Var.f142712b0, k3Var.I ? null : this.f142614a.d.f142714g.f142787a.getScheduledExecutorService(), this.f142614a.d.L);
        zVar.f142989n = this.f142614a.d.o;
        return zVar;
    }
}
