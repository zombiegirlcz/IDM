package qr0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f248593b;

    public /* synthetic */ h(l lVar, int i) {
        this.f248592a = i;
        this.f248593b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f248592a) {
            case 0:
                this.f248593b.a();
                break;
            case 1:
                this.f248593b.a();
                break;
            default:
                this.f248593b.a();
                break;
        }
    }
}
