package androidx.camera.camera2.pipe.core;

import a3l.b;
import android.os.Handler;
import fim.a;
import gim.d;
import gim.i;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g0;
import skm.h2;
import yhm.j;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b2\u0010$¨\u00063"}, d2 = {"Landroidx/camera/camera2/pipe/core/Threads;", "", "Lkotlinx/coroutines/CoroutineScope;", "cameraPipeScope", "cameraPipeDispatchScope", "Ljava/util/concurrent/Executor;", "blockingExecutor", "Lkotlinx/coroutines/CoroutineDispatcher;", "blockingDispatcher", "backgroundExecutor", "backgroundDispatcher", "lightweightExecutor", "lightweightDispatcher", "Lkotlin/Function0;", "Landroid/os/Handler;", "camera2Handler", "camera2Executor", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "T", "dispatcher", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "Lskm/g0;", "runAsyncSupervised", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;)Lskm/g0;", "", "timeoutMs", "runBlockingCheckedOrNull", "(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "getCameraPipeScope", "()Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/Executor;", "getBlockingExecutor", "()Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBlockingDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundExecutor", "getBackgroundDispatcher", "getLightweightExecutor", "getLightweightDispatcher", "Lkotlin/Lazy;", "_camera2Handler", "Lkotlin/Lazy;", "_camera2Executor", "getCamera2Handler", "()Landroid/os/Handler;", "getCamera2Executor", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Threads {

    @NotNull
    private final Lazy _camera2Executor;

    @NotNull
    private final Lazy _camera2Handler;

    @NotNull
    private final CoroutineDispatcher backgroundDispatcher;

    @NotNull
    private final Executor backgroundExecutor;

    @NotNull
    private final CoroutineDispatcher blockingDispatcher;

    @NotNull
    private final Executor blockingExecutor;

    @NotNull
    private final CoroutineScope cameraPipeDispatchScope;

    @NotNull
    private final CoroutineScope cameraPipeScope;

    @NotNull
    private final CoroutineDispatcher lightweightDispatcher;

    @NotNull
    private final Executor lightweightExecutor;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.core.Threads$runAsyncSupervised$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.core.Threads$runAsyncSupervised$1", f = "Threads.kt", l = {97}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function1;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.$block, continuation);
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
            Function1<Continuation<? super T>, Object> function1 = this.$block;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1", f = "Threads.kt", l = {85}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18421<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        final /* synthetic */ long $timeoutMs;
        int label;

        /* JADX INFO: renamed from: androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1$1", f = "Threads.kt", l = {85}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C00231 extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
            final /* synthetic */ g0 $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00231(g0 g0Var, Continuation<? super C00231> continuation) {
                super(2, continuation);
                this.$result = g0Var;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                return new C00231(this.$result, continuation);
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
                g0 g0Var = this.$result;
                this.label = 1;
                Object objI = g0Var.i(this);
                return objI == aVar ? aVar : objI;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((C00231) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C18421(Function1<? super Continuation<? super T>, ? extends Object> function1, long j2, Continuation<? super C18421> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.$timeoutMs = j2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return Threads.this.new C18421(this.$block, this.$timeoutMs, continuation);
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
            Threads threads = Threads.this;
            g0 g0VarRunAsyncSupervised = threads.runAsyncSupervised(threads.getBackgroundDispatcher(), this.$block);
            long j2 = this.$timeoutMs;
            C00231 c00231 = new C00231(g0VarRunAsyncSupervised, null);
            this.label = 1;
            Object objD = h2.d(j2, c00231, this);
            return objD == aVar ? aVar : objD;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C18421) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public Threads(@NotNull CoroutineScope cameraPipeScope, @NotNull CoroutineScope cameraPipeDispatchScope, @NotNull Executor blockingExecutor, @NotNull CoroutineDispatcher blockingDispatcher, @NotNull Executor backgroundExecutor, @NotNull CoroutineDispatcher backgroundDispatcher, @NotNull Executor lightweightExecutor, @NotNull CoroutineDispatcher lightweightDispatcher, @NotNull Function0<? extends Handler> camera2Handler, @NotNull Function0<? extends Executor> camera2Executor) {
        Intrinsics.checkNotNullParameter(cameraPipeScope, "cameraPipeScope");
        Intrinsics.checkNotNullParameter(cameraPipeDispatchScope, "cameraPipeDispatchScope");
        Intrinsics.checkNotNullParameter(blockingExecutor, "blockingExecutor");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(lightweightExecutor, "lightweightExecutor");
        Intrinsics.checkNotNullParameter(lightweightDispatcher, "lightweightDispatcher");
        Intrinsics.checkNotNullParameter(camera2Handler, "camera2Handler");
        Intrinsics.checkNotNullParameter(camera2Executor, "camera2Executor");
        this.cameraPipeScope = cameraPipeScope;
        this.cameraPipeDispatchScope = cameraPipeDispatchScope;
        this.blockingExecutor = blockingExecutor;
        this.blockingDispatcher = blockingDispatcher;
        this.backgroundExecutor = backgroundExecutor;
        this.backgroundDispatcher = backgroundDispatcher;
        this.lightweightExecutor = lightweightExecutor;
        this.lightweightDispatcher = lightweightDispatcher;
        this._camera2Handler = j.b(new b(15, camera2Handler));
        this._camera2Executor = j.b(new b(16, camera2Executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor _camera2Executor$lambda$0(Function0 function0) {
        return (Executor) function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler _camera2Handler$lambda$0(Function0 function0) {
        return (Handler) function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> g0 runAsyncSupervised(CoroutineDispatcher dispatcher, Function1<? super Continuation<? super T>, ? extends Object> block) {
        return e0.g(this.cameraPipeDispatchScope, dispatcher, null, new AnonymousClass1(block, null), 2);
    }

    @NotNull
    public final CoroutineDispatcher getBackgroundDispatcher() {
        return this.backgroundDispatcher;
    }

    @NotNull
    public final CoroutineDispatcher getBlockingDispatcher() {
        return this.blockingDispatcher;
    }

    @NotNull
    public final Executor getCamera2Executor() {
        return (Executor) this._camera2Executor.getValue();
    }

    @NotNull
    public final Handler getCamera2Handler() {
        return (Handler) this._camera2Handler.getValue();
    }

    @NotNull
    public final CoroutineScope getCameraPipeScope() {
        return this.cameraPipeScope;
    }

    @NotNull
    public final CoroutineDispatcher getLightweightDispatcher() {
        return this.lightweightDispatcher;
    }

    @NotNull
    public final Executor getLightweightExecutor() {
        return this.lightweightExecutor;
    }

    public final <T> T runBlockingCheckedOrNull(long timeoutMs, @NotNull Function1<? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return (T) e0.E(this.blockingDispatcher, new C18421(block, timeoutMs, null));
        } catch (InterruptedException e) {
            return Log.INSTANCE.getINFO_LOGGABLE() ? null : null;
        }
    }
}
