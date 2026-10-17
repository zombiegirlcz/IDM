package nd8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_consent.impl.ui.screen.blank_card_delivery.JuniorBlankCardDeliveryConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ JuniorBlankCardDeliveryConsentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorBlankCardDeliveryConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarD3 = this.u.d();
        qVarD3.H2(qVarD3.f214349t, new i(1));
        qVarD3.f214348s.a();
        return Unit.f186387a;
    }
}
