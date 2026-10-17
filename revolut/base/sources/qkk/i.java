package qkk;

import cli.n;
import cli.y;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.UpgradeToInviteFamilyMemberScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends oki.h implements g {
    public final y o;

    public i(n stateMapper, UpgradeToInviteFamilyMemberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f103451a, inputData.f103452b, inputData.f103453c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
