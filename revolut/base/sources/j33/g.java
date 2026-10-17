package j33;

import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityController;
import j33.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CardExtraSecurityController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CardExtraSecurityController cardExtraSecurityController, Continuation continuation) {
        super(2, continuation);
        this.u = cardExtraSecurityController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b) this.u.e3()).I2(m.b.f170949a);
        return Unit.f186387a;
    }
}
