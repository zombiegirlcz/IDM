package vtc;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rkd.g f291985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re9.c f291986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt2.g f291987c;

    public h0(rkd.g gVar, re9.c cVar, yt2.g gVar2, wwc.a aVar) {
        this.f291985a = gVar;
        this.f291986b = cVar;
        this.f291987c = gVar2;
    }

    public final uvl.c a() {
        skd.i iVarC = this.f291985a.c();
        se9.d dVar = (se9.d) ((re9.a) this.f291986b).f253553j.get();
        vc.s.j(dVar);
        st2.e eVar = (st2.e) this.f291987c.o.get();
        vc.s.j(eVar);
        otc.b bVar = otc.b.RETAIL;
        vc.s.k(bVar);
        return new uvl.c(iVarC, dVar, eVar, bVar);
    }
}
