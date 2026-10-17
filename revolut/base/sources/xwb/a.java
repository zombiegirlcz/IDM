package xwb;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.RevPointsGiftCardPurchaseScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import twb.u;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftCardPurchaseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RevPointsGiftCardPurchaseScreen revPointsGiftCardPurchaseScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftCardPurchaseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarM3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) fVarM3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        VoucherProduct voucherProduct = (VoucherProduct) model.f51674g;
        if (voucherProduct != null) {
            aVar2.H2(aVar2.u, new u(voucherProduct, 2));
        }
        return Unit.f186387a;
    }
}
