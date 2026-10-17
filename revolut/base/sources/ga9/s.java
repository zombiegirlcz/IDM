package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.v, continuation, 0);
            default:
                return new s(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.onboarding.impl.onboarding.v vVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.T2(q89.f.STORIES);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.l2(new m(vVar, null, 7), new f(vVar, 9));
                break;
        }
        return Unit.f186387a;
    }
}
