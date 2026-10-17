package u01;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f276029b;

    public /* synthetic */ u(v vVar, int i) {
        this.f276028a = i;
        this.f276029b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f276028a) {
            case 0:
                this.f276029b.f276031b.invoke();
                break;
            default:
                this.f276029b.f276035j.invoke();
                break;
        }
    }
}
