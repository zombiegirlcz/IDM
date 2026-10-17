package vyh;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.BalanceBreakdownBottomSheetContract$ClickAction$OpenOrdersInfo;
import com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.BalanceBreakdownBottomSheetContract$ModalStep;
import com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.BalanceBreakdownBottomSheetController;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BalanceBreakdownBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BalanceBreakdownBottomSheetController balanceBreakdownBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = balanceBreakdownBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.a aVar2 = this.v.T;
        if (model.o instanceof BalanceBreakdownBottomSheetContract$ClickAction$OpenOrdersInfo) {
            h.v2(aVar2.f96742q, new BalanceBreakdownBottomSheetContract$ModalStep.RevXOrdersBreakdown(aVar2.o.f293322a.f115083b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
