package androidx.camera.core;

import android.os.Process;
import androidx.camera.core.impl.CameraFactory;
import androidx.core.util.Preconditions;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public class CameraExecutor implements Executor, ScheduledExecutorService, AutoCloseable {
    private static final ThreadFactory THREAD_FACTORY = new AnonymousClass1();
    private final Object mExecutorLock = new Object();
    private ScheduledThreadPoolExecutor mThreadPoolExecutor = createExecutor();

    /* JADX INFO: renamed from: androidx.camera.core.CameraExecutor$1, reason: invalid class name */
    public class AnonymousClass1 implements ThreadFactory {
        private final AtomicInteger mThreadId = new AtomicInteger(0);

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$newThread$0(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new c(runnable, 0));
            thread.setPriority(7);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.mThreadId.getAndIncrement());
            return thread;
        }
    }

    private static ScheduledThreadPoolExecutor createExecutor() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, THREAD_FACTORY);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new b0.a());
        return scheduledThreadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        boolean zAwaitTermination;
        synchronized (this.mExecutorLock) {
            zAwaitTermination = this.mThreadPoolExecutor.awaitTermination(j2, timeUnit);
        }
        return zAwaitTermination;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public void deinit() {
        synchronized (this.mExecutorLock) {
            try {
                if (!this.mThreadPoolExecutor.isShutdown()) {
                    this.mThreadPoolExecutor.shutdown();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.mExecutorLock) {
            this.mThreadPoolExecutor.execute(runnable);
        }
    }

    public void init(CameraFactory cameraFactory) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Preconditions.checkNotNull(cameraFactory);
        synchronized (this.mExecutorLock) {
            try {
                if (this.mThreadPoolExecutor.isShutdown()) {
                    this.mThreadPoolExecutor = createExecutor();
                }
                scheduledThreadPoolExecutor = this.mThreadPoolExecutor;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, cameraFactory.getAvailableCameraIds().size()));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        List<Future<T>> listInvokeAll;
        synchronized (this.mExecutorLock) {
            listInvokeAll = this.mThreadPoolExecutor.invokeAll(collection);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        T t2;
        synchronized (this.mExecutorLock) {
            t2 = (T) this.mThreadPoolExecutor.invokeAny(collection);
        }
        return t2;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean zIsShutdown;
        synchronized (this.mExecutorLock) {
            zIsShutdown = this.mThreadPoolExecutor.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean zIsTerminated;
        synchronized (this.mExecutorLock) {
            zIsTerminated = this.mThreadPoolExecutor.isTerminated();
        }
        return zIsTerminated;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.mExecutorLock) {
            scheduledFutureSchedule = this.mThreadPoolExecutor.schedule(runnable, j2, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        synchronized (this.mExecutorLock) {
            scheduledFutureScheduleAtFixedRate = this.mThreadPoolExecutor.scheduleAtFixedRate(runnable, j2, j3, timeUnit);
        }
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        synchronized (this.mExecutorLock) {
            scheduledFutureScheduleWithFixedDelay = this.mThreadPoolExecutor.scheduleWithFixedDelay(runnable, j2, j3, timeUnit);
        }
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.mExecutorLock) {
            this.mThreadPoolExecutor.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        List<Runnable> listShutdownNow;
        synchronized (this.mExecutorLock) {
            listShutdownNow = this.mThreadPoolExecutor.shutdownNow();
        }
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        Future<T> futureSubmit;
        synchronized (this.mExecutorLock) {
            futureSubmit = this.mThreadPoolExecutor.submit(callable);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        List<Future<T>> listInvokeAll;
        synchronized (this.mExecutorLock) {
            listInvokeAll = this.mThreadPoolExecutor.invokeAll(collection, j2, timeUnit);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        T t2;
        synchronized (this.mExecutorLock) {
            t2 = (T) this.mThreadPoolExecutor.invokeAny(collection, j2, timeUnit);
        }
        return t2;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        ScheduledFuture<V> scheduledFutureSchedule;
        synchronized (this.mExecutorLock) {
            scheduledFutureSchedule = this.mThreadPoolExecutor.schedule(callable, j2, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t2) {
        Future<T> futureSubmit;
        synchronized (this.mExecutorLock) {
            futureSubmit = this.mThreadPoolExecutor.submit(runnable, t2);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        Future<?> futureSubmit;
        synchronized (this.mExecutorLock) {
            futureSubmit = this.mThreadPoolExecutor.submit(runnable);
        }
        return futureSubmit;
    }
}
