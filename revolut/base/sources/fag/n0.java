package fag;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n0 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f133350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f133351c;

    public /* synthetic */ n0(t0 t0Var, String str, int i) {
        this.f133349a = i;
        this.f133350b = t0Var;
        this.f133351c = str;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f133349a) {
            case 0:
                t0 t0Var = this.f133350b;
                t0Var.e(dgi.c.a(t0Var.a(), null, null, null, null, this.f133351c, null, null, true, null, null, null, null, null, 4193151));
                break;
            case 1:
                t0 t0Var2 = this.f133350b;
                t0Var2.e(dgi.c.a(t0Var2.a(), null, null, null, null, null, null, this.f133351c, false, null, null, null, null, null, 4193791));
                break;
            case 2:
                z9h.n.l(String.class, this.f133350b.f133382n, "CACHE_KEY_SEARCH_SESSION_ID", this.f133351c);
                break;
            default:
                t0 t0Var3 = this.f133350b;
                t0Var3.e(dgi.c.a(t0Var3.a(), null, null, null, null, null, this.f133351c, null, true, null, null, null, null, null, 4193023));
                break;
        }
    }
}
