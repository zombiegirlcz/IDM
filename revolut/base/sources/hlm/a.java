package hlm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    boolean isLocked();

    Object lock(Object obj2, Continuation continuation);

    boolean tryLock(Object obj2);

    void unlock(Object obj2);
}
