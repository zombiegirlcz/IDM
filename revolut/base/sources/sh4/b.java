package sh4;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f263425b;

    public /* synthetic */ b(f fVar, int i) {
        this.f263424a = i;
        this.f263425b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f263424a) {
            case 0:
                this.f263425b.f263432j.invoke();
                break;
            case 1:
                this.f263425b.i.invoke();
                break;
            default:
                this.f263425b.f263429c.invoke();
                break;
        }
    }
}
