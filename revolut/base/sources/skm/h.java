package skm;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends a {
    public final Thread d;
    public final z0 e;

    public h(CoroutineContext coroutineContext, Thread thread, z0 z0Var) {
        super(coroutineContext, true, true);
        this.d = thread;
        this.e = z0Var;
    }

    @Override // skm.r1
    public final void w(Object obj2) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (Intrinsics.f(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
