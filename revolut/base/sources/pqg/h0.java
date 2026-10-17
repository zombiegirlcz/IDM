package pqg;

import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Continuation continuation) {
        super(1, continuation);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i0 i0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.d0 d0VarFirstOrError = ue0.e.E(m70.a.g(((yua.q) i0Var.G).r(i0Var.u.f94775a.f234881a), null, new pof.e(15), 1), zhm.f0.f322471a).map(new po9.w(15, new u(i0Var, 8))).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            this.u = 1;
            obj2 = nim.a.b(d0VarFirstOrError, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = (RecurringTransferFlowContract$FlowInput) obj2;
        Intrinsics.h(recurringTransferFlowContract$FlowInput);
        return yji.l.i2(i0Var, new RecurringTransferFlow(recurringTransferFlowContract$FlowInput), null, null, 3);
    }
}
