package pth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f239707w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, y yVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = aVar;
        this.f239707w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.v, this.f239707w, continuation, 0);
            default:
                return new p(this.v, this.f239707w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        y yVar = this.f239707w;
        com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.M2(yVar);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.M2(yVar);
                break;
        }
        return Unit.f186387a;
    }
}
