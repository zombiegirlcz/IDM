package zc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public abstract class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f320998a;

    public z() {
        this.f320998a = null;
    }

    public void a(Exception exc2) {
        TaskCompletionSource taskCompletionSource = this.f320998a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc2);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f320998a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public z(TaskCompletionSource taskCompletionSource) {
        this.f320998a = taskCompletionSource;
    }
}
