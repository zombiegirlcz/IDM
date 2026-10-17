package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends efm.k implements nfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.i f245388a;

    public d0(efm.i iVar) {
        this.f245388a = iVar;
    }

    @Override // nfm.b
    public final efm.i b() {
        return new b0(this.f245388a, null, false);
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        this.f245388a.n(new c0(lVar));
    }
}
