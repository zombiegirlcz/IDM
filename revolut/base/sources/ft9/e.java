package ft9;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ GroupDetailsSettlementScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupDetailsSettlementScreen groupDetailsSettlementScreen, Continuation continuation) {
        super(2, continuation);
        this.u = groupDetailsSettlementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.c0.getValue();
        iVar.getClass();
        iVar.C1(new BridgeDestination(new FeatureCommand(SupportFeatureConfig.f89363a)));
        return Unit.f186387a;
    }
}
