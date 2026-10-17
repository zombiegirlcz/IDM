package gcm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class c1 extends b4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f142595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.g2 f142596c;
    public final b0 d;
    public final ecm.n[] e;

    public c1(ecm.g2 g2Var, b0 b0Var, ecm.n[] nVarArr) {
        Preconditions.checkArgument(!g2Var.e(), "error must not be OK");
        this.f142596c = g2Var;
        this.d = b0Var;
        this.e = nVarArr;
    }

    @Override // gcm.b4, gcm.a0
    public final void d(e4m.f fVar) {
        fVar.b(this.f142596c, "error");
        fVar.b(this.d, "progress");
    }

    @Override // gcm.b4, gcm.a0
    public final void h(c0 c0Var) {
        Preconditions.checkState(!this.f142595b, "already started");
        this.f142595b = true;
        ecm.n[] nVarArr = this.e;
        int length = nVarArr.length;
        int i = 0;
        while (true) {
            ecm.g2 g2Var = this.f142596c;
            if (i >= length) {
                c0Var.c(g2Var, this.d, new ecm.m1());
                return;
            } else {
                nVarArr[i].p(g2Var);
                i++;
            }
        }
    }
}
