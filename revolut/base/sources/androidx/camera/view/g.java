package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.viewfinder.core.ZoomGestureDetector;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function, CallbackToFutureAdapter.Resolver, ZoomGestureDetector.OnZoomGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6938a;

    public /* synthetic */ g(Object obj2) {
        this.f6938a = obj2;
    }

    public boolean a(ZoomGestureDetector.ZoomEvent zoomEvent) {
        return ((PreviewView) this.f6938a).lambda$new$1(zoomEvent);
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        return ((PreviewStreamStateObserver) this.f6938a).lambda$startPreviewStreamStateFlow$1((Void) obj2);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((TextureViewImplementation) this.f6938a).lambda$waitForNextFrame$3(completer);
    }
}
