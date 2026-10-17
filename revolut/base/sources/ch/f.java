package ch;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f24018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f24019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f24020c;

    public f() {
        this.f24019b = new AtomicInteger(0);
        this.f24020c = new AtomicBoolean(false);
        this.f24018a = new m();
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        Preconditions.checkState(this.f24019b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f24018a.e(new Executor() { // from class: ch.t
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: ch.u
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                f fVar = this.f24090a;
                AtomicBoolean atomicBoolean = fVar.f24020c;
                CancellationToken cancellationToken2 = cancellationToken;
                boolean zIsCancellationRequested = cancellationToken2.isCancellationRequested();
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                try {
                    if (zIsCancellationRequested) {
                        cancellationTokenSource2.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            fVar.b();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                            return;
                        }
                        Object objCall = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(objCall);
                        }
                    } catch (RuntimeException e) {
                        throw new MlKitException(13, e, "Internal error has occurred when executing ML Kit tasks");
                    }
                } catch (Exception e2) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e2);
                    }
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public abstract Object d(InputImage inputImage);

    public f(m mVar) {
        this.f24019b = new AtomicInteger(0);
        this.f24020c = new AtomicBoolean(false);
        this.f24018a = mVar;
    }
}
