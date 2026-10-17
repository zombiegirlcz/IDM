package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class l7 extends bgm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7 f270621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.m f270622c;
    public boolean d;

    public l7(m7 m7Var, ihm.m mVar) {
        this.f270621b = m7Var;
        this.f270622c = mVar;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        m7 m7Var = this.f270621b;
        m7Var.f270658j.b(this);
        m7Var.f224947c.offer(new n7(this.f270622c, null));
        if (m7Var.f()) {
            m7Var.j0();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
            return;
        }
        this.d = true;
        m7 m7Var = this.f270621b;
        m7Var.k.dispose();
        m7Var.f270658j.dispose();
        m7Var.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        dispose();
        onComplete();
    }
}
