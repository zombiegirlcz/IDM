package androidx.work;

import androidx.tracing.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import p.a;
import skm.e0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "isTaskExecutor", "Ljava/util/concurrent/Executor;", "createDefaultExecutor", "(Z)Ljava/util/concurrent/Executor;", "Landroidx/work/Tracer;", "createDefaultTracer", "()Landroidx/work/Tracer;", "Lkotlin/coroutines/CoroutineContext;", "asExecutor", "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ConfigurationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor asExecutor(CoroutineContext coroutineContext) {
        d dVar = coroutineContext != null ? (d) coroutineContext.get(d.q1) : null;
        CoroutineDispatcher coroutineDispatcher = dVar instanceof CoroutineDispatcher ? (CoroutineDispatcher) dVar : null;
        if (coroutineDispatcher != null) {
            return e0.f(coroutineDispatcher);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                StringBuilder sbS = a.s(z ? "WM.task-" : "androidx.work-");
                sbS.append(this.threadCount.incrementAndGet());
                return new Thread(runnable, sbS.toString());
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            @Override // androidx.work.Tracer
            public void beginAsyncSection(String methodName, int cookie) throws Throwable {
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                Trace.beginAsyncSection(methodName, cookie);
            }

            @Override // androidx.work.Tracer
            public void beginSection(String label) {
                Intrinsics.checkNotNullParameter(label, "label");
                Trace.beginSection(label);
            }

            @Override // androidx.work.Tracer
            public void endAsyncSection(String methodName, int cookie) throws Throwable {
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                Trace.endAsyncSection(methodName, cookie);
            }

            @Override // androidx.work.Tracer
            public void endSection() {
                Trace.endSection();
            }

            @Override // androidx.work.Tracer
            public boolean isEnabled() {
                return Trace.isEnabled();
            }
        };
    }
}
