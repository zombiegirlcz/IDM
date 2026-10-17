package pfm;

import efm.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.b f235757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f235758c;

    public /* synthetic */ r(efm.b bVar, c0 c0Var, int i) {
        this.f235756a = i;
        this.f235757b = bVar;
        this.f235758c = c0Var;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        switch (this.f235756a) {
            case 0:
                this.f235757b.d(new q(dVar, this.f235758c));
                break;
            default:
                q qVar = new q(dVar, this.f235757b);
                dVar.onSubscribe(qVar);
                ifm.c cVarC = this.f235758c.c(qVar);
                lfm.b bVar = (lfm.b) qVar.f235755c;
                bVar.getClass();
                lfm.d.c(bVar, cVarC);
                break;
        }
    }
}
