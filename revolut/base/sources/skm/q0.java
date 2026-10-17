package skm;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes14.dex */
public final class q0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f264004a;

    public q0(ScheduledFuture scheduledFuture) {
        this.f264004a = scheduledFuture;
    }

    @Override // skm.r0
    public final void dispose() {
        this.f264004a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f264004a + ']';
    }
}
