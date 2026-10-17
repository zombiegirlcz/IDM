package cpi;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements yk0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f107957b;

    public /* synthetic */ h(m mVar, int i) {
        this.f107956a = i;
        this.f107957b = mVar;
    }

    @Override // yk0.c
    public final Object get() {
        switch (this.f107956a) {
            case 0:
                phm.a aVar = (phm.a) j6.a.i(this.f107957b.f107964a, h51.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return ((h51.a) aVar2.b()).a();
                }
                throw new IllegalStateException(a0.d.q("Api ", h51.a.class, " is not found"));
            case 1:
                phm.a aVar3 = (phm.a) j6.a.i(this.f107957b.f107964a, opa.c.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return ((opa.c) aVar4.b()).a();
                }
                throw new IllegalStateException(a0.d.q("Api ", opa.c.class, " is not found"));
            default:
                return this.f107957b.a().b();
        }
    }
}
