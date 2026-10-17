package l2c;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsSpareChangeFullMultiplierController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsSpareChangeFullMultiplierController revPointsSpareChangeFullMultiplierController, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsSpareChangeFullMultiplierController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierController r7 = r6.v
            l2c.f r7 = r7.R2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a r7 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) r7
            r7.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = r0.f51832a
            java.lang.String r1 = "SPARE_CHANGE_CELL_DELEGATE_BUY_ITEM_ID"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 == 0) goto Lb2
            cli.y r0 = r7.f84180y
            gte.a r1 = r7.f84177t
            com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$LoyaltyScFairValueDisclaimer r2 = com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$LoyaltyScFairValueDisclaimer.f84109c
            jte.d r1 = (jte.d) r1
            boolean r2 = r1.c(r2)
            if (r2 == 0) goto L80
            com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1A r2 = com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1A.f84110c
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            l2c.g r1 = (l2c.g) r1
            com.revolut.data.model.Data r1 = r1.f
            boolean r2 = r1.getLoading()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.getContent()
            if (r2 != 0) goto L55
            goto Lb2
        L55:
            java.lang.Object r1 = r1.getContent()
            l71.d r1 = (l71.d) r1
            if (r1 == 0) goto L80
            boolean r1 = l71.f.c(r1)
            r2 = 1
            if (r1 != r2) goto L80
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.core.backend_flow.api.navigation.BackendFlowDestination r1 = new com.revolut.core.backend_flow.api.navigation.BackendFlowDestination
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput$a r2 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.INSTANCE
            java.lang.String r3 = "rev-points-spare-change-refund-sc-not-active-for-uk-user"
            r4 = 6
            r5 = 0
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput r2 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.Companion.a(r2, r3, r5, r5, r4)
            r1.<init>(r2)
            com.revolut.retail.core.navigation.FeatureCommand r1 = zh9.u0.f(r1)
            r0.<init>(r1)
            r7.C1(r0)
            goto Lb2
        L80:
            java.lang.Object r1 = r0.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            l2c.g r1 = (l2c.g) r1
            com.revolut.data.model.Data r1 = r1.d
            java.lang.Object r1 = r1.getContent()
            com.revolut.feature.rev_points.models.SpareChangeCalculations r1 = (com.revolut.feature.rev_points.models.SpareChangeCalculations) r1
            if (r1 == 0) goto Lb2
            com.revolut.kompot.navigable.vc.modal.a r7 = r7.z
            com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierControllerContract$ModalStep$Breakdown r2 = new com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierControllerContract$ModalStep$Breakdown
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            l2c.g r0 = (l2c.g) r0
            com.revolut.data.model.Data r0 = r0.e
            java.lang.Object r0 = r0.getContent()
            com.revolut.feature.rev_points.models.RevPointsProductRate r0 = (com.revolut.feature.rev_points.models.RevPointsProductRate) r0
            r2.<init>(r1, r0)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r7, r2, r0)
        Lb2:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l2c.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
