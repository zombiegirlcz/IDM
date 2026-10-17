package j33;

import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityController;
import j33.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ CardExtraSecurityController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CardExtraSecurityController cardExtraSecurityController, Continuation continuation) {
        super(2, continuation);
        this.u = cardExtraSecurityController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b) this.u.e3()).I2(m.c.f170950a);
        return Unit.f186387a;
    }
}
