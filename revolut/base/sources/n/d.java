package n;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SafeCloseImageReaderProxy f210825b;

    public /* synthetic */ d(SafeCloseImageReaderProxy safeCloseImageReaderProxy, int i) {
        this.f210824a = i;
        this.f210825b = safeCloseImageReaderProxy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f210824a) {
            case 0:
                this.f210825b.safeClose();
                break;
            default:
                this.f210825b.safeClose();
                break;
        }
    }
}
