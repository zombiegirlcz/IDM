package e58;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsScreen;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.limits.api.navigation.LimitsFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JointLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JointLimitsScreen jointLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = jointLimitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.Z.getValue();
        Intrinsics.h(model);
        i iVar = (i) bVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (!Intrinsics.f(str, "personal_limits_button_id")) {
            throw new IllegalArgumentException(j6.a.q("Unhandled list item click:", str));
        }
        iVar.C1(new BridgeDestination(new FeatureCommand(iVar.f122786q.a(PricingPlansApi$Toggles.HideLegacyPlanLimits.f81001c) ? new LimitsFeatureConfig.Limits(null, iVar.f122785p, 1) : new KompotPricingPlanFeatureConfig.PlanHubV2(null))));
        return Unit.f186387a;
    }
}
