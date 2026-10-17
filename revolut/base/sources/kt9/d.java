package kt9;

import aii.q;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.a u;
    public final /* synthetic */ PaymentGroup v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.a aVar, PaymentGroup paymentGroup, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
        this.v = paymentGroup;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        q qVar = q.f5292a;
        com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.a aVar2 = this.u;
        aVar2.G2(qVar);
        aVar2.C1(new BridgeDestination(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))), new FeatureCommand(new PaymentsGroupsRedesignFeatureConfig.GroupDetails(this.v, false)))));
        return Unit.f186387a;
    }
}
