package elm;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes13.dex */
public abstract class j extends kotlinx.coroutines.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f127544b;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        e.g(this.f127544b, runnable, 6);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        e.g(this.f127544b, runnable, 2);
    }

    @Override // kotlinx.coroutines.c
    public final Executor m() {
        return this.f127544b;
    }
}
