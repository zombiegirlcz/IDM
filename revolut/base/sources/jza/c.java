package jza;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f179698c;

    public /* synthetic */ c(e4m.e eVar, int i) {
        this.f179697b = i;
        this.f179698c = eVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f179697b) {
            case 0:
                f fVar = (f) this.f179698c.get();
                fVar.getClass();
                return new a(fVar);
            case 1:
                h9h.a aVar = (h9h.a) this.f179698c.get();
                aVar.getClass();
                return new l9h.a(aVar);
            case 2:
                nm2.e eVar = (nm2.e) this.f179698c.get();
                eVar.getClass();
                return new nm2.d(eVar);
            default:
                yxj.e eVar2 = (yxj.e) this.f179698c.get();
                eVar2.getClass();
                return new yxj.a(eVar2);
        }
    }
}
