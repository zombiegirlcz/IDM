package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f270883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w2 f270884h;

    public v2(Object obj2, w2 w2Var) {
        this.f270883g = obj2;
        this.f270884h = w2Var;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270884h.subscribe(yVar);
    }
}
