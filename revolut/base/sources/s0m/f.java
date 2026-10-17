package s0m;

import com.fourthline.vision.internal.sh;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import z0m.j;

/* JADX INFO: loaded from: classes23.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ScheduledExecutorService f259027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f259028b = d.k;

    public static final void a(boolean z, String str, Runnable runnable) {
        e eVar = new e(z, str);
        ExecutorService executorServiceC = c();
        if (executorServiceC != null) {
            try {
                executorServiceC.execute(new sh(runnable, eVar, 2));
            } catch (Exception e) {
                eVar.a(e);
            }
        }
    }

    public static final Future b(Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        try {
            ExecutorService executorServiceC = c();
            if (executorServiceC != null) {
                return executorServiceC.submit(callable);
            }
            return null;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to submit task";
            }
            j.b("Executor", message, new Object[0]);
            return null;
        }
    }

    public static final synchronized ExecutorService c() {
        if (f259027a == null) {
            try {
                f259027a = Executors.newScheduledThreadPool(f259028b);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Failed to create thread pool";
                }
                j.b("Executor", message, new Object[0]);
            }
        }
        return f259027a;
    }
}
