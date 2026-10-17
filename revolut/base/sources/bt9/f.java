package bt9;

import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GroupDetailsBillScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GroupDetailsBillScreen groupDetailsBillScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = groupDetailsBillScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            default:
                return new f(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((oq9.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        GroupDetailsBillScreen groupDetailsBillScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                groupDetailsBillScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((w) groupDetailsBillScreen.T2()).f18481x, false, null, 3);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) groupDetailsBillScreen.T2();
                oq9.i iVar = wVar.B2().f18466b;
                if (iVar instanceof oq9.g) {
                    oq9.g gVar = (oq9.g) iVar;
                    yji.l.i2(wVar, new PaymentsGroupsBillsEditFlow(new PaymentsGroupsBillsEditFlowContract$InputData.EditSplits(wVar.B2().f18465a, iVar, new BillType.CustomBill(gVar.d, gVar.f227817c))), null, null, 3);
                } else {
                    if (!(iVar instanceof oq9.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wVar.l2(new s(wVar, (oq9.h) iVar, null), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar2 = (w) groupDetailsBillScreen.T2();
                j60.a.v(wVar2.f18481x, false, null, 3);
                wVar2.l2(new aza.g(wVar2, continuation, 28), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
