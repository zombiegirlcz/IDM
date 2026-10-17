package sx2;

import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.card_design.impl.card_design.carousel.e eVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.b bVarJ = l93.f.j(eVar.E, null, 3);
            this.u = 1;
            obj2 = nim.a.b(bVarJ, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        Intrinsics.h(list);
        List<h93.f0> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (h93.f0 f0Var : list2) {
                if (f0Var.B() && f0Var.w()) {
                    return eVar.C1(CobrandedCardsFeatureConfig.PlanSwitchDestination.f82505a);
                }
            }
        }
        return eVar.C1(new CobrandedCardsFeatureConfig.CardSelectionDestination.Default((String) null, 1));
    }
}
