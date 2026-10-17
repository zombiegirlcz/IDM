package gcm;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class q2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f142834b = Logger.getLogger(q2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f142835a;

    public q2(Runnable runnable) {
        this.f142835a = (Runnable) Preconditions.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f142835a;
        try {
            runnable.run();
        } catch (Throwable th10) {
            f142834b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th10);
            Throwables.throwIfUnchecked(th10);
            throw new AssertionError(th10);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f142835a + ")";
    }
}
