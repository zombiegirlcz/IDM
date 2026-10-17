package d0;

import androidx.camera.core.imagecapture.TakePictureManagerImpl;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TakePictureManagerImpl f110273b;

    public /* synthetic */ b(TakePictureManagerImpl takePictureManagerImpl, int i) {
        this.f110272a = i;
        this.f110273b = takePictureManagerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f110272a) {
            case 0:
                this.f110273b.issueNextRequest();
                break;
            default:
                this.f110273b.lambda$trackCurrentRequests$0();
                break;
        }
    }
}
