package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class w3 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final efm.c0 f270919h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270920j;

    public w3(efm.r rVar, efm.c0 c0Var, boolean z, int i) {
        super(rVar);
        this.f270919h = c0Var;
        this.i = z;
        this.f270920j = i;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.c0 c0Var = this.f270919h;
        boolean z = c0Var instanceof wfm.a0;
        efm.w wVar = this.f270328g;
        if (z) {
            wVar.subscribe(yVar);
        } else {
            wVar.subscribe(new v3(yVar, c0Var.b(), this.i, this.f270920j));
        }
    }
}
