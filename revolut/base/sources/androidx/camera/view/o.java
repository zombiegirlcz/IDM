package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewViewImplementation;
import androidx.camera.view.SurfaceViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class o implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6954b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f6953a = i;
        this.f6954b = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f6953a) {
            case 0:
                SurfaceViewImplementation.SurfaceRequestCallback.lambda$tryToComplete$0((PreviewViewImplementation.OnSurfaceNotInUseListener) this.f6954b, (SurfaceRequest.Result) obj2);
                break;
            default:
                ((CallbackToFutureAdapter.Completer) this.f6954b).set((SurfaceRequest.Result) obj2);
                break;
        }
    }
}
