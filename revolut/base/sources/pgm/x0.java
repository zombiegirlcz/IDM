package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class x0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f236177c;
    public final boolean d;
    public final kgm.b e;
    public final he2.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ogm.q qVar, int i) {
        super(qVar);
        kgm.b bVar = kgm.j.f184027c;
        he2.b bVar2 = kgm.j.d;
        this.f236177c = i;
        this.d = true;
        this.e = bVar;
        this.f = bVar2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        this.f236000b.j(new w0(aVar, this.f236177c, this.d, this.e, this.f));
    }
}
