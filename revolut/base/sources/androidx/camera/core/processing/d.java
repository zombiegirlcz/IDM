package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6880b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f6879a = i;
        this.f6880b = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f6879a) {
            case 0:
                return ((SurfaceEdge.SettableSurface) this.f6880b).lambda$new$0(completer);
            default:
                return ((SurfaceOutputImpl) this.f6880b).lambda$new$0(completer);
        }
    }
}
