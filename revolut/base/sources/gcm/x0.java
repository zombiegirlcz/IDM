package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f142936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f142937c;

    public /* synthetic */ x0(Object obj2, boolean z, int i) {
        this.f142935a = i;
        this.f142937c = obj2;
        this.f142936b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142935a) {
            case 0:
                ch.p pVar = (ch.p) this.f142937c;
                if (this.f142936b) {
                    z0 z0Var = (z0) pVar.f24049c;
                    z0Var.f143000l = true;
                    if (z0Var.i > 0) {
                        z0Var.k.reset().start();
                    }
                }
                ((z0) pVar.f24049c).f143004q = false;
                break;
            default:
                fcm.a aVar = (fcm.a) this.f142937c;
                y8.l.a();
                ch.m mVar = (ch.m) aVar.f133838b;
                boolean z = mVar.f24041a;
                boolean z3 = this.f142936b;
                mVar.f24041a = z3;
                if (z != z3) {
                    ((r8.p) mVar.f24042b).a(z3);
                }
                break;
        }
    }
}
