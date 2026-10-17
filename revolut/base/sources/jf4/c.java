package jf4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.OfferUpsellScreen;
import ff4.b0;
import ff4.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ OfferUpsellScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OfferUpsellScreen offerUpsellScreen, Continuation continuation) {
        super(2, continuation);
        this.u = offerUpsellScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b0 b0Var = (b0) this.u.R2();
        b0Var.H2(b0Var.f134712t, new u(b0Var, 1));
        b0Var.M2();
        return Unit.f186387a;
    }
}
