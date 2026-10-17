package ucb;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.private_banking.api.navigation.DepositAssetsDestination;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.DepositAssetsFlow;
import com.revolut.retail.feature.api.userauth.navigation.sso_app_unlock.RetailRevolutSsoDestination$UnlockAppWithBiometrics;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.RetailRevolutSsoAccessRecoveryWrapperFlow;
import dki.g;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ycb.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f279021b;

    public b(ImmutableSet deeplinkGateways, int i) {
        this.f279020a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f279021b = deeplinkGateways;
                break;
            default:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f279021b = deeplinkGateways;
                break;
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        switch (this.f279020a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof DepositAssetsDestination) {
                    return new DepositAssetsFlow(new c(((DepositAssetsDestination) destination).f82792a));
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof RetailRevolutSsoDestination$UnlockAppWithBiometrics) {
                    return new RetailRevolutSsoAccessRecoveryWrapperFlow();
                }
                return null;
        }
    }

    @Override // aii.p
    public final Set h() {
        switch (this.f279020a) {
        }
        return this.f279021b;
    }
}
