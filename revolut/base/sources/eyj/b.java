package eyj;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreen;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import gim.i;
import hha.u;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorUpgradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(JuniorUpgradeScreen juniorUpgradeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorUpgradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        int i = this.u;
        JuniorUpgradeScreen juniorUpgradeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                juniorUpgradeScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) ((d) juniorUpgradeScreen.V.getValue());
                fVar.getClass();
                u.Companion.getClass();
                u uVar = u.z;
                JuniorUpgradeScreenContract$InputData juniorUpgradeScreenContract$InputData = fVar.f130870p;
                fVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(uVar, juniorUpgradeScreenContract$InputData.e, new PlanChangeSuccessActionStrategy.NavigateNext(juniorUpgradeScreenContract$InputData.f), false, 1016)))));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) ((d) juniorUpgradeScreen.V.getValue());
                fVar2.getClass();
                try {
                    m.Companion companion = m.INSTANCE;
                    NaviCommand naviCommand = fVar2.f130870p.f101764g;
                    Intrinsics.h(naviCommand);
                    objA = fVar2.C1(new BridgeDestination(naviCommand));
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                Throwable thA = m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                return Unit.f186387a;
        }
    }
}
