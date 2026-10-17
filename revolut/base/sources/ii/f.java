package ii;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f161496b;

    public /* synthetic */ f(k kVar, int i) {
        this.f161495a = i;
        this.f161496b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f161495a) {
            case 0:
                this.f161496b.y();
                break;
            default:
                this.f161496b.w();
                break;
        }
    }
}
