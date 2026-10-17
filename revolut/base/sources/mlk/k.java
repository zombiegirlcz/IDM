package mlk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanCancelFeaturesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PlanCancelFeaturesScreen planCancelFeaturesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planCancelFeaturesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.ListSubheaderDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen r6 = r5.v
            mlk.x r6 = r6.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            mlk.h0 r6 = (mlk.h0) r6
            r6.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = r0.f52708a
            int r1 = r0.hashCode()
            r2 = -772998886(0xffffffffd1ecf91a, float:-1.2722394E11)
            if (r1 == r2) goto L56
            r2 = 1403137131(0x53a22c6b, float:1.3930598E12)
            if (r1 == r2) goto L4d
            r2 = 1889061609(0x7098cae9, float:3.782962E29)
            if (r1 == r2) goto L32
            goto L5e
        L32:
            java.lang.String r1 = "ID_OFFERS_SUBHEADER_ITEM"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3b
            goto L5e
        L3b:
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            skk.a r1 = r6.f207010q
            r1.getClass()
            com.revolut.retail.core.navigation.FeatureCommand r1 = skk.a.b()
            r0.<init>(r1)
            r6.C1(r0)
            goto La5
        L4d:
            java.lang.String r1 = "BENEFITS_SUB_HEADER_ID"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5e
            goto L71
        L56:
            java.lang.String r1 = "ID_TOP_BENEFITS_SUBHEADER_ITEM"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L71
        L5e:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "Click not handled, listId = "
            java.lang.String r0 = r2.concat(r0)
            r2 = 0
            java.lang.String r3 = "PlanCancelFeaturesScreen"
            rd0.d.a(r1, r3, r0, r2, r6)
            goto La5
        L71:
            cli.y r0 = r6.E
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            mlk.v r0 = (mlk.v) r0
            com.revolut.data.model.Data r0 = r0.f207028b
            java.lang.Object r0 = r0.getContent()
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r0 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r0
            if (r0 == 0) goto La5
            hha.d r0 = r0.f81129a
            if (r0 == 0) goto La5
            java.lang.String r0 = r0.f152287a
            if (r0 != 0) goto L90
            goto La5
        L90:
            com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination r1 = new com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference$Id r2 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference$Id
            r2.<init>(r0)
            xfa.b r0 = xfa.b.DOWNGRADE
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig r3 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig
            r4 = 1
            r3.<init>(r4)
            r1.<init>(r2, r0, r3)
            r6.C1(r1)
        La5:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mlk.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
