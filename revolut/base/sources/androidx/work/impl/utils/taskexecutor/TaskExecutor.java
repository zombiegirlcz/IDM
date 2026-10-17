package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.e0;

/* JADX INFO: loaded from: classes.dex */
public interface TaskExecutor {
    default void executeOnTaskThread(@NonNull Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    @NonNull
    Executor getMainThreadExecutor();

    @NonNull
    SerialExecutor getSerialTaskExecutor();

    @NonNull
    default CoroutineDispatcher getTaskCoroutineDispatcher() {
        return e0.r(getSerialTaskExecutor());
    }
}
