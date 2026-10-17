package b0;

import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f11522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest.TransformationInfo f11523c;

    public /* synthetic */ n(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo, int i) {
        this.f11521a = i;
        this.f11522b = transformationInfoListener;
        this.f11523c = transformationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11521a) {
            case 0:
                this.f11522b.onTransformationInfoUpdate(this.f11523c);
                break;
            default:
                this.f11522b.onTransformationInfoUpdate(this.f11523c);
                break;
        }
    }
}
