package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245376c;
    public final boolean d;

    public b0(efm.i iVar, Object obj2, boolean z) {
        super(iVar);
        this.f245376c = obj2;
        this.d = z;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        this.f245362b.n(new a0(aVar, this.f245376c, this.d));
    }
}
