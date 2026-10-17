package ufm;

import efm.d0;
import efm.f0;
import pfm.s;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f279882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.g f279883c;

    public /* synthetic */ f(d0 d0Var, kfm.g gVar, int i) {
        this.f279881a = i;
        this.f279882b = d0Var;
        this.f279883c = gVar;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        switch (this.f279881a) {
            case 0:
                this.f279882b.q(new s(f0Var, this.f279883c, 4));
                break;
            case 1:
                this.f279882b.q(new g(this, f0Var, 0));
                break;
            case 2:
                this.f279882b.q(new r8.q(f0Var, this.f279883c));
                break;
            default:
                this.f279882b.q(new u0a.a(this, f0Var, 1));
                break;
        }
    }
}
