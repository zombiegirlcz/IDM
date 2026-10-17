package fag;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p0 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f133360b;

    public /* synthetic */ p0(t0 t0Var, int i) {
        this.f133359a = i;
        this.f133360b = t0Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f133359a) {
            case 0:
                this.f133360b.O.onNext(dfi.a.ADDED);
                break;
            case 1:
                this.f133360b.O.onNext(dfi.a.REMOVED);
                break;
            case 2:
                this.f133360b.c(pei.a.CANCELLED);
                break;
            default:
                this.f133360b.f133375b.remove("CACHE_KEY_DROPOFFS");
                break;
        }
    }
}
