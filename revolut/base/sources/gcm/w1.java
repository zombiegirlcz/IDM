package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class w1 extends c9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f142914c;
    public final /* synthetic */ ecm.m0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(ecm.m0 m0Var, int i) {
        super(2);
        this.f142914c = i;
        this.d = m0Var;
    }

    @Override // c9.c
    public final void f() {
        switch (this.f142914c) {
            case 0:
                g2 g2Var = (g2) this.d;
                ((j3) g2Var.d.f7848c).f142694j.f142710a0.n(g2Var, true);
                break;
            case 1:
                ((k3) this.d).k();
                break;
            default:
                ((hcm.t) this.d).f151314h.e(true);
                break;
        }
    }

    @Override // c9.c
    public final void g() {
        switch (this.f142914c) {
            case 0:
                g2 g2Var = (g2) this.d;
                ((j3) g2Var.d.f7848c).f142694j.f142710a0.n(g2Var, false);
                break;
            case 1:
                k3 k3Var = (k3) this.d;
                if (!k3Var.G.get()) {
                    k3Var.m();
                    break;
                }
                break;
            default:
                ((hcm.t) this.d).f151314h.e(false);
                break;
        }
    }
}
