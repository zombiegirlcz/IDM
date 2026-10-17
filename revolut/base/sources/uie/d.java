package uie;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f280390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f280391c;

    public d(a31.a aVar, sac.a aVar2) {
        this.f280390b = aVar;
        this.f280391c = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        uq3.b bVar = (uq3.b) ((phm.a) this.f280390b.f955b).get();
        l lVar = (l) this.f280391c.get();
        bVar.getClass();
        lVar.getClass();
        return new j(bVar, lVar);
    }
}
