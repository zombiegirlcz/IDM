package pig;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f236501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f236502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.transfer.a f236503y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f236503y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w wVar = new w(0, this.f236503y, continuation);
                wVar.f236501w = flowCollector;
                wVar.f236502x = obj3;
                return wVar.invokeSuspend(Unit.f186387a);
            case 1:
                w wVar2 = new w(1, this.f236503y, continuation);
                wVar2.f236501w = flowCollector;
                wVar2.f236502x = obj3;
                return wVar2.invokeSuspend(Unit.f186387a);
            default:
                w wVar3 = new w(2, this.f236503y, continuation);
                wVar3.f236501w = flowCollector;
                wVar3.f236502x = obj3;
                return wVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f236501w;
                    com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar2 = this.f236503y;
                    vfg.d dVar = aVar2.f94389r;
                    String accountId = aVar2.o.f94383a;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    vkm.d dVarA = vfg.d.a(dVar);
                    this.f236501w = null;
                    this.f236502x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = dVarA.collect(new nj8.g(flowCollector, accountId, 14), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f236501w;
                    vkm.d dVarB = rd0.e.b(this.f236503y.f94388q.J(AccountId.Personal.f51414a, w4l.h.f294642c));
                    this.f236501w = null;
                    this.f236502x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f236501w;
                    vkm.d dVarB2 = rd0.e.b(mo3.a.n(this.f236503y.f94387p.c(true)));
                    this.f236501w = null;
                    this.f236502x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
