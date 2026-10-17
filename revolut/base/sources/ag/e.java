package ag;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final HashMap d = new HashMap();
    public static final l.a e = new l.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f4683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f4684c = null;

    public e(Executor executor, v vVar) {
        this.f4682a = executor;
        this.f4683b = vVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a31.a aVar = new a31.a(1);
        Executor executor = e;
        task.addOnSuccessListener(executor, aVar);
        task.addOnFailureListener(executor, aVar);
        task.addOnCanceledListener(executor, aVar);
        if (!((CountDownLatch) aVar.f955b).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.f4684c;
            if (task == null || (task.isComplete() && !this.f4684c.isSuccessful())) {
                this.f4684c = Tasks.call(this.f4682a, new af.d(this.f4683b, 1));
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f4684c;
    }

    public final g c() {
        synchronized (this) {
            try {
                Task task = this.f4684c;
                if (task != null && task.isSuccessful()) {
                    return (g) this.f4684c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (g) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    return null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
