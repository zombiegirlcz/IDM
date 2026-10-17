package androidx.work;

import ag.p;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import q6.a;
import q6.b;
import skm.d0;
import skm.e0;
import skm.g1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lskm/d0;", "start", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "Lcom/google/common/util/concurrent/ListenableFuture;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;Lskm/d0;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "executeAsync", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ListenableFutureKt {
    @NotNull
    public static final <V> ListenableFuture<V> executeAsync(@NotNull Executor executor, @NotNull String debugTag, @NotNull Function0<? extends V> block) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        ListenableFuture<V> future = CallbackToFutureAdapter.getFuture(new p(executor, 14, debugTag, block));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->… }\n        debugTag\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, Function0 function0, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new a(atomicBoolean, 0), DirectExecutor.INSTANCE);
        executor.execute(new b(atomicBoolean, completer, function0, 0));
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(function0.invoke());
        } catch (Throwable th10) {
            completer.setException(th10);
        }
    }

    @NotNull
    public static final <T> ListenableFuture<T> launchFuture(@NotNull CoroutineContext context, @NotNull d0 start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new p(context, 15, start, block));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return future;
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(CoroutineContext coroutineContext, d0 d0Var, Function2 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            coroutineContext = g.f186406a;
        }
        if ((i & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        return launchFuture(coroutineContext, d0Var, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(CoroutineContext coroutineContext, d0 d0Var, Function2 function2, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        completer.addCancellationListener(new o6.a((Job) coroutineContext.get(g1.f263979a), 12), DirectExecutor.INSTANCE);
        return e0.C(e0.c(coroutineContext), null, d0Var, new ListenableFutureKt$launchFuture$1$2(function2, completer, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(Job job2) {
        if (job2 != null) {
            job2.f(null);
        }
    }
}
