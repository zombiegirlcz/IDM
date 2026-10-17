package rva;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryContract$InputData;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryContract$ModalStep;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryController;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ofm.q;
import tof.a3;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentHistoryController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PaymentHistoryController paymentHistoryController, Continuation continuation) {
        super(2, continuation);
        this.v = paymentHistoryController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.L.getValue();
        Object obj3 = model.u;
        com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a aVar2 = (com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a) bVar;
        aVar2.getClass();
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            if (aVar2.f81669r.b(a3Var)) {
                nva.a aVar3 = aVar2.f81670s;
                PaymentHistoryContract$InputData paymentHistoryContract$InputData = aVar2.o;
                oki.h.v2(aVar2.u, new PaymentHistoryContract$ModalStep.TransactionsPager(a3Var, aVar3.a(paymentHistoryContract$InputData.f81663b, paymentHistoryContract$InputData.f81664c)), ModalDestination.Style.FullscreenPaged.f98310a);
            } else {
                aVar2.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(a3Var), null, null, null, 126))));
            }
        }
        return Unit.f186387a;
    }
}
