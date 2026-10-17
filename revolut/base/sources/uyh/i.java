package uyh;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.recurring_buys.schedule.api.models.RecurringBuySettings;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoExchangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CryptoExchangeScreen cryptoExchangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoExchangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CryptoOrderDraft cryptoOrderDraft;
        CryptoOrderDraft cryptoOrderDraft2;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) oVarR2;
        cli.y yVar = dVar.K;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51781a;
        int iHashCode = str.hashCode();
        if (iHashCode != -948948774) {
            if (iHashCode != -621688904) {
                if (iHashCode == 553155155 && str.equals("TAKE_PROFIT_STOP_LOSS_TITLE_LIST_ID") && (cryptoOrderDraft2 = ((j) ((j2) dVar.K.f22677a).getValue()).f284369a) != null) {
                    dVar.n2(new com.revolut.feature_crypto_order_flow.impl.exchange.b(dVar, cryptoOrderDraft2, null), new whi.b(6));
                }
            } else if (str.equals("LIMIT_LIST_ID") && (cryptoOrderDraft = ((j) ((j2) yVar.f22677a).getValue()).f284369a) != null) {
                dVar.n2(new com.revolut.feature_crypto_order_flow.impl.exchange.c(cryptoOrderDraft, dVar, cryptoOrderDraft.f, null), new whi.b(6));
            }
        } else if (str.equals("RECURRING_LIST_ID")) {
            RecurringBuySettings recurringBuySettings = ((j) ((j2) yVar.f22677a).getValue()).e;
            oki.h.v2(dVar.L, new CryptoExchangeScreenContract$ModalStep.RecurringSettings(recurringBuySettings.f81644a, recurringBuySettings.f81645b), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
