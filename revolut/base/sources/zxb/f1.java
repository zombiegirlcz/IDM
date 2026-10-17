package zxb;

/* JADX INFO: loaded from: classes6.dex */
public final class f1 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f326147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f326148c;

    public /* synthetic */ f1(a31.a aVar, int i) {
        this.f326147b = i;
        this.f326148c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f326147b) {
            case 0:
                k0 k0Var = (k0) ((phm.a) this.f326148c.f955b).get();
                k0Var.getClass();
                return new n0(k0Var);
            default:
                k0 k0Var2 = (k0) ((phm.a) this.f326148c.f955b).get();
                k0Var2.getClass();
                return new t0(k0Var2);
        }
    }
}
