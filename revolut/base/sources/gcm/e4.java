package gcm;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public final class e4 implements ecm.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ecm.s f142627a = ecm.s.a(ecm.r.IDLE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i4 f142628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j4 f142629c;

    public e4(j4 j4Var) {
        this.f142629c = j4Var;
    }

    @Override // ecm.z0
    public final void a(ecm.s sVar) {
        j4 j4Var = this.f142629c;
        j4.o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{sVar, this.f142628b.f142681a});
        this.f142627a = sVar;
        try {
            i4 i4Var = (i4) j4Var.f142695g.get(j4Var.f142696h.a());
            if (i4Var == null || i4Var.f142683c != this) {
                return;
            }
            j4Var.j(this.f142628b);
        } catch (IllegalStateException unused) {
            j4.o.fine("Health listener received state change after subchannel was removed");
        }
    }
}
