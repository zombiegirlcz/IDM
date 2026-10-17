package androidx.media3.ui;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerControlViewLayoutManager f7656b;

    public /* synthetic */ d(PlayerControlViewLayoutManager playerControlViewLayoutManager, int i) {
        this.f7655a = i;
        this.f7656b = playerControlViewLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7655a) {
            case 0:
                this.f7656b.showAllBars();
                break;
            case 1:
                this.f7656b.updateLayoutForSizeChange();
                break;
            case 2:
                this.f7656b.onLayoutWidthChanged();
                break;
            case 3:
                this.f7656b.hideAllBars();
                break;
            case 4:
                this.f7656b.hideProgressBar();
                break;
            case 5:
                this.f7656b.hideMainBar();
                break;
            default:
                this.f7656b.hideController();
                break;
        }
    }
}
