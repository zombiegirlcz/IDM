package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    @NonNull
    private Executor mBackgroundExecutor;

    @NonNull
    private ForegroundUpdater mForegroundUpdater;
    private int mGeneration;

    @NonNull
    private UUID mId;

    @NonNull
    private Data mInputData;

    @NonNull
    private ProgressUpdater mProgressUpdater;
    private int mRunAttemptCount;

    @NonNull
    private RuntimeExtras mRuntimeExtras;

    @NonNull
    private Set<String> mTags;

    @NonNull
    private TaskExecutor mWorkTaskExecutor;

    @NonNull
    private CoroutineContext mWorkerContext;

    @NonNull
    private WorkerFactory mWorkerFactory;

    public static class RuntimeExtras {
        public Network network;

        @NonNull
        public List<String> triggeredContentAuthorities;

        @NonNull
        public List<Uri> triggeredContentUris;

        public RuntimeExtras() {
            List list = Collections.EMPTY_LIST;
            this.triggeredContentAuthorities = list;
            this.triggeredContentUris = list;
        }
    }

    public WorkerParameters(@NonNull UUID uuid, @NonNull Data data, @NonNull Collection<String> collection, @NonNull RuntimeExtras runtimeExtras, int i, int i2, @NonNull Executor executor, @NonNull CoroutineContext coroutineContext, @NonNull TaskExecutor taskExecutor, @NonNull WorkerFactory workerFactory, @NonNull ProgressUpdater progressUpdater, @NonNull ForegroundUpdater foregroundUpdater) {
        this.mId = uuid;
        this.mInputData = data;
        this.mTags = new HashSet(collection);
        this.mRuntimeExtras = runtimeExtras;
        this.mRunAttemptCount = i;
        this.mGeneration = i2;
        this.mBackgroundExecutor = executor;
        this.mWorkerContext = coroutineContext;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkerFactory = workerFactory;
        this.mProgressUpdater = progressUpdater;
        this.mForegroundUpdater = foregroundUpdater;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    @NonNull
    public ForegroundUpdater getForegroundUpdater() {
        return this.mForegroundUpdater;
    }

    @NonNull
    public UUID getId() {
        return this.mId;
    }

    @NonNull
    public Data getInputData() {
        return this.mInputData;
    }

    public Network getNetwork() {
        return this.mRuntimeExtras.network;
    }

    @NonNull
    public ProgressUpdater getProgressUpdater() {
        return this.mProgressUpdater;
    }

    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    @NonNull
    public Set<String> getTags() {
        return this.mTags;
    }

    @NonNull
    public TaskExecutor getTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    @NonNull
    public List<String> getTriggeredContentAuthorities() {
        return this.mRuntimeExtras.triggeredContentAuthorities;
    }

    @NonNull
    public List<Uri> getTriggeredContentUris() {
        return this.mRuntimeExtras.triggeredContentUris;
    }

    @NonNull
    public CoroutineContext getWorkerContext() {
        return this.mWorkerContext;
    }

    @NonNull
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }
}
