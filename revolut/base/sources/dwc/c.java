package dwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$ModalStep;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsDayNightLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsDayNightLimitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.O.getValue();
        Intrinsics.h(model);
        com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar2 = (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) gVar;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f85733x;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        boolean zF = Intrinsics.f(str, "BRAZIL_EXCHANGE_YEARLY_LIST_ITEM_ID");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF) {
            oki.h.v2(aVar3, TransactionsDayNightLimitsScreenContract$ModalStep.ForeignCurrencyExchange.f85723a, bottom_dialog);
        } else {
            if (Intrinsics.f(str, "BRAZIL_ANNUAL_LIST_ITEM_ID")) {
                WalletLimit.CounterLimit counterLimit = obj3 instanceof WalletLimit.CounterLimit ? (WalletLimit.CounterLimit) obj3 : null;
                if (counterLimit != null) {
                    oki.h.v2(aVar3, new TransactionsDayNightLimitsScreenContract$ModalStep.AnnualInbound(counterLimit), bottom_dialog);
                }
            } else {
                OutboundTransactionLimit outboundTransactionLimit = obj3 instanceof OutboundTransactionLimit ? (OutboundTransactionLimit) obj3 : null;
                if (outboundTransactionLimit != null) {
                    if (outboundTransactionLimit.f85475a == cuc.f.PENDING) {
                        oki.h.v2(aVar3, new TransactionsDayNightLimitsScreenContract$ModalStep.ChangeRequest(outboundTransactionLimit), bottom_dialog);
                    } else if (outboundTransactionLimit.f85487s != null || outboundTransactionLimit.f85488t) {
                        oki.h.v2(aVar3, new TransactionsDayNightLimitsScreenContract$ModalStep.ReadOnlyLimitDialog(outboundTransactionLimit), bottom_dialog);
                    } else {
                        aVar2.C2(new f(outboundTransactionLimit));
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
