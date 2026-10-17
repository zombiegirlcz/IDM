package ch;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f24021b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f24022c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f24023a;

    public g(Looper looper) {
        this.f24023a = new zza(looper);
    }

    public static g a() {
        g gVar;
        synchronized (f24021b) {
            try {
                if (f24022c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f24022c = new g(handlerThread.getLooper());
                }
                gVar = f24022c;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        q.f24050zza.execute(new p(callable, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }
}
