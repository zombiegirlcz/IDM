package n48;

import aii.p;
import aii.u;
import aii.x;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsBereavement;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsPendingState;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsProductCatalogMigration;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsPush2Card;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointLinkedOBTopups;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointMcyErrorGuardian;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointOnboardingWorkflow;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointSavingsOnboardingRevamp;
import com.revolut.feature.joint.api.navigation.JointAccountCreationDestination;
import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig;
import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$Close$Destination;
import com.revolut.feature.joint.api.navigation.PendingJointAccountBottomSheetDestination;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlow;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$InputData;
import com.revolut.feature.joint.impl.ui.creation_flow.JointAccountCreationFlow;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlow;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$InputData;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlow;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsContract$InputData;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsFlow;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawContract$InputData;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawScreen;
import gim.c;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import she.g;
import w38.f;
import w38.t;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f212335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f212336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f212337c;

    public a(ImmutableSet deeplinkGateways, g productAccountDestinationResolver, t pendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        this.f212335a = deeplinkGateways;
        this.f212336b = productAccountDestinationResolver;
        this.f212337c = pendingAccountBottomSheetProvider;
    }

    @Override // aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final Object d(x xVar, Continuation continuation) {
        if (!(xVar instanceof f)) {
            return null;
        }
        zfe.f fVar = zfe.g.Companion;
        Object objC = this.f212336b.c(((f) xVar).f294175a, null, (c) continuation);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : (u) objC;
    }

    @Override // nte.a
    public final List e() {
        return v.k(JointAccountsApi$Toggles$JointAccountsPush2Card.f76460c, JointAccountsApi$Toggles$JointLinkedOBTopups.f76461c, JointAccountsApi$Toggles$JointOnboardingWorkflow.f76463c, JointAccountsApi$Toggles$JointSavingsOnboardingRevamp.f76464c, JointAccountsApi$Toggles$JointMcyErrorGuardian.f76462c, JointAccountsApi$Toggles$JointAccountsProductCatalogMigration.f76459c, JointAccountsApi$Toggles$JointAccountsBereavement.f76457c, JointAccountsApi$Toggles$JointAccountsPendingState.f76458c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JointAccountsFeatureConfig.WithdrawFlow.Destination) {
            JointAccountsFeatureConfig.WithdrawFlow.Destination destination2 = (JointAccountsFeatureConfig.WithdrawFlow.Destination) destination;
            return new JointWithdrawScreen(new JointWithdrawContract$InputData(destination2.f76498a, destination2.f76499b));
        }
        if (destination instanceof JointAccountsFeatureConfig.Invite.Destination) {
            JointAccountsFeatureConfig.Invite.Destination destination3 = (JointAccountsFeatureConfig.Invite.Destination) destination;
            return new InviteFlow(new InviteFlowContract$InputData(destination3.f76492a, destination3.f76493b));
        }
        if (destination instanceof JointAccountsFeatureConfig$Close$Destination) {
            JointAccountsFeatureConfig$Close$Destination jointAccountsFeatureConfig$Close$Destination = (JointAccountsFeatureConfig$Close$Destination) destination;
            return new JointCloseFlow(new JointCloseFlowContract$InputData(jointAccountsFeatureConfig$Close$Destination.f76487a, jointAccountsFeatureConfig$Close$Destination.f76488b));
        }
        if (destination instanceof JointAccountsFeatureConfig.Limits.Destination) {
            return new JointLimitsFlow(new JointLimitsContract$InputData(((JointAccountsFeatureConfig.Limits.Destination) destination).f76495a));
        }
        if (destination instanceof JointAccountsFeatureConfig.Deeplink) {
            return new JointDeeplinkFlow(new JointDeeplinkFlowContract$InputData(((JointAccountsFeatureConfig.Deeplink) destination).f76489a));
        }
        if (destination instanceof JointAccountCreationDestination) {
            return new JointAccountCreationFlow(new v48.c(((JointAccountCreationDestination) destination).f76486a));
        }
        if (!(destination instanceof PendingJointAccountBottomSheetDestination)) {
            return null;
        }
        return this.f212337c.a(((PendingJointAccountBottomSheetDestination) destination).f76502a);
    }

    @Override // aii.p
    public final Set h() {
        return this.f212335a;
    }
}
