package t73;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.navigation.CardsListFeatureConfig;
import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class t1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CheckoutOrder f268543w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, CheckoutOrder checkoutOrder, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f268543w = checkoutOrder;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t1(this.v, this.f268543w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            h93.f0 f0Var = (h93.f0) ((q0) ((vkm.j2) gVar.f65434h0.f22677a).getValue()).d.f224257a;
            AccountId accountIdQ2 = f0Var != null ? gVar.Q2(f0Var) : null;
            if (accountIdQ2 != null) {
                pfm.h hVarH = ((ei3.m) gVar.K).h(this.f268543w, accountIdQ2);
                this.u = 1;
                if (nim.a.a(hVarH, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        gVar.C1(zh9.u0.c(new CardsListFeatureConfig.CardsList(n63.g.OrderCancelled)));
        return Unit.f186387a;
    }
}
