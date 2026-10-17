package s0;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.VideoOutput;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements VideoOutput {
    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        surfaceRequest.willNotProvideSurface();
    }
}
