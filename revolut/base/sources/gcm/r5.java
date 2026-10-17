package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class r5 extends i1 {
    public static final ecm.a d = new ecm.a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f142855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.k2 f142856c;

    public r5(z0 z0Var, l lVar, ecm.k2 k2Var) {
        super(z0Var);
        this.f142855b = lVar;
        this.f142856c = k2Var;
    }

    @Override // gcm.i1, ecm.v1
    public final void c() {
        super.c();
        l lVar = this.f142855b;
        ecm.k2 k2Var = lVar.f142740b;
        k2Var.d();
        k2Var.execute(new androidx.view.d(lVar, 12));
    }

    @Override // gcm.i1, ecm.v1
    public final void d(ecm.t1 t1Var) {
        super.d(new q5(this, t1Var));
    }
}
