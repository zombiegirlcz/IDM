package androidx.camera.camera2.adapter;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kp0.b;
import kx7.o0;
import mx0.a7;
import org.jetbrains.annotations.NotNull;
import skm.g0;
import skm.q;
import skm.r;
import skm.r1;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\t\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014\u001a5\u0010\u0017\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u0017\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0019\u001a%\u0010\u001b\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lkotlinx/coroutines/Job;", "", "tag", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "asListenableFuture", "(Lkotlinx/coroutines/Job;Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;", "T", "Lskm/g0;", "(Lskm/g0;Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;", "asVoidListenableFuture", "(Lskm/g0;)Lcom/google/common/util/concurrent/ListenableFuture;", "Lskm/q;", "destination", "", "propagateTo", "(Lskm/g0;Lskm/q;)V", "R", "Lkotlin/Function1;", "transform", "(Lskm/g0;Lskm/q;Lkotlin/jvm/functions/Function1;)V", "", "completionCause", "propagateCompletion", "(Lskm/g0;Lskm/q;Ljava/lang/Throwable;)V", "(Lskm/g0;Lskm/q;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "cause", "completeFailing", "(Lskm/q;Ljava/lang/Throwable;)V", "", "timeoutMillis", "", "awaitUntil", "(Lskm/g0;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineAdaptersKt {

    /* JADX INFO: renamed from: androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.adapter.CoroutineAdaptersKt", f = "CoroutineAdapters.kt", l = {199}, m = "awaitUntil", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CoroutineAdaptersKt.awaitUntil(null, 0L, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$2", f = "CoroutineAdapters.kt", l = {199}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ g0 $this_awaitUntil;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g0 g0Var, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_awaitUntil = g0Var;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_awaitUntil, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            }
            o.b(obj2);
            g0 g0Var = this.$this_awaitUntil;
            this.label = 1;
            Object objI = g0Var.i(this);
            return objI == aVar ? aVar : objI;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    @NotNull
    public static final ListenableFuture<Void> asListenableFuture(@NotNull Job job2, Object obj2) {
        Intrinsics.checkNotNullParameter(job2, "<this>");
        ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new b(job2, obj2, 3));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    public static /* synthetic */ ListenableFuture asListenableFuture$default(Job job2, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj2 = "Job.asListenableFuture";
        }
        return asListenableFuture(job2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$0(Job job2, Object obj2, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        job2.k(new a7(completer, 22));
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asListenableFuture$lambda$0$0(CallbackToFutureAdapter.Completer completer, Throwable th10) {
        if (th10 == null) {
            completer.set(null);
        } else if (th10 instanceof CancellationException) {
            completer.setCancelled();
        } else {
            completer.setException(th10);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$1(g0 g0Var, Object obj2, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        g0Var.k(new mt9.c(completer, g0Var, 24));
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asListenableFuture$lambda$1$0(CallbackToFutureAdapter.Completer completer, g0 g0Var, Throwable th10) {
        if (th10 == null) {
            completer.set(g0Var.h());
        } else if (th10 instanceof CancellationException) {
            completer.setCancelled();
        } else {
            completer.setException(th10);
        }
        return Unit.f186387a;
    }

    @NotNull
    public static final <T> ListenableFuture<Void> asVoidListenableFuture(@NotNull g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        FutureChain<T> futureChainTransform = FutureChain.from(asListenableFuture$default(g0Var, (Object) null, 1, (Object) null)).transform(new o0(18), CameraXExecutors.directExecutor());
        Intrinsics.checkNotNullExpressionValue(futureChainTransform, "transform(...)");
        return futureChainTransform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void asVoidListenableFuture$lambda$0(Object obj2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object awaitUntil(@org.jetbrains.annotations.NotNull skm.g0 r4, long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof androidx.camera.camera2.adapter.CoroutineAdaptersKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1 r0 = (androidx.camera.camera2.adapter.CoroutineAdaptersKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1 r0 = new androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r7)
            androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$2 r7 = new androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$2
            r2 = 0
            r7.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r7 = skm.h2.d(r5, r7, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            if (r7 == 0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.CoroutineAdaptersKt.awaitUntil(skm.g0, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void completeFailing(@NotNull q qVar, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (!(cause instanceof CancellationException)) {
            ((r) qVar).h0(cause);
        } else {
            ((r1) qVar).A((CancellationException) cause);
        }
    }

    public static final <T> void propagateCompletion(@NotNull g0 g0Var, @NotNull q destination, Throwable th10) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (th10 != null) {
            completeFailing(destination, th10);
        } else {
            ((r) destination).U(g0Var.h());
        }
    }

    public static final <T> void propagateTo(@NotNull g0 g0Var, @NotNull q destination) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        g0Var.k(new mt9.c(g0Var, destination, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit propagateTo$lambda$0(g0 g0Var, q qVar, Throwable th10) {
        propagateCompletion(g0Var, qVar, th10);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit propagateTo$lambda$1(g0 g0Var, q qVar, Function1 function1, Throwable th10) {
        propagateCompletion(g0Var, qVar, th10, function1);
        return Unit.f186387a;
    }

    public static /* synthetic */ ListenableFuture asListenableFuture$default(g0 g0Var, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj2 = "Deferred.asListenableFuture";
        }
        return asListenableFuture(g0Var, obj2);
    }

    public static final <T, R> void propagateTo(@NotNull g0 g0Var, @NotNull q destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        g0Var.k(new moe.c(g0Var, 17, destination, transform));
    }

    @NotNull
    public static final <T> ListenableFuture<T> asListenableFuture(@NotNull g0 g0Var, Object obj2) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new n.b(g0Var, obj2, 0));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    public static final <T, R> void propagateCompletion(@NotNull g0 g0Var, @NotNull q destination, Throwable th10, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (th10 != null) {
            completeFailing(destination, th10);
        } else {
            ((r) destination).U(transform.invoke(g0Var.h()));
        }
    }
}
