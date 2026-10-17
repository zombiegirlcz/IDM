package androidx.camera.camera2.pipe.config;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.config.ThreadConfigModule;
import androidx.camera.camera2.pipe.core.AndroidThreads;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.b0;
import skm.c2;
import skm.e0;
import uk.a;
import x.b;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/camera/camera2/pipe/config/ThreadConfigModule;", "", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "threadConfig", "<init>", "(Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;)V", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "Landroidx/camera/camera2/pipe/core/Threads;", "provideThreads", "(Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;Lkotlinx/coroutines/Job;)Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "", "lightweightThreadCount", "I", "backgroundThreadCount", "cameraThreadPriority", "defaultThreadPriority", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThreadConfigModule {
    private final int backgroundThreadCount;
    private final int cameraThreadPriority;
    private final int defaultThreadPriority;
    private final int lightweightThreadCount;

    @NotNull
    private final CameraPipe.ThreadConfig threadConfig;

    public ThreadConfigModule(@NotNull CameraPipe.ThreadConfig threadConfig) {
        Intrinsics.checkNotNullParameter(threadConfig, "threadConfig");
        this.threadConfig = threadConfig;
        this.lightweightThreadCount = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
        this.backgroundThreadCount = 4;
        this.cameraThreadPriority = -3;
        this.defaultThreadPriority = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideThreads$lambda$3(List list) throws InterruptedException {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ((ExecutorService) it8.next()).shutdownNow();
        }
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            ((ExecutorService) it9.next()).awaitTermination(1L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler provideThreads$lambda$4(ThreadConfigModule threadConfigModule, CameraPipeLifetime cameraPipeLifetime) {
        if (threadConfigModule.threadConfig.getDefaultCameraHandler() != null) {
            return threadConfigModule.threadConfig.getDefaultCameraHandler();
        }
        HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", threadConfigModule.cameraThreadPriority);
        handlerThread.start();
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new b(handlerThread, 1));
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideThreads$lambda$4$1(HandlerThread handlerThread) throws InterruptedException {
        handlerThread.quit();
        handlerThread.join(1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor provideThreads$lambda$5(ThreadConfigModule threadConfigModule, CameraPipeLifetime cameraPipeLifetime) {
        if (threadConfigModule.threadConfig.getDefaultCameraExecutor() != null) {
            return threadConfigModule.threadConfig.getDefaultCameraExecutor();
        }
        AndroidThreads androidThreads = AndroidThreads.INSTANCE;
        ExecutorService executorServiceAsFixedSizeThreadPool = androidThreads.asFixedSizeThreadPool(androidThreads.withAndroidPriority(androidThreads.withPrefix(androidThreads.getFactory(), "CXCP-Camera-E"), threadConfigModule.cameraThreadPriority), 1);
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new b(executorServiceAsFixedSizeThreadPool, 2));
        return executorServiceAsFixedSizeThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideThreads$lambda$5$0(ExecutorService executorService) throws InterruptedException {
        executorService.shutdownNow();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideThreads$lambda$6(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        e0.k((CoroutineScope) ref$ObjectRef.f186409a, null);
        e0.k((CoroutineScope) ref$ObjectRef2.f186409a, null);
    }

    @NotNull
    public final Threads provideThreads(@NotNull final CameraPipeLifetime cameraPipeLifetime, @NotNull Job cameraPipeJob) {
        Intrinsics.checkNotNullParameter(cameraPipeLifetime, "cameraPipeLifetime");
        Intrinsics.checkNotNullParameter(cameraPipeJob, "cameraPipeJob");
        ArrayList arrayList = new ArrayList();
        Executor defaultBlockingExecutor = this.threadConfig.getDefaultBlockingExecutor();
        if (defaultBlockingExecutor == null) {
            AndroidThreads androidThreads = AndroidThreads.INSTANCE;
            defaultBlockingExecutor = androidThreads.asScheduledThreadPool(androidThreads.withAndroidPriority(androidThreads.withPrefix(androidThreads.getFactory(), "CXCP-IO-"), this.defaultThreadPriority), 8);
            arrayList.add(defaultBlockingExecutor);
        }
        Executor executor = defaultBlockingExecutor;
        CoroutineDispatcher coroutineDispatcherR = e0.r(executor);
        Executor defaultBackgroundExecutor = this.threadConfig.getDefaultBackgroundExecutor();
        if (defaultBackgroundExecutor == null) {
            AndroidThreads androidThreads2 = AndroidThreads.INSTANCE;
            defaultBackgroundExecutor = androidThreads2.asScheduledThreadPool(androidThreads2.withAndroidPriority(androidThreads2.withPrefix(androidThreads2.getFactory(), "CXCP-BG-"), this.defaultThreadPriority), this.backgroundThreadCount);
            arrayList.add(defaultBackgroundExecutor);
        }
        Executor executor2 = defaultBackgroundExecutor;
        CoroutineDispatcher coroutineDispatcherR2 = e0.r(executor2);
        Executor defaultLightweightExecutor = this.threadConfig.getDefaultLightweightExecutor();
        if (defaultLightweightExecutor == null) {
            AndroidThreads androidThreads3 = AndroidThreads.INSTANCE;
            defaultLightweightExecutor = androidThreads3.asScheduledThreadPool(androidThreads3.withAndroidPriority(androidThreads3.withPrefix(androidThreads3.getFactory(), "CXCP-"), this.cameraThreadPriority), this.lightweightThreadCount);
            arrayList.add(defaultLightweightExecutor);
        }
        Executor executor3 = defaultLightweightExecutor;
        CoroutineDispatcher coroutineDispatcherR3 = e0.r(executor3);
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new b(arrayList, 0));
        Function0<Handler> defaultCameraHandlerFn = this.threadConfig.getDefaultCameraHandlerFn();
        if (defaultCameraHandlerFn == null) {
            final int i = 0;
            defaultCameraHandlerFn = new Function0(this) { // from class: x.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ThreadConfigModule f301440b;

                {
                    this.f301440b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            return ThreadConfigModule.provideThreads$lambda$4(this.f301440b, cameraPipeLifetime);
                        default:
                            return ThreadConfigModule.provideThreads$lambda$5(this.f301440b, cameraPipeLifetime);
                    }
                }
            };
        }
        Function0<Handler> function0 = defaultCameraHandlerFn;
        final int i2 = 1;
        Function0 function02 = new Function0(this) { // from class: x.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadConfigModule f301440b;

            {
                this.f301440b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ThreadConfigModule.provideThreads$lambda$4(this.f301440b, cameraPipeLifetime);
                    default:
                        return ThreadConfigModule.provideThreads$lambda$5(this.f301440b, cameraPipeLifetime);
                }
            }
        };
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        if (this.threadConfig.getTestOnlyScope() != null) {
            ref$ObjectRef.f186409a = this.threadConfig.getTestOnlyScope();
            ref$ObjectRef2.f186409a = this.threadConfig.getTestOnlyScope();
        } else {
            ref$ObjectRef.f186409a = e0.c(e.d(new c2(cameraPipeJob), coroutineDispatcherR3).plus(new b0("CXCP")));
            ref$ObjectRef2.f186409a = e0.c(e.d(new c2(cameraPipeJob), new b0("CXCP-Dispatch")));
            cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new a(ref$ObjectRef, ref$ObjectRef2, 3));
        }
        return new Threads((CoroutineScope) ref$ObjectRef.f186409a, (CoroutineScope) ref$ObjectRef2.f186409a, executor, coroutineDispatcherR, executor2, coroutineDispatcherR2, executor3, coroutineDispatcherR3, function0, function02);
    }
}
