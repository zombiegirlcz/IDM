package xq4;

import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreen;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardDescriptionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreditCardDescriptionScreen creditCardDescriptionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardDescriptionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardDescriptionScreen creditCardDescriptionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.description.a) ((g) creditCardDescriptionScreen.f69206a0.getValue())).u2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.description.a aVar3 = (com.revolut.feature.credit.card.impl.ui.description.a) ((g) creditCardDescriptionScreen.f69206a0.getValue());
                CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData = aVar3.f69212p;
                CreditCardDescriptionScreenContract$InputData.Local local = creditCardDescriptionScreenContract$InputData instanceof CreditCardDescriptionScreenContract$InputData.Local ? (CreditCardDescriptionScreenContract$InputData.Local) creditCardDescriptionScreenContract$InputData : null;
                if (local != null) {
                    CreditCardDescriptionDestination.DescriptionConfig.Local local2 = local.f69209a;
                    if (local2 instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit) {
                        aVar3.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new CreditCardKompotFeatureConfig.Topup(((CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit) local2).f68920b)))));
                    } else {
                        if (!(local2 instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.SpendingLimit) && !(local2 instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit) && !(local2 instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.Apr) && !(local2 instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.LateInterest) && !(local2 instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.PromotionalBalancePeriod)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i2 = jli.h.f175850a;
                    }
                }
                return Unit.f186387a;
        }
    }
}
