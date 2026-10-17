package dw;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class g implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118177a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f118178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Surface f118179c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(SurfaceTexture surfaceTexture, SurfaceRequest surfaceRequest, Surface surface) {
        this.f118178b = surfaceTexture;
        this.d = surfaceRequest;
        this.f118179c = surface;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f118177a) {
            case 0:
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.d;
                SurfaceTexture surfaceTexture = this.f118178b;
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceRequest.clearTransformationInfoListener();
                surfaceTexture.release();
                this.f118179c.release();
                break;
            default:
                ((DualSurfaceProcessor) this.d).lambda$onInputSurface$0(this.f118178b, this.f118179c, (SurfaceRequest.Result) obj2);
                break;
        }
    }

    public /* synthetic */ g(DualSurfaceProcessor dualSurfaceProcessor, SurfaceTexture surfaceTexture, Surface surface) {
        this.d = dualSurfaceProcessor;
        this.f118178b = surfaceTexture;
        this.f118179c = surface;
    }
}
