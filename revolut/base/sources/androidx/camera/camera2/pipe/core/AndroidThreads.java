package androidx.camera.camera2.pipe.core;

import android.os.Process;
import androidx.camera.camera2.pipe.core.AndroidThreads;
import com.google.android.material.sidesheet.b;
import j6.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import rkm.d;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0013*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/camera/camera2/pipe/core/AndroidThreads;", "", "<init>", "()V", "", "androidPriority", "androidToJavaPriority", "(I)I", "Ljava/util/concurrent/ThreadFactory;", "withAndroidPriority", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ThreadFactory;", "", "namePrefix", "withPrefix", "(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;", "threads", "Ljava/util/concurrent/ExecutorService;", "asFixedSizeThreadPool", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "asScheduledThreadPool", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ScheduledExecutorService;", "", "NICE_VALUES", "[I", "factory", "Ljava/util/concurrent/ThreadFactory;", "getFactory", "()Ljava/util/concurrent/ThreadFactory;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidThreads {

    @NotNull
    public static final AndroidThreads INSTANCE = new AndroidThreads();

    @NotNull
    private static final int[] NICE_VALUES = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};

    @NotNull
    private static final ThreadFactory factory;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        Intrinsics.checkNotNullExpressionValue(threadFactoryDefaultThreadFactory, "defaultThreadFactory(...)");
        factory = threadFactoryDefaultThreadFactory;
    }

    private AndroidThreads() {
    }

    private final int androidToJavaPriority(int androidPriority) {
        int length = NICE_VALUES.length;
        for (int i = 0; i < length; i++) {
            if (androidPriority >= NICE_VALUES[i]) {
                return i + 1;
            }
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread withAndroidPriority$lambda$0(int i, ThreadFactory threadFactory, Runnable runnable) {
        int iAndroidToJavaPriority = INSTANCE.androidToJavaPriority(i);
        Thread threadNewThread = threadFactory.newThread(new b(i, runnable));
        Intrinsics.checkNotNullExpressionValue(threadNewThread, "newThread(...)");
        threadNewThread.setPriority(iAndroidToJavaPriority);
        return threadNewThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withAndroidPriority$lambda$0$0(int i, Runnable runnable) {
        Process.setThreadPriority(i);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread withPrefix$lambda$0(ThreadFactory threadFactory, String str, d dVar, Runnable runnable) {
        Thread threadNewThread = threadFactory.newThread(runnable);
        Intrinsics.checkNotNullExpressionValue(threadNewThread, "newThread(...)");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        dVar.getClass();
        sb6.append(d0.b0(String.valueOf(d.f254895b.incrementAndGet(dVar)), 2, '0'));
        threadNewThread.setName(sb6.toString());
        return threadNewThread;
    }

    @NotNull
    public final ExecutorService asFixedSizeThreadPool(@NotNull ThreadFactory threadFactory, int i) {
        Intrinsics.checkNotNullParameter(threadFactory, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(a.l(i, "Threads (", ") must be > 0").toString());
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i, threadFactory);
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    @NotNull
    public final ScheduledExecutorService asScheduledThreadPool(@NotNull ThreadFactory threadFactory, int i) {
        Intrinsics.checkNotNullParameter(threadFactory, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(a.l(i, "Threads (", ") must be > 0").toString());
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, threadFactory);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    @NotNull
    public final ThreadFactory getFactory() {
        return factory;
    }

    @NotNull
    public final ThreadFactory withAndroidPriority(@NotNull final ThreadFactory threadFactory, final int i) {
        Intrinsics.checkNotNullParameter(threadFactory, "<this>");
        return new ThreadFactory() { // from class: y.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AndroidThreads.withAndroidPriority$lambda$0(i, threadFactory, runnable);
            }
        };
    }

    @NotNull
    public final ThreadFactory withPrefix(@NotNull final ThreadFactory threadFactory, @NotNull final String namePrefix) {
        Intrinsics.checkNotNullParameter(threadFactory, "<this>");
        Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
        final d dVarH = hx7.b.h(0);
        return new ThreadFactory() { // from class: y.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AndroidThreads.withPrefix$lambda$0(threadFactory, namePrefix, dVarH, runnable);
            }
        };
    }
}
