package yej;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.installation.EsimInstallationFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.installation.EsimInstallationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.EsimShareQrCodeFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.subscription.EsimSubscriptionFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.subscription.EsimSubscriptionFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_freeze_info.EsimMobilePlanEsimFreezeInfoScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f313028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fej.b f313029b;

    public c(ImmutableSet deeplinkGateways, xej.a debugFlowProvider, fej.b esimHomeFlowCommandProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(debugFlowProvider, "debugFlowProvider");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        this.f313028a = deeplinkGateways;
        this.f313029b = esimHomeFlowCommandProvider;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof fej.a) {
            return ((fej.a) descriptor).a(new EsimMobilePlanEsimFreezeInfoScreen());
        }
        if (!(descriptor instanceof fej.c)) {
            return null;
        }
        fej.c cVar = (fej.c) descriptor;
        return cVar.a(new EsimInstallationFlow(new EsimInstallationFlowContract$InputData(cVar.b().getF100552a(), cVar.b().getF100553b(), cVar.b().getF100554c())));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yej.b
            if (r0 == 0) goto L13
            r0 = r6
            yej.b r0 = (yej.b) r0
            int r1 = r0.f313027w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f313027w = r1
            goto L1a
        L13:
            yej.b r0 = new yej.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f313027w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r5 = r5 instanceof tej.b
            if (r5 == 0) goto L4a
            r0.f313027w = r3
            fej.b r5 = r4.f313029b
            java.lang.Object r6 = fej.b.a(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            return r5
        L4a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yej.c.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return EsimApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof EsimFeatureConfig.HomeDestination) {
            return new EsimHomeFlow(new EsimHomeFlowContract$InputData(new EsimHomeFlowContract$InputData.InitialDestination.Subscriptions((EsimHomeFlowContract$InputData.InitialDestination.PreferredView) null, ((EsimFeatureConfig.HomeDestination) destination).f100544c, 1)));
        }
        if (destination instanceof EsimFeatureConfig.GetPlanDestination) {
            EsimFeatureConfig.GetPlanDestination getPlanDestination = (EsimFeatureConfig.GetPlanDestination) destination;
            return new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.Purchase(getPlanDestination.f100538a, getPlanDestination.f100539b, getPlanDestination.f100540c, null, 8));
        }
        if (destination instanceof EsimFeatureConfig.SubscriptionDestination) {
            return new EsimSubscriptionFlow(new EsimSubscriptionFlowContract$InputData(((EsimFeatureConfig.SubscriptionDestination) destination).f100550a));
        }
        if (destination instanceof EsimFeatureConfig.MobilePlanSubscriptionDestination) {
            return new EsimMobilePlanSubscriptionFlow(new EsimMobilePlanSubscriptionFlowContract$InputData(((EsimFeatureConfig.MobilePlanSubscriptionDestination) destination).getF100546a()));
        }
        if (destination instanceof EsimFeatureConfig.DebugDestination) {
            return null;
        }
        if (destination instanceof EsimFeatureConfig.RefundDestination) {
            EsimRefundFlow esimRefundFlow = new EsimRefundFlow(new EsimRefundFlowContract$InputData(EsimRefundFlowContract$EsimSubscriptionsToRefund.AllAvailable.f100866a));
            fxj.b block = new fxj.b(flowModel, 3);
            Intrinsics.checkNotNullParameter(block, "block");
            esimRefundFlow.H = block;
            return esimRefundFlow;
        }
        if (destination instanceof EsimFeatureConfig.GiftingDestination) {
            return new EsimHomeFlow(new EsimHomeFlowContract$InputData(EsimHomeFlowContract$InputData.InitialDestination.Gifting.f100646a));
        }
        if (destination instanceof EsimFeatureConfig.SharingDestination) {
            return new EsimShareQrCodeFlow(new EsimShareQrCodeScreenContract$InputData(((EsimFeatureConfig.SharingDestination) destination).getF100548b()));
        }
        if (destination instanceof EsimFeatureConfig.ConnectivityTroubleshootingDestination) {
            return new EsimConnectivityTroubleshootingFlow(new EsimConnectivityTroubleshootingFlowContract$InputData(((EsimFeatureConfig.ConnectivityTroubleshootingDestination) destination).getF100534a()));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f313028a;
    }
}
