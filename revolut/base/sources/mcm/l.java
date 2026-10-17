package mcm;

import ecm.a1;
import ecm.t0;
import ecm.y0;
import gcm.p4;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f204394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f204395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ecm.r f204396c = ecm.r.CONNECTING;
    public y0 d;
    public final /* synthetic */ c0 e;

    public l(c0 c0Var, m mVar, p4 p4Var, t0 t0Var) {
        this.e = c0Var;
        this.f204394a = mVar;
        this.d = t0Var;
        this.f204395b = p4Var.a(new k(this));
    }

    public final String toString() {
        return "Address = " + this.f204394a + ", state = " + this.f204396c + ", picker type: " + this.d.getClass() + ", lb: " + this.f204395b;
    }
}
