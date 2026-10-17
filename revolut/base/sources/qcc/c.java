package qcc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsController;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPayPromotedMerchantsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevolutPayPromotedMerchantsController revolutPayPromotedMerchantsController, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPayPromotedMerchantsController;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        m mVar = (m) fVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof PromotedMerchant) {
            ((occ.m) mVar.f244704q).Z2((PromotedMerchant) obj3);
        }
        return Unit.f186387a;
    }
}
