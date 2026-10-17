package gcm;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f142779c = 0;
    public final ecm.h d;
    public final ecm.g2 e;

    public n0(p0 p0Var, ecm.h hVar, ecm.g2 g2Var) {
        super(p0Var.f142805c, 0);
        this.d = hVar;
        this.e = g2Var;
    }

    @Override // gcm.j0
    public final void b() {
        switch (this.f142779c) {
            case 0:
                this.d.a(this.e, new ecm.m1());
                break;
            default:
                this.d.a(this.e, new ecm.m1());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(y2 y2Var, ecm.h hVar, ecm.g2 g2Var) {
        super(y2Var.e, 0);
        this.d = hVar;
        this.e = g2Var;
    }
}
