package sfm;

/* JADX INFO: loaded from: classes13.dex */
public final class m extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f262543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262545c;

    public m(efm.r rVar, kfm.o oVar, boolean z) {
        this.f262543a = rVar;
        this.f262544b = oVar;
        this.f262545c = z;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        efm.r rVar = this.f262543a;
        kfm.o oVar = this.f262544b;
        if (kli.a.E(rVar, oVar, dVar)) {
            return;
        }
        rVar.subscribe(new l(dVar, oVar, this.f262545c));
    }
}
