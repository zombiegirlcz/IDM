package androidx.work;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface RunnableScheduler {
    void cancel(@NonNull Runnable runnable);

    void scheduleWithDelay(long j2, @NonNull Runnable runnable);
}
