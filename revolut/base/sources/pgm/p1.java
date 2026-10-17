package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dom.b f236127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f236128c;

    public /* synthetic */ p1(dom.b bVar, long j2, int i) {
        this.f236126a = i;
        this.f236127b = bVar;
        this.f236128c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f236126a) {
            case 0:
                this.f236127b.a(this.f236128c);
                break;
            default:
                this.f236127b.a(this.f236128c);
                break;
        }
    }
}
