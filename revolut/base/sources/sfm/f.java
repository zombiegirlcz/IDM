package sfm;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f262516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfm.f f262518c;
    public final int d;

    public f(efm.r rVar, kfm.o oVar, zfm.f fVar, int i) {
        this.f262516a = rVar;
        this.f262517b = oVar;
        this.f262518c = fVar;
        this.d = i;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        efm.r rVar = this.f262516a;
        kfm.o oVar = this.f262517b;
        if (kli.a.E(rVar, oVar, dVar)) {
            return;
        }
        rVar.subscribe(new e(dVar, oVar, this.f262518c, this.d));
    }
}
