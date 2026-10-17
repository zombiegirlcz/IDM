package androidx.camera.viewfinder;

import androidx.camera.viewfinder.SurfaceViewImplementation;
import androidx.camera.viewfinder.ViewfinderSurfaceRequest;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Consumer {
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        SurfaceViewImplementation.SurfaceRequestCallback.lambda$tryToComplete$0((ViewfinderSurfaceRequest.Result) obj2);
    }
}
