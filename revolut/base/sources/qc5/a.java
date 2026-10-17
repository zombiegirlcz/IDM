package qc5;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.crypto.asset.details.impl.dialog.autostaking_confirmation.AutoStakingConfirmationDialogController;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_locked_transactions.StakingLockedTransactionsDialogController;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_rewards.StakingRewardsDialogController;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_risk_disclaimer.StakingRiskDisclaimerDialogController;
import com.revolut.feature.crypto.asset.details.impl.dialog.unstaking_period_disclaimer.UnstakingPeriodDisclaimerDialogController;
import kotlin.jvm.internal.Intrinsics;
import nc5.d;
import nc5.f;
import nc5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof nc5.g) {
            nc5.g gVar = (nc5.g) descriptor;
            return gVar.a(new StakingRiskDisclaimerDialogController(new yc5.b(gVar.f214152a)));
        }
        if (descriptor instanceof f) {
            f fVar = (f) descriptor;
            return fVar.a(new StakingRewardsDialogController(new wc5.b(fVar.f214151a)));
        }
        if (descriptor instanceof nc5.e) {
            nc5.e eVar = (nc5.e) descriptor;
            return eVar.a(new StakingLockedTransactionsDialogController(new uc5.b(eVar.f214150a)));
        }
        if (descriptor instanceof d) {
            d dVar = (d) descriptor;
            return dVar.a(new AutoStakingConfirmationDialogController(new sc5.b(dVar.f214149a)));
        }
        if (!(descriptor instanceof h)) {
            return null;
        }
        h hVar = (h) descriptor;
        return hVar.a(new UnstakingPeriodDisclaimerDialogController(hVar.f214153a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
