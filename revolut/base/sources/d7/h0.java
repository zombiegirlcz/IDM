package d7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f111671a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f111671a.d((g0) get());
            } catch (InterruptedException | ExecutionException e) {
                this.f111671a.d(new g0(e));
            }
        } finally {
            this.f111671a = null;
        }
    }
}
