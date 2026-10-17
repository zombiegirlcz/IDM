package elm;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import zkm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends kotlinx.coroutines.c implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f127540b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CoroutineDispatcher f127541c;

    static {
        n nVar = n.f127551b;
        int i = v.f323125a;
        if (64 >= i) {
            i = 64;
        }
        f127541c = CoroutineDispatcher.limitedParallelism$default(nVar, zkm.g.g(i, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        f127541c.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        f127541c.dispatchYield(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(kotlin.coroutines.g.f186406a, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        return n.f127551b.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.c
    public final Executor m() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
