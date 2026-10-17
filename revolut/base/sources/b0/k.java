package b0;

import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.NoMetadataImageReader;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class k implements ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f11517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageReaderProxy f11518c;

    public /* synthetic */ k(ImageReaderProxy imageReaderProxy, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, int i) {
        this.f11516a = i;
        this.f11518c = imageReaderProxy;
        this.f11517b = onImageAvailableListener;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        switch (this.f11516a) {
            case 0:
                ((SafeCloseImageReaderProxy) this.f11518c).lambda$setOnImageAvailableListener$1(this.f11517b, imageReaderProxy);
                break;
            default:
                ((NoMetadataImageReader) this.f11518c).lambda$setOnImageAvailableListener$0(this.f11517b, imageReaderProxy);
                break;
        }
    }
}
