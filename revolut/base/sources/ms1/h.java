package ms1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f208527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.b f208528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f208529c = e4m.b.b(new a2d.d(27));

    public h(uw1.b bVar, i iVar) {
        this.f208527a = iVar;
        this.f208528b = bVar;
    }

    public final ls1.h a() {
        hs1.c cVarA = this.f208527a.a();
        vc.s.j(cVarA);
        lz1.m mVar = (lz1.m) this.f208528b;
        oz1.c cVar = (oz1.c) mVar.A.get();
        vc.s.j(cVar);
        uw1.c cVarD = mVar.d();
        vc.s.j(cVarD);
        return new ls1.h(cVarA, cVar, cVarD);
    }
}
