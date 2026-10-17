package jr4;

import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
        com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a aVar2 = this.u;
        aVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(finishCommand, new FeatureCommand(new CreditCardKompotFeatureConfig.AutoPaySettings(aVar2.v.f69276a, null)))));
        return Unit.f186387a;
    }
}
