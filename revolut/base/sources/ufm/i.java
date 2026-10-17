package ufm;

import efm.d0;
import efm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f279891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f279892c;

    public /* synthetic */ i(d0 d0Var, kfm.o oVar, int i) {
        this.f279890a = i;
        this.f279892c = oVar;
        this.f279891b = d0Var;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        switch (this.f279890a) {
            case 0:
                this.f279891b.q(new h(0, f0Var, this.f279892c));
                break;
            case 1:
                this.f279891b.q(new g(f0Var, this.f279892c));
                break;
            default:
                this.f279891b.q(new h(1, f0Var, this.f279892c));
                break;
        }
    }
}
