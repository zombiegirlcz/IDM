package je;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ie.l;
import j6k.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f173164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f173165b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f173166c = Tasks.forResult(null);

    public b(ExecutorService executorService) {
        this.f173164a = executorService;
    }

    public final ExecutorService a() {
        return this.f173164a;
    }

    public final Task b(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f173165b) {
            taskContinueWithTask = this.f173166c.continueWithTask(this.f173164a, new g(runnable, 28));
            this.f173166c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task c(l lVar) {
        Task taskContinueWithTask;
        synchronized (this.f173165b) {
            taskContinueWithTask = this.f173166c.continueWithTask(this.f173164a, new g(lVar, 27));
            this.f173166c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f173164a.execute(runnable);
    }
}
