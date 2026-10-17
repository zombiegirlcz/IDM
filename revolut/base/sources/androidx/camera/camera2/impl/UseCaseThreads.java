package androidx.camera.camera2.impl;

import a3.b;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p6.e;
import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\"\u0010%\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseThreads;", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Lkotlinx/coroutines/CoroutineDispatcher;", "backgroundDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "isOnSequentialThread", "()Z", "", "checkOnSequentialThread", "()V", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/Executor;", "getBackgroundExecutor", "()Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "sequentialExecutorDelegate", "Ljava/lang/ThreadLocal;", "isSequentialThread", "Ljava/lang/ThreadLocal;", "sequentialExecutor", "getSequentialExecutor", "sequentialDispatcher", "sequentialScope", "getSequentialScope", "setSequentialScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseCaseThreads {

    @NotNull
    private final CoroutineDispatcher backgroundDispatcher;

    @NotNull
    private final Executor backgroundExecutor;

    @NotNull
    private final ThreadLocal<Boolean> isSequentialThread;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final CoroutineDispatcher sequentialDispatcher;

    @NotNull
    private final Executor sequentialExecutor;

    @NotNull
    private final Executor sequentialExecutorDelegate;

    @NotNull
    private CoroutineScope sequentialScope;

    public UseCaseThreads(@NotNull CoroutineScope scope, @NotNull Executor backgroundExecutor, @NotNull CoroutineDispatcher backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.scope = scope;
        this.backgroundExecutor = backgroundExecutor;
        this.backgroundDispatcher = backgroundDispatcher;
        this.mainHandler = new Handler(Looper.getMainLooper());
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(backgroundExecutor);
        Intrinsics.checkNotNullExpressionValue(executorNewSequentialExecutor, "newSequentialExecutor(...)");
        this.sequentialExecutorDelegate = executorNewSequentialExecutor;
        this.isSequentialThread = new ThreadLocal<>();
        b bVar = new b(this, 4);
        this.sequentialExecutor = bVar;
        CoroutineDispatcher coroutineDispatcherR = e0.r(bVar);
        this.sequentialDispatcher = coroutineDispatcherR;
        this.sequentialScope = e0.c(scope.getF74819h().plus(e0.e()).plus(coroutineDispatcherR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sequentialExecutor$lambda$0(UseCaseThreads useCaseThreads, Runnable runnable) {
        useCaseThreads.sequentialExecutorDelegate.execute(new e(useCaseThreads, runnable, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sequentialExecutor$lambda$0$0(UseCaseThreads useCaseThreads, Runnable runnable) {
        useCaseThreads.isSequentialThread.set(Boolean.TRUE);
        try {
            runnable.run();
        } finally {
            useCaseThreads.isSequentialThread.remove();
        }
    }

    public final void checkOnSequentialThread() {
        if (isOnSequentialThread()) {
            return;
        }
        throw new IllegalStateException(("Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: " + Thread.currentThread().getName()).toString());
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    @NotNull
    public final Executor getSequentialExecutor() {
        return this.sequentialExecutor;
    }

    @NotNull
    public final CoroutineScope getSequentialScope() {
        return this.sequentialScope;
    }

    public final boolean isOnSequentialThread() {
        return Intrinsics.f(this.isSequentialThread.get(), Boolean.TRUE);
    }
}
