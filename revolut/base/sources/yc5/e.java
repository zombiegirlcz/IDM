package yc5;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.staking.api.model.StakingModes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud.a f312538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f312539b;

    public e(aud.a stakingRisksDisclaimersMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stakingRisksDisclaimersMapper, "stakingRisksDisclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f312538a = stakingRisksDisclaimersMapper;
        this.f312539b = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        StakingModes.StakingMode stakingMode = domainState.f312534a;
        List listB = ((iwd.b) this.f312538a).b(stakingMode);
        boolean zC = ((jte.d) this.f312539b).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.crypto_staking_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listB, new lw0.a((zC && (stakingMode instanceof StakingModes.Manual)) ? new TextLocalisedClause(com.revolut.retail.feature.crypto.asset_details.api.R$string.wealthcore_currency_details_staking_info_title_locked_earn, null, null, 14) : (zC && (stakingMode instanceof StakingModes.Auto)) ? new TextLocalisedClause(com.revolut.retail.feature.crypto.asset_details.api.R$string.wealthcore_currency_details_staking_info_title_auto_earn, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.crypto.asset_details.api.R$string.crypto_asset_details_staking_v2_info_title, null, null, 14), null, null, null, false, 30));
    }
}
