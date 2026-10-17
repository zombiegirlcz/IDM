package zo0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f323843b;

    public /* synthetic */ a(d dVar, int i) {
        this.f323842a = i;
        this.f323843b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f323842a) {
            case 0:
                this.f323843b.c();
                break;
            default:
                d dVar = this.f323843b;
                dVar.o.setVisibility(4);
                dVar.k = false;
                break;
        }
    }
}
