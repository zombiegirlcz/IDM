package m9j;

import aw0.o9;
import aw0.q0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import ix0.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import m9d.l0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();
    public static final TextClause f = new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd5.a f203822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he2.b f203823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cd5.g f203824c;
    public final wwd.d d;
    public final gte.a e;

    public r(cd5.a pnlMapper, he2.b performanceMapper, cd5.g stakingRewardsMapper, wwd.d tiersRateItemMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pnlMapper, "pnlMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(stakingRewardsMapper, "stakingRewardsMapper");
        Intrinsics.checkNotNullParameter(tiersRateItemMapper, "tiersRateItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f203822a = pnlMapper;
        this.f203823b = performanceMapper;
        this.f203824c = stakingRewardsMapper;
        this.d = tiersRateItemMapper;
        this.e = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar = domainState.f203801a;
        TextLocalisedClause textLocalisedClause = ((jte.d) this.e).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c) ? new TextLocalisedClause(R$string.crypto_asset_details_section_investment_main, null, null, 14) : new TextLocalisedClause(R$string.crypto_asset_details_section_investment_holding, null, null, 14);
        CurrencyClause currencyClauseA = d0.a(bVar, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254));
        CurrencyImage currencyImage = new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        Data data = domainState.d;
        if (data == null || (list = (List) iii.c.f(data, new l0(this, 25), new j1(1), new m88.c(this, domainState, 1))) == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        q0 q0Var = domainState.f;
        StakingProduct stakingProduct = domainState.f203802b;
        return new l(q0Var, currencyClauseA, textLocalisedClause, currencyImage, (stakingProduct == null || !stakingProduct.b() || (!stakingProduct.d() && (domainState.f203803c != null || stakingProduct.c()))) ? f0.f322471a : u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "INFO_MENU_ITEM_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)), list2);
    }
}
