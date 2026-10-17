package wfm;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes13.dex */
public final class t extends a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.f297158c;
        this.f297160b = Thread.currentThread();
        try {
            this.f297159a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f297160b = null;
        }
    }
}
