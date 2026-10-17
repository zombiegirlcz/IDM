package je;

import ag.p;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l.a f173163a = new l.a(2);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        p pVar = new p(taskCompletionSource, 7, new AtomicBoolean(false), cancellationTokenSource);
        l.a aVar = f173163a;
        task.continueWithTask(aVar, pVar);
        task2.continueWithTask(aVar, pVar);
        return taskCompletionSource.getTask();
    }
}
