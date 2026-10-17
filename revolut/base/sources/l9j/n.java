package l9j;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import java.util.List;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd5.d f193268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd5.g f193269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wwd.d f193270c;
    public final gte.a d;

    public n(cd5.d stakingDetailsMapper, cd5.e stakingLockedBalanceItemMapper, cd5.g stakingRewardsMapper, wwd.d tiersRateItemMapper, cd5.h unstakingPeriodItemMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stakingDetailsMapper, "stakingDetailsMapper");
        Intrinsics.checkNotNullParameter(stakingLockedBalanceItemMapper, "stakingLockedBalanceItemMapper");
        Intrinsics.checkNotNullParameter(stakingRewardsMapper, "stakingRewardsMapper");
        Intrinsics.checkNotNullParameter(tiersRateItemMapper, "tiersRateItemMapper");
        Intrinsics.checkNotNullParameter(unstakingPeriodItemMapper, "unstakingPeriodItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f193268a = stakingDetailsMapper;
        this.f193269b = stakingRewardsMapper;
        this.f193270c = tiersRateItemMapper;
        this.d = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(domainState.f193256c, new CurrencyClause(domainState.f193254a.f88082b.d, CurrencyClause.Format.Ticker.f57756a, null, 4), ((jte.d) this.d).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c) ? new TextLocalisedClause(R$string.crypto_details_section_investment_lockedEarning, null, null, 14) : new TextLocalisedClause(R$string.crypto_asset_details_section_investment_earning, null, null, 14), new CurrencyImage(domainState.f193254a.f88082b.d.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "INFO_MENU_ITEM_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)), (List) iii.c.f(domainState.f193255b, new k(this, 2), new j(1), new y(this, domainState, 9)));
    }
}
