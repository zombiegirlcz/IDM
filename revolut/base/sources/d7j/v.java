package d7j;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$HintDialogReason;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.HintDialogMapper$HintDialogReason;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CommodityOrderEditScreen commodityOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = commodityOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        bw0.m mVar = model.e;
        HintDialogMapper$HintDialogReason lowerLimitError = null;
        Object obj3 = mVar != null ? mVar.e : null;
        if (obj3 instanceof z) {
            z hintClickData = (z) obj3;
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.v.R2();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(hintClickData, "hintClickData");
            CommodityOrderEditScreenContract$HintDialogReason commodityOrderEditScreenContract$HintDialogReason = hintClickData.f112084a;
            if (commodityOrderEditScreenContract$HintDialogReason instanceof CommodityOrderEditScreenContract$HintDialogReason.CryptoUpperLimitError) {
                Amount amount = ((CommodityOrderEditScreenContract$HintDialogReason.CryptoUpperLimitError) commodityOrderEditScreenContract$HintDialogReason).f99824a;
                if (amount != null) {
                    lowerLimitError = new HintDialogMapper$HintDialogReason.UpperLimitError(amount);
                }
            } else if (commodityOrderEditScreenContract$HintDialogReason instanceof CommodityOrderEditScreenContract$HintDialogReason.CryptoLowerLimitError) {
                Amount amount2 = ((CommodityOrderEditScreenContract$HintDialogReason.CryptoLowerLimitError) commodityOrderEditScreenContract$HintDialogReason).f99823a;
                if (amount2 != null) {
                    lowerLimitError = new HintDialogMapper$HintDialogReason.LowerLimitError(amount2);
                }
            } else if (commodityOrderEditScreenContract$HintDialogReason != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (lowerLimitError != null) {
                oki.h.v2(gVar.S, new CommodityOrderEditScreenContract$ModalStep.HintDialog(lowerLimitError), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
