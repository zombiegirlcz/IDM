package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class v1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.g f270881h;
    public final kfm.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kfm.a f270882j;
    public final kfm.a k;

    public v1(efm.r rVar, kfm.g gVar, kfm.g gVar2, kfm.a aVar, kfm.a aVar2) {
        super(rVar);
        this.f270881h = gVar;
        this.i = gVar2;
        this.f270882j = aVar;
        this.k = aVar2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new u1(yVar, this.f270881h, this.i, this.f270882j, this.k));
    }
}
