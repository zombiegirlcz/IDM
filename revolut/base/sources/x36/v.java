package x36;

import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ y u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, Continuation continuation) {
        super(2, continuation);
        this.u = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVar = this.u;
        DeFiExchangeOrderDraft deFiExchangeOrderDraft = ((a) ((j2) yVar.A.f22677a).getValue()).f302659a;
        if (deFiExchangeOrderDraft == null) {
            return Unit.f186387a;
        }
        FundingSource fundingSource = deFiExchangeOrderDraft.f;
        DeFiAssetDetails deFiAssetDetails = deFiExchangeOrderDraft.e;
        int i = u.f302683a[yVar.o.f71758c.ordinal()];
        if (i == 1) {
            deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy = new DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy(fundingSource.getF92240a(), z0.h(deFiAssetDetails.f71665a.f71671a));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy = new DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell(deFiAssetDetails.f71665a.f71671a, y0.b(fundingSource.f92241b.f306286a));
        }
        oki.h.v2(yVar.z, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
