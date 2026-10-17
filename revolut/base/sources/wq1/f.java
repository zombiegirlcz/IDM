package wq1;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wp5.w;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PagoPABillInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PagoPABillInputScreen pagoPABillInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pagoPABillInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarT2 = this.v.T2();
        String listId = model.f53324a;
        q qVar = (q) lVarT2;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1486167406:
                if (listId.equals("CHOICE_TRAILER_LIST_ID")) {
                    qVar.x2(new w(14));
                }
                break;
            case -579693261:
                if (listId.equals("CHOICE_CAR_LIST_ID")) {
                    qVar.x2(new w(12));
                }
                break;
            case 850105100:
                if (listId.equals("CHOICE_MOTORCYCLE_LIST_ID")) {
                    qVar.x2(new w(13));
                }
                break;
            case 862175631:
                if (listId.equals("CHOICE_NOTICE_NUMBER_LIST_ID")) {
                    qVar.x2(new w(10));
                }
                break;
            case 1391580043:
                if (listId.equals("CHOICE_VEHICLE_LIST_ID")) {
                    qVar.x2(new w(11));
                }
                break;
        }
        j60.a.v(qVar.v, false, null, 3);
        return Unit.f186387a;
    }
}
