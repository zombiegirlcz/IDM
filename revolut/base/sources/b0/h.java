package b0;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements ForwardingImageProxy.OnImageCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f11512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f11513c;

    public /* synthetic */ h(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.f11511a = i;
        this.f11512b = imageProxy;
        this.f11513c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.f11511a) {
            case 0:
                ImageProcessingUtil.lambda$convertYUVToRGB$0(this.f11512b, this.f11513c, imageProxy);
                break;
            default:
                ImageProcessingUtil.lambda$rotateYUV$1(this.f11512b, this.f11513c, imageProxy);
                break;
        }
    }
}
