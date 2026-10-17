package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.Token;
import gim.c;
import hlm.a;
import hlm.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.d0;
import skm.g0;
import skm.g1;
import skm.h0;
import skm.h1;
import skm.s;
import skm.s1;
import skm.x;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\r2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052(\u0010\u0013\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "", "<init>", "()V", "T", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "Lskm/g0;", "asyncUndispatched", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lskm/g0;", "Landroidx/camera/camera2/pipe/core/Token;", "use", "(Landroidx/camera/camera2/pipe/core/Token;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireToken$camera_camera2_pipe", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireToken", "action", "withTokenInAsync$camera_camera2_pipe", "withTokenInAsync", "Lhlm/a;", "mutex", "Lhlm/a;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphSessionLock {

    @NotNull
    private final a mutex = d.a();

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1, reason: invalid class name */
    @gim.d(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock", f = "GraphSessionLock.kt", l = {98}, m = "use", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GraphSessionLock.this.use(null, null, this);
        }
    }

    private final <T> g0 asyncUndispatched(CoroutineScope scope, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        h1 h1Var = new h1((Job) scope.getCoroutineContext().get(g1.f263979a));
        CoroutineContext coroutineContextPlus = scope.getCoroutineContext().plus(h1Var);
        d0 d0Var = d0.UNDISPATCHED;
        Function2 graphSessionLock$asyncUndispatched$result$1 = new GraphSessionLock$asyncUndispatched$result$1(block, null);
        CoroutineContext coroutineContextB = x.b(scope, coroutineContextPlus);
        d0Var.getClass();
        h0 s1Var = d0Var == d0.LAZY ? new s1(coroutineContextB, graphSessionLock$asyncUndispatched$result$1) : new h0(coroutineContextB, true, true);
        s1Var.j0(d0Var, s1Var, graphSessionLock$asyncUndispatched$result$1);
        s1Var.k(new a0.c(h1Var, 0));
        return s1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asyncUndispatched$lambda$0(s sVar, Throwable th10) {
        ((h1) sVar).h0();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object use(androidx.camera.camera2.pipe.core.Token r5, kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super T> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.internal.GraphSessionLock.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1 r0 = (androidx.camera.camera2.pipe.internal.GraphSessionLock.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1 r0 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$use$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.camera.camera2.pipe.core.Token r5 = (androidx.camera.camera2.pipe.core.Token) r5
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L43
        L2b:
            r6 = move-exception
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r7)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2b
            r0.label = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L43
            return r1
        L43:
            r5.release()
            return r7
        L47:
            r5.release()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.GraphSessionLock.use(androidx.camera.camera2.pipe.core.Token, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquireToken$camera_camera2_pipe(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.Token> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1 r0 = (androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1 r0 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$acquireToken$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            hlm.a r0 = (hlm.a) r0
            yhm.o.b(r5)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            hlm.a r5 = r4.mutex
            r0.L$0 = r5
            r0.label = r3
            r2 = 0
            java.lang.Object r0 = r5.lock(r2, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r5
        L45:
            androidx.camera.camera2.pipe.core.MutexToken r5 = new androidx.camera.camera2.pipe.core.MutexToken
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.GraphSessionLock.acquireToken$camera_camera2_pipe(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final <T> g0 withTokenInAsync$camera_camera2_pipe(@NotNull CoroutineScope scope, @NotNull Function2<? super Token, ? super Continuation<? super g0>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(action, "action");
        return asyncUndispatched(scope, new GraphSessionLock$withTokenInAsync$1(this, action, null));
    }
}
