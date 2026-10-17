package ufm;

import efm.c0;
import efm.d0;
import efm.f0;
import rfm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f279899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f279900c;

    public /* synthetic */ n(d0 d0Var, c0 c0Var, int i) {
        this.f279898a = i;
        this.f279899b = d0Var;
        this.f279900c = c0Var;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        switch (this.f279898a) {
            case 0:
                this.f279899b.q(new v(f0Var, this.f279900c, 1));
                break;
            default:
                pfm.q qVar = new pfm.q(f0Var, this.f279899b);
                f0Var.onSubscribe(qVar);
                ifm.c cVarC = this.f279900c.c(qVar);
                lfm.b bVar = (lfm.b) qVar.f235755c;
                bVar.getClass();
                lfm.d.c(bVar, cVarC);
                break;
        }
    }
}
