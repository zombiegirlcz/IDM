package n;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import skm.g0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f210820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f210821c;

    public /* synthetic */ b(g0 g0Var, Object obj2, int i) {
        this.f210819a = i;
        this.f210820b = g0Var;
        this.f210821c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f210819a) {
            case 0:
                return CoroutineAdaptersKt.asListenableFuture$lambda$1(this.f210820b, this.f210821c, completer);
            default:
                return CoroutineAdapterKt.asListenableFuture$lambda$0(this.f210820b, this.f210821c, completer);
        }
    }
}
