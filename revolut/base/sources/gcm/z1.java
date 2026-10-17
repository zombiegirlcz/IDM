package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class z1 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f143006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f143007b;

    public z1(a2 a2Var, c0 c0Var) {
        this.f143007b = a2Var;
        this.f143006a = c0Var;
    }

    @Override // gcm.c0
    public final void c(ecm.g2 g2Var, b0 b0Var, ecm.m1 m1Var) {
        com.google.firebase.messaging.t tVar = this.f143007b.f142557b.f142587b;
        if (g2Var.e()) {
            ((r2) tVar.d).e();
        } else {
            ((r2) tVar.e).e();
        }
        this.f143006a.c(g2Var, b0Var, m1Var);
    }
}
