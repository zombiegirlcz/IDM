package androidx.camera.camera2.pipe.internal;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$asyncUndispatched$result$1", f = "GraphSessionLock.kt", l = {90}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class GraphSessionLock$asyncUndispatched$result$1<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphSessionLock$asyncUndispatched$result$1(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super GraphSessionLock$asyncUndispatched$result$1> continuation) {
        super(2, continuation);
        this.$block = function2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        GraphSessionLock$asyncUndispatched$result$1 graphSessionLock$asyncUndispatched$result$1 = new GraphSessionLock$asyncUndispatched$result$1(this.$block, continuation);
        graphSessionLock$asyncUndispatched$result$1.L$0 = obj2;
        return graphSessionLock$asyncUndispatched$result$1;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        e0.q(coroutineScope);
        Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.$block;
        this.label = 1;
        Object objInvoke = function2.invoke(coroutineScope, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((GraphSessionLock$asyncUndispatched$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
