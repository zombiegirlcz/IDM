package mfm;

import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import wfm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205039a;

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f205039a) {
            case 0:
                break;
            default:
                for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(v.d.keySet())) {
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        v.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.f205039a) {
            case 0:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
