package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.x0 f142681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ecm.r f142682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f142683c;
    public boolean d = false;

    public i4(ecm.x0 x0Var, ecm.r rVar, e4 e4Var) {
        this.f142681a = x0Var;
        this.f142682b = rVar;
        this.f142683c = e4Var;
    }

    public static void a(i4 i4Var, ecm.r rVar) {
        i4Var.f142682b = rVar;
        if (rVar == ecm.r.READY || rVar == ecm.r.TRANSIENT_FAILURE) {
            i4Var.d = true;
        } else if (rVar == ecm.r.IDLE) {
            i4Var.d = false;
        }
    }
}
