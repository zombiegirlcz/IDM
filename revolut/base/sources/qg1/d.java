package qg1;

import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptController;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardSecurityPromptController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CardSecurityPromptController cardSecurityPromptController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardSecurityPromptController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardSecurityPromptController cardSecurityPromptController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cardSecurityPromptController.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) cardSecurityPromptController.O.getValue();
                kVar.getClass();
                kVar.n2(new i(kVar, null, 0), new whi.b(6));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) cardSecurityPromptController.O.getValue();
                int i2 = e.f245621a[kVar2.o.f60874c.ordinal()];
                if (i2 == 1) {
                    kVar2.n2(new i(kVar2, null, 1), new whi.b(6));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mw2.f fVar = kVar2.f245632t;
                    String cardId = ((RetailCardWrapper) ((l) ((j2) kVar2.u.f22677a).getValue()).f245633a).f64443a.f104693a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    kVar2.C1(u0.c(new CardManagementFeatureConfig.CardSelectReplaceReason(cardId, null)));
                }
                return Unit.f186387a;
        }
    }
}
