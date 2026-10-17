package fwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransactionsLimitsScreen transactionsLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsLimitsScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar2 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) rVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (d0.J(model.f53228a, "OUTBOUND_LIMIT_LIST_ID_", false)) {
            Object obj3 = model.u;
            OutboundTransactionLimit outboundTransactionLimit = obj3 instanceof OutboundTransactionLimit ? (OutboundTransactionLimit) obj3 : null;
            if (outboundTransactionLimit != null) {
                oki.h.v2(aVar2.f85752w, new TransactionsLimitsScreenContract$Step.DailyLimitInfoDialog(outboundTransactionLimit), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
