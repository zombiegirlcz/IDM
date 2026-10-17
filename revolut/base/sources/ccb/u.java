package ccb;

import ble.e1;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f23018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f23019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c0 f23020y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, c0 c0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f23020y = c0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f23020y, continuation);
                uVar.f23018w = flowCollector;
                uVar.f23019x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            case 1:
                u uVar2 = new u(1, this.f23020y, continuation);
                uVar2.f23018w = flowCollector;
                uVar2.f23019x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
            case 2:
                u uVar3 = new u(2, this.f23020y, continuation);
                uVar3.f23018w = flowCollector;
                uVar3.f23019x = obj3;
                return uVar3.invokeSuspend(Unit.f186387a);
            default:
                u uVar4 = new u(3, this.f23020y, continuation);
                uVar4.f23018w = flowCollector;
                uVar4.f23019x = obj3;
                return uVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowH;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f23018w;
                    AccountId accountId = (AccountId) this.f23019x;
                    c0 c0Var = this.f23020y;
                    vkm.d dVarA = c0Var.f22975q.a(((i) c0Var.t2()).f.f115083b, accountId);
                    this.f23018w = null;
                    this.f23019x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarA, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f23018w;
                    jhi.b bVarD = this.f23020y.f22978t.d((acb.e) this.f23019x);
                    this.f23018w = null;
                    this.f23019x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarD, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f23018w;
                    bcb.e eVar = (bcb.e) this.f23019x;
                    c0 c0Var2 = this.f23020y;
                    Flow flowB = c0Var2.f22975q.b(eVar, c0Var2.f22974p.d, ((i) c0Var2.t2()).f.f115083b);
                    this.f23018w = null;
                    this.f23019x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector3);
                    Object objCollect = flowB.collect(new e1(flowCollector3, eVar, 12), this);
                    if (objCollect != aVar3) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar3) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f23018w;
                    boolean zBooleanValue = ((Boolean) this.f23019x).booleanValue();
                    Continuation continuation = null;
                    if (zBooleanValue) {
                        c0 c0Var3 = this.f23020y;
                        MoneyBoxAmountInputScreenContract$InputData moneyBoxAmountInputScreenContract$InputData = c0Var3.f22974p;
                        ybb.d dVar = c0Var3.f22975q;
                        wkm.l lVarQ = vkm.q.Q(dVar.d(moneyBoxAmountInputScreenContract$InputData.f82766a), new u(0, c0Var3, continuation));
                        wkm.l lVarQ2 = vkm.q.Q(new v1(new c34.d(c0Var3, continuation, 11)), new u(1, c0Var3, continuation));
                        bcb.e eVar2 = ((i) c0Var3.t2()).f22992c;
                        flowH = ta6.a.h(lVarQ, lVarQ2, vkm.q.Q(eVar2 != null ? new go.g(eVar2, 2) : dVar.h(moneyBoxAmountInputScreenContract$InputData.f82766a), new u(2, c0Var3, continuation)), new ate.b(c0Var3, continuation, 1));
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowH = vkm.i.f290039a;
                    }
                    this.f23018w = null;
                    this.f23019x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowH, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
