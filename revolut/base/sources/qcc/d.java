package qcc;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qcc.g;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ RevolutPayPromotedMerchantsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevolutPayPromotedMerchantsController revolutPayPromotedMerchantsController, Continuation continuation) {
        super(2, continuation);
        this.u = revolutPayPromotedMerchantsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((m) this.u.d()).C2(g.a.f244693a);
        return Unit.f186387a;
    }
}
