package s;

import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f258709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f258710c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, int i) {
        this.f258708a = 0;
        this.f258710c = cameraCaptureCallback;
        this.d = cameraCallbackMap;
        this.e = requestMetadata;
        this.f258709b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f258708a) {
            case 0:
                CameraCallbackMap.onCaptureProgress$lambda$1((CameraCaptureCallback) this.f258710c, (CameraCallbackMap) this.d, (RequestMetadata) this.e, this.f258709b);
                break;
            case 1:
                ((EncoderImpl) this.f258710c).lambda$handleEncodeError$10(this.f258709b, (String) this.d, (Throwable) this.e);
                break;
            default:
                EncoderImpl.lambda$notifyError$11((EncoderCallback) this.f258710c, this.f258709b, (String) this.d, (Throwable) this.e);
                break;
        }
    }

    public /* synthetic */ c(Object obj2, int i, String str, Throwable th10, int i2) {
        this.f258708a = i2;
        this.f258710c = obj2;
        this.f258709b = i;
        this.d = str;
        this.e = th10;
    }
}
