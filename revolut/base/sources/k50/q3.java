package k50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class q3 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f181219w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Object obj2, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.v = j4Var;
        this.f181219w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q3(this.f181219w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        Object obj3 = this.f181219w;
        j4 j4Var = this.v;
        p3 p3Var = new p3(obj3, j4Var, null);
        this.u = 1;
        Object objP2 = j4Var.p2(this, p3Var);
        return objP2 == aVar ? aVar : objP2;
    }
}
