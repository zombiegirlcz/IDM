package ie;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160577a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f160578b;

    public w(Runnable runnable) {
        this.f160578b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.f160577a) {
            case 0:
                ((Runnable) this.f160578b).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) this.f160578b;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        }
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }

    public w(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f160578b = executorService;
    }
}
