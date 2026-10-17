package fwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransactionsLimitsScreen transactionsLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsLimitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarD3 = this.v.d();
        RowDelegate.Model.c cVar = model.k;
        Intrinsics.i(cVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowDelegate.Model.Value.Switch");
        boolean z = ((vf) cVar).f54880a;
        Object obj3 = model.u;
        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar2 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) rVarD3;
        if (!(obj3 instanceof OutboundTransactionLimit)) {
            aVar2.getClass();
        } else if (!aVar2.K2()) {
            if (z) {
                oki.h.v2(aVar2.f85752w, TransactionsLimitsScreenContract$Step.LimitDisableConfirmation.f85741a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                aVar2.I2((OutboundTransactionLimit) obj3);
            }
        }
        return Unit.f186387a;
    }
}
