package androidx.camera.viewfinder;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6968c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f6966a = i;
        this.f6967b = obj2;
        this.f6968c = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f6966a) {
            case 0:
                return ViewfinderSurfaceRequest.lambda$new$0((AtomicReference) this.f6967b, (String) this.f6968c, completer);
            case 1:
                return ViewfinderSurfaceRequest.lambda$new$1((AtomicReference) this.f6967b, (String) this.f6968c, completer);
            case 2:
                return ViewfinderSurfaceRequest.lambda$new$2((AtomicReference) this.f6967b, (String) this.f6968c, completer);
            default:
                return ((TextureViewImplementation) this.f6967b).lambda$tryToProvideViewfinderSurface$1((Surface) this.f6968c, completer);
        }
    }
}
