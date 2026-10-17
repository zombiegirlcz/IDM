package rj7;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ CFACInsuranceCoverageInfoScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CFACInsuranceCoverageInfoScreen cFACInsuranceCoverageInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cFACInsuranceCoverageInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) ((k) this.u.Y.getValue());
        mVar.C1(new BridgeDestination(new FeatureCommand(new CFACInsuranceFeatureConfig.Documents(((j) mVar.t2()).f254625c.f74988a, ((j) mVar.t2()).d, ((j) mVar.t2()).f254624b, null))));
        return Unit.f186387a;
    }
}
