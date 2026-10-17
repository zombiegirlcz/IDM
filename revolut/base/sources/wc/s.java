package wc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public abstract class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f296307a;

    public s() {
        this.f296307a = null;
    }

    public final TaskCompletionSource a() {
        return this.f296307a;
    }

    public final void b(Exception exc2) {
        TaskCompletionSource taskCompletionSource = this.f296307a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc2);
        }
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Exception e) {
            b(e);
        }
    }

    public s(TaskCompletionSource taskCompletionSource) {
        this.f296307a = taskCompletionSource;
    }
}
