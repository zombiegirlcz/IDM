package gcm;

import io.grpc.StatusException;

/* JADX INFO: loaded from: classes22.dex */
public final class u1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142893a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f142894b;

    public u1(m2 m2Var, long j2) {
        this.f142894b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142893a) {
            case 0:
                this.f142894b.getClass();
                break;
            default:
                this.f142894b.f142767a.f142780a.q(ecm.g2.f124807m.g("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public u1(m2 m2Var, StatusException statusException) {
        this.f142894b = m2Var;
    }
}
