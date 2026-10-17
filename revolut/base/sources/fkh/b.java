package fkh;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$DisplayOptions;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogController;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$ContinueClickParcel;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$ModalStep;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$SeeAllUnsettledBuyOrdersParcel;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$SeeAllUnsettledSellTransactionsParcel;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UnsettledDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UnsettledDialogController unsettledDialogController, Continuation continuation) {
        super(2, continuation);
        this.v = unsettledDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.W.getValue();
        Intrinsics.h(model);
        com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar2 = (com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a) dVar;
        UnsettledDialogInputData unsettledDialogInputData = aVar2.o;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.u;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        boolean zF = Intrinsics.f(obj3, UnsettledDialogControllerContract$SeeAllUnsettledSellTransactionsParcel.f95980a);
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        if (zF) {
            gkh.b bVar = aVar2.f95985s;
            kel.b cashHolding = unsettledDialogInputData.f95927a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
            kel.a aVar4 = cashHolding.f183148a;
            String str = aVar4.f183146b;
            xi0.a aVar5 = xi0.b.Companion;
            String str2 = aVar4.e;
            aVar5.getClass();
            List listC = u.c(xi0.a.a(str2));
            Boolean bool = Boolean.TRUE;
            companion.getClass();
            InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplC = InvestTransactionsFilter.Companion.c(str, listC, bool);
            InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
            oki.h.v2(aVar3, new UnsettledDialogControllerContract$ModalStep.TransactionsList(new InvestTransactionsListContract$InputData(investTransactionsFilterImplC, new InvestTransactionsListContract$DisplayOptions(InvestTransactionsListContract$Disclaimers.Companion.b()))), fullscreen_fade);
        } else if (Intrinsics.f(obj3, UnsettledDialogControllerContract$SeeAllUnsettledBuyOrdersParcel.f95979a)) {
            gkh.a aVar6 = aVar2.f95984r;
            kel.b bVar2 = unsettledDialogInputData.f95927a;
            aVar6.getClass();
            oki.h.v2(aVar3, new UnsettledDialogControllerContract$ModalStep.OrdersList(new InvestOrdersListFeatureContract$InputData.PendingOrders(gkh.a.a(bVar2), null, new InvestOrdersListFeatureContract$InputData.PendingOrders.DisplayOptions(new InvestOrdersListFeatureContract$Disclaimers.Custom(true, false, false)))), fullscreen_fade);
        } else if (Intrinsics.f(obj3, UnsettledDialogControllerContract$ContinueClickParcel.f95976a)) {
            aVar2.B2();
        }
        return Unit.f186387a;
    }
}
