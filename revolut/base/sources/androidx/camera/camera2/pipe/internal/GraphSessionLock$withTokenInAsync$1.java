package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.Token;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.g0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1", f = "GraphSessionLock.kt", l = {105, 64, 67}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class GraphSessionLock$withTokenInAsync$1<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<Token, Continuation<? super g0>, Object> $action;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GraphSessionLock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphSessionLock$withTokenInAsync$1(GraphSessionLock graphSessionLock, Function2<? super Token, ? super Continuation<? super g0>, ? extends Object> function2, Continuation<? super GraphSessionLock$withTokenInAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = graphSessionLock;
        this.$action = function2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        GraphSessionLock$withTokenInAsync$1 graphSessionLock$withTokenInAsync$1 = new GraphSessionLock$withTokenInAsync$1(this.this$0, this.$action, continuation);
        graphSessionLock$withTokenInAsync$1.L$0 = obj2;
        return graphSessionLock$withTokenInAsync$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[RETURN] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L35
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r10)
            return r10
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            yhm.o.b(r10)
            goto L70
        L24:
            java.lang.Object r1 = r9.L$2
            androidx.camera.camera2.pipe.internal.GraphSessionLock r1 = (androidx.camera.camera2.pipe.internal.GraphSessionLock) r1
            java.lang.Object r4 = r9.L$1
            hlm.a r4 = (hlm.a) r4
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            yhm.o.b(r10)
            r10 = r6
            goto L52
        L35:
            yhm.o.b(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            androidx.camera.camera2.pipe.internal.GraphSessionLock r1 = r9.this$0
            hlm.a r6 = androidx.camera.camera2.pipe.internal.GraphSessionLock.access$getMutex$p(r1)
            r9.L$0 = r10
            r9.L$1 = r6
            r9.L$2 = r1
            r9.label = r4
            java.lang.Object r4 = androidx.camera.camera2.pipe.core.MutexesKt.access$lockAndSuspend(r6, r9)
            if (r4 != r0) goto L51
            goto L7f
        L51:
            r4 = r6
        L52:
            androidx.camera.camera2.pipe.core.MutexToken r6 = new androidx.camera.camera2.pipe.core.MutexToken
            r6.<init>(r4)
            androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1 r4 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1
            kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super skm.g0>, java.lang.Object> r7 = r9.$action
            r4.<init>(r7, r5)
            r9.L$0 = r10
            r9.L$1 = r5
            r9.L$2 = r5
            r9.label = r3
            java.lang.Object r1 = androidx.camera.camera2.pipe.internal.GraphSessionLock.access$use(r1, r6, r4, r9)
            if (r1 != r0) goto L6d
            goto L7f
        L6d:
            r8 = r1
            r1 = r10
            r10 = r8
        L70:
            skm.g0 r10 = (skm.g0) r10
            skm.e0.q(r1)
            r9.L$0 = r5
            r9.label = r2
            java.lang.Object r10 = r10.i(r9)
            if (r10 != r0) goto L80
        L7f:
            return r0
        L80:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((GraphSessionLock$withTokenInAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
