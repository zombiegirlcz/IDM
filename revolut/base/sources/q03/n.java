package q03;

import com.revolut.feature_cards_kompot_flows_api.navigation.CardsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e03.b f241093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, e03.b bVar2, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f241093w = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f241093w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            n0 n0Var = bVar.f64912s;
            this.u = 1;
            obj2 = ((h0) n0Var).b(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return bVar.C1(u0.b(new FeatureCommand(new CardsFeatureConfig.ShowCardPinWithCta(28, null, this.f241093w.f121380a.f150110a, ((Boolean) obj2).booleanValue()))));
    }
}
