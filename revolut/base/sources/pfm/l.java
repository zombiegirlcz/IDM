package pfm;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.b f235742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235743c;

    public /* synthetic */ l(efm.b bVar, Object obj2, int i) {
        this.f235741a = i;
        this.f235742b = bVar;
        this.f235743c = obj2;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        switch (this.f235741a) {
            case 0:
                this.f235742b.d(new k(dVar, (kfm.a) this.f235743c, 0));
                break;
            default:
                ((r) this.f235742b).d(new kge.d(this, dVar));
                break;
        }
    }
}
