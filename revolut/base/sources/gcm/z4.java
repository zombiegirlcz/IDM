package gcm;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes13.dex */
public final class z4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f143009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5 f143010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Future f143011c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Future e;
    public final /* synthetic */ x2 f;

    public z4(x2 x2Var, Collection collection, m5 m5Var, Future future, boolean z, Future future2) {
        this.f = x2Var;
        this.f143009a = collection;
        this.f143010b = m5Var;
        this.f143011c = future;
        this.d = z;
        this.e = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ecm.g2 g2Var;
        for (m5 m5Var : this.f143009a) {
            if (m5Var != this.f143010b) {
                m5Var.f142773a.k(x2.G);
            }
        }
        Future future = this.f143011c;
        if (future != null) {
            future.cancel(false);
            if (!this.d && this.f.f142951r.decrementAndGet() == Integer.MIN_VALUE) {
                this.f.f142942c.execute(new ag.q(this, 15));
            }
        }
        Future future2 = this.e;
        if (future2 != null) {
            future2.cancel(false);
        }
        x2 x2Var = this.f;
        com.google.firebase.messaging.t tVar = ((k3) x2Var.D.f123511a).F;
        synchronized (tVar.f49543b) {
            try {
                ((HashSet) tVar.f49544c).remove(x2Var);
                if (((HashSet) tVar.f49544c).isEmpty()) {
                    g2Var = (ecm.g2) tVar.d;
                    tVar.f49544c = new HashSet();
                } else {
                    g2Var = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (g2Var != null) {
            ((k3) tVar.e).E.c(g2Var);
        }
    }
}
