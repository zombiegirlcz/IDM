package androidx.camera.view;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6936c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f6934a = i;
        this.f6935b = obj2;
        this.f6936c = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f6934a) {
            case 0:
                return ((PendingValue) this.f6935b).lambda$setValue$0(this.f6936c, completer);
            default:
                return ((TextureViewImplementation) this.f6935b).lambda$tryToProvidePreviewSurface$1((Surface) this.f6936c, completer);
        }
    }
}
