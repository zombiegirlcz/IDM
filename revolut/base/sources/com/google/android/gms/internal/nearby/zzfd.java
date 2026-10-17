package com.google.android.gms.internal.nearby;

import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfd {
    public static Task zza(Task task, long j2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.nearby.zzfb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception != null) {
                    taskCompletionSource2.trySetException(exception);
                } else {
                    taskCompletionSource2.trySetException(new IllegalStateException("Failed task has null exception"));
                }
            }
        });
        new zzh(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.google.android.gms.internal.nearby.zzfc
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (taskCompletionSource2.getTask().isComplete()) {
                    return;
                }
                taskCompletionSource2.trySetException(new TimeoutException("Timed out."));
            }
        }, j2);
        return taskCompletionSource.getTask();
    }
}
