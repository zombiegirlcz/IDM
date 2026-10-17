package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6804b;

    public /* synthetic */ b(Toolbar toolbar, int i) {
        this.f6803a = i;
        this.f6804b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6803a) {
            case 0:
                this.f6804b.collapseActionView();
                break;
            default:
                this.f6804b.invalidateMenu();
                break;
        }
    }
}
