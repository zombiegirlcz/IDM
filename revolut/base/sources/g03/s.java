package g03;

import com.revolut.feature.cards.models.exceptions.CardLimitReachedException;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
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
    public final Object invokeSuspend(Object obj2) throws CardLimitReachedException.DailyLimitReached {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = bVar.J2(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return bVar.C1(u0.b(new FeatureCommand(new CardsFeatureConfig.ChangeCardLabel(2, ((f0) obj2).f150110a, new Integer(10013)))));
    }
}
