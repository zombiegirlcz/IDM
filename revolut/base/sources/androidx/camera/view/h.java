package androidx.camera.view;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import androidx.camera.view.PreviewViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements CallbackToFutureAdapter.Resolver, SurfaceRequest.TransformationInfoListener, PreviewViewImplementation.OnSurfaceNotInUseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6941c;

    public /* synthetic */ h(PreviewView.AnonymousClass1 anonymousClass1, PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
        this.f6940b = anonymousClass1;
        this.f6939a = previewStreamStateObserver;
        this.f6941c = cameraInternal;
    }

    public void a() {
        ((PreviewView.AnonymousClass1) this.f6940b).lambda$onSurfaceRequested$2((PreviewStreamStateObserver) this.f6939a, (CameraInternal) this.f6941c);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((PreviewStreamStateObserver) this.f6939a).lambda$waitForCaptureResult$2((CameraInfo) this.f6940b, (List) this.f6941c, completer);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((PreviewView.AnonymousClass1) this.f6939a).lambda$onSurfaceRequested$1((CameraInternal) this.f6940b, (SurfaceRequest) this.f6941c, transformationInfo);
    }

    public /* synthetic */ h(Object obj2, Object obj3, Object obj4) {
        this.f6939a = obj2;
        this.f6940b = obj3;
        this.f6941c = obj4;
    }
}
