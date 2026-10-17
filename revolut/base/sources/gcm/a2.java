package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class a2 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f142556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f142557b;

    public a2(b2 b2Var, a0 a0Var) {
        this.f142557b = b2Var;
        this.f142556a = a0Var;
    }

    @Override // gcm.a0
    public final void h(c0 c0Var) {
        com.google.firebase.messaging.t tVar = this.f142557b.f142587b;
        ((r2) tVar.f49544c).e();
        ((g6) tVar.f49543b).a();
        this.f142556a.h(new z1(this, c0Var));
    }
}
