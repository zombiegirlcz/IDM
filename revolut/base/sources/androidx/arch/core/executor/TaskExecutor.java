package androidx.arch.core.executor;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class TaskExecutor {
    public abstract void executeOnDiskIO(@NonNull Runnable runnable);

    public abstract boolean isMainThread();

    public abstract void postToMainThread(@NonNull Runnable runnable);
}
