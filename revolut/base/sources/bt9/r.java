package bt9;

import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ w u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, Continuation continuation) {
        super(1, continuation);
        this.u = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVar = this.u;
        oq9.i iVar = wVar.B2().f18466b;
        if (iVar instanceof oq9.g) {
            oq9.g gVar = (oq9.g) iVar;
            yji.l.i2(wVar, new PaymentsGroupsBillsEditFlow(new PaymentsGroupsBillsEditFlowContract$InputData.EditBill(wVar.B2().f18465a, gVar, new BillType.CustomBill(gVar.d, gVar.f227817c))), null, null, 3);
        } else {
            if (!(iVar instanceof oq9.h)) {
                throw new NoWhenBranchMatchedException();
            }
            wVar.l2(new s(wVar, (oq9.h) iVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
