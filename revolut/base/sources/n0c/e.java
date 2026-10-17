package n0c;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsTransactionDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsTransactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar = (com.revolut.feature.rev_points.impl.ui.transactions.details.b) this.u.R2();
        bVar.getClass();
        bVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter((String) null, 3))));
        return Unit.f186387a;
    }
}
