package ara;

import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardOwnerMainInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CardOwnerMainInfoScreen cardOwnerMainInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardOwnerMainInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardOwnerMainInfoScreen cardOwnerMainInfoScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cardOwnerMainInfoScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar3 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) cardOwnerMainInfoScreen.d();
                aVar3.v.y();
                aVar3.f81584w.R();
                i iVar = (i) ((j2) aVar3.f81586y.f22677a).getValue();
                CardOwnerInfoState cardOwnerInfoState = iVar.f8601a;
                m mVar = iVar.f8602b;
                Intrinsics.i(mVar, "null cannot be cast to non-null type com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreenContract.EligibilityState.Present");
                aVar3.C2(new p(cardOwnerInfoState, ((k) mVar).f8605a));
                break;
        }
        return Unit.f186387a;
    }
}
