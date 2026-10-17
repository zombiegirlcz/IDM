package gcm;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends ecm.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f142665b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f142664a = i;
        this.f142665b = obj2;
    }

    @Override // ecm.y0
    public final ecm.v0 a(q4 q4Var) {
        switch (this.f142664a) {
            case 0:
                return ecm.v0.a((ecm.g2) this.f142665b);
            default:
                ecm.v0 v0VarA = ((ecm.y0) this.f142665b).a(q4Var);
                ecm.x0 x0Var = v0VarA.f124882a;
                if (x0Var == null) {
                    return v0VarA;
                }
                ecm.b bVarC = x0Var.c();
                return ecm.v0.b(x0Var, new mcm.v((mcm.n) bVarC.f124780a.get(mcm.y.o), v0VarA.f124883b));
        }
    }
}
