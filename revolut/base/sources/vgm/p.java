package vgm;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.d;
        this.f289218c = Thread.currentThread();
        try {
            try {
                this.f289216a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.f289218c = null;
            }
        } catch (Throwable th10) {
            jb3.l.v(th10);
            throw th10;
        }
    }
}
