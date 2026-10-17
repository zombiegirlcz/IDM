package gcm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes22.dex */
public final class d1 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f142610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f142611c;

    public d1(ecm.g2 g2Var, b0 b0Var) {
        Preconditions.checkArgument(!g2Var.e(), "error must not be OK");
        this.f142610b = g2Var;
        this.f142611c = b0Var;
    }

    @Override // ecm.m0
    public final ecm.n0 a() {
        switch (this.f142609a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((s3) this.f142611c).a();
        }
    }

    @Override // gcm.d0
    public final a0 d(ecm.p1 p1Var, ecm.m1 m1Var, ecm.d dVar, ecm.n[] nVarArr) {
        int i = this.f142609a;
        Object obj2 = this.f142611c;
        Object obj3 = this.f142610b;
        switch (i) {
            case 0:
                return new c1((ecm.g2) obj3, (b0) obj2, nVarArr);
            default:
                ecm.d dVar2 = ecm.d.f124789h;
                ecm.n nVarA = ((ecm.l) obj3).a(new ecm.m((ecm.d) Preconditions.checkNotNull(dVar, "callOptions cannot be null"), 0, false), m1Var);
                Preconditions.checkState(nVarArr[nVarArr.length - 1] == p1.o, "lb tracer already assigned");
                nVarArr[nVarArr.length - 1] = nVarA;
                return ((s3) obj2).d(p1Var, m1Var, dVar, nVarArr);
        }
    }

    public d1(ecm.l lVar, s3 s3Var) {
        this.f142610b = lVar;
        this.f142611c = s3Var;
    }
}
