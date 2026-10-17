package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class b2 extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f142586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.t f142587b;

    public b2(i0 i0Var, com.google.firebase.messaging.t tVar) {
        this.f142586a = i0Var;
        this.f142587b = tVar;
    }

    @Override // gcm.d0
    public final a0 d(ecm.p1 p1Var, ecm.m1 m1Var, ecm.d dVar, ecm.n[] nVarArr) {
        return new a2(this, this.f142586a.d(p1Var, m1Var, dVar, nVarArr));
    }

    @Override // gcm.g1
    public final i0 e() {
        return this.f142586a;
    }
}
