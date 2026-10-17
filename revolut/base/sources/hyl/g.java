package hyl;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f156912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f156913c;

    public /* synthetic */ g(h hVar, String str, int i) {
        this.f156911a = i;
        this.f156912b = hVar;
        this.f156913c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f156911a) {
            case 0:
                this.f156912b.f156916c.invoke(this.f156913c);
                break;
            default:
                this.f156912b.d.invoke(this.f156913c);
                break;
        }
    }
}
