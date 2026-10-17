package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.Token;
import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1", f = "GraphSessionLock.kt", l = {64}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/camera/camera2/pipe/core/Token;", "token", "Lskm/g0;", "<anonymous>", "(Landroidx/camera/camera2/pipe/core/Token;)Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class GraphSessionLock$withTokenInAsync$1$deferred$1 extends i implements Function2<Token, Continuation<? super g0>, Object> {
    final /* synthetic */ Function2<Token, Continuation<? super g0>, Object> $action;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphSessionLock$withTokenInAsync$1$deferred$1(Function2<? super Token, ? super Continuation<? super g0>, ? extends Object> function2, Continuation<? super GraphSessionLock$withTokenInAsync$1$deferred$1> continuation) {
        super(2, continuation);
        this.$action = function2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        GraphSessionLock$withTokenInAsync$1$deferred$1 graphSessionLock$withTokenInAsync$1$deferred$1 = new GraphSessionLock$withTokenInAsync$1$deferred$1(this.$action, continuation);
        graphSessionLock$withTokenInAsync$1$deferred$1.L$0 = obj2;
        return graphSessionLock$withTokenInAsync$1$deferred$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Token token, Continuation<? super g0> continuation) {
        return ((GraphSessionLock$withTokenInAsync$1$deferred$1) create(token, continuation)).invokeSuspend(Unit.f186387a);
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
        Token token = (Token) this.L$0;
        Function2<Token, Continuation<? super g0>, Object> function2 = this.$action;
        this.label = 1;
        Object objInvoke = function2.invoke(token, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
