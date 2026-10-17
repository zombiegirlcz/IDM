package nd8;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.junior_consent.impl.ui.screen.blank_card_delivery.JuniorBlankCardDeliveryConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ JuniorBlankCardDeliveryConsentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorBlankCardDeliveryConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarD3 = this.u.d();
        qVarD3.getClass();
        qVarD3.n2(new p(qVarD3, null, 0), new whi.b(6));
        return Unit.f186387a;
    }
}
