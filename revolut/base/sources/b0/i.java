package b0;

import androidx.camera.camera2.adapter.ZslControlImpl;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class i implements ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11515b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f11514a = i;
        this.f11515b = obj2;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        switch (this.f11514a) {
            case 0:
                ((MetadataImageReader) this.f11515b).lambda$new$0(imageReaderProxy);
                break;
            default:
                ZslControlImpl.addZslConfig$lambda$5((ZslControlImpl) this.f11515b, imageReaderProxy);
                break;
        }
    }
}
