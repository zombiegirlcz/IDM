package skm;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes13.dex */
public final class o0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f264000a;

    public o0(CoroutineDispatcher coroutineDispatcher) {
        this.f264000a = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        CoroutineDispatcher coroutineDispatcher = this.f264000a;
        if (zkm.g.e(coroutineDispatcher, gVar)) {
            zkm.g.d(coroutineDispatcher, gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f264000a.toString();
    }
}
