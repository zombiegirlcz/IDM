package b1;

import androidx.camera.viewfinder.internal.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f11695b;

    public /* synthetic */ a(int i, ListenableFuture listenableFuture) {
        this.f11694a = i;
        this.f11695b = listenableFuture;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f11694a) {
            case 0:
                return Futures.lambda$nonCancellationPropagating$0(this.f11695b, completer);
            default:
                return androidx.camera.core.impl.utils.futures.Futures.lambda$nonCancellationPropagating$0(this.f11695b, completer);
        }
    }
}
