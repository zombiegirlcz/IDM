package u01;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f276026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f276027c;
    public final /* synthetic */ String d;

    public /* synthetic */ t(v vVar, String str, String str2, int i) {
        this.f276025a = i;
        this.f276026b = vVar;
        this.f276027c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f276025a) {
            case 0:
                this.f276026b.f.invoke(this.f276027c, this.d);
                break;
            case 1:
                this.f276026b.e.invoke(this.f276027c, this.d);
                break;
            default:
                this.f276026b.f276033g.invoke(this.f276027c, this.d);
                break;
        }
    }
}
