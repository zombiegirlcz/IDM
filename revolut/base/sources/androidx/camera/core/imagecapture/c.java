package androidx.camera.core.imagecapture;

import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.CaptureNode;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6853b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f6852a = i;
        this.f6853b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6852a) {
            case 0:
                ((SafeCloseImageReaderProxy) this.f6853b).safeClose();
                break;
            case 1:
                CaptureNode.lambda$releaseInputResources$4((SafeCloseImageReaderProxy) this.f6853b);
                break;
            case 2:
                CaptureNode.lambda$releaseInputResources$5((SafeCloseImageReaderProxy) this.f6853b);
                break;
            default:
                ((CaptureNode.AnonymousClass1) this.f6853b).lambda$onCaptureStarted$0();
                break;
        }
    }
}
