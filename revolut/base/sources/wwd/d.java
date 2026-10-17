package wwd;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.staking.api.model.StakingInterestRate;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$EarnRateParcel;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$NoTiersParcel;
import ip0.x5;
import ip0.y5;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f300646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f300647b;

    public d(gte.a featureToggleInteractor, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f300646a = stakingInterestRateFormatter;
        this.f300647b = featureToggleInteractor;
    }

    public final CellDetailsActionDelegate.Model a(BigDecimal bigDecimal, StakingProduct stakingProduct, wi0.b bVar, TextLocalisedClause textLocalisedClause) {
        return new CellDetailsActionDelegate.Model("EARN_CELL_DETAILS_DELEGATE_LIST_ID", ((jte.d) this.f300647b).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c) ? textLocalisedClause : new TextLocalisedClause(R$string.staking_tier_rates_item_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), ((wud.b) this.f300646a).b(bigDecimal, true), null, false, true, null, null, new TiersRateItemMapper$NoTiersParcel(stakingProduct, bVar), 0, 0, 0, 0, 4192100);
    }

    public final CellDetailsActionDelegate.Model b(StakingProduct stakingProduct, dj0.d dVar, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        StakingInterestRate stakingInterestRateA = stakingProduct.a(pyd.c.M(dVar));
        boolean zK = pyd.c.M(dVar).k();
        boolean z = stakingProduct.f;
        StakingInterestRate stakingInterestRate = stakingProduct.f88089g;
        boolean zF = Intrinsics.f(stakingInterestRateA, stakingInterestRate);
        boolean zQ = com.bumptech.glide.d.q(bVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.staking_tier_rates_item_title, null, null, 14);
        ttd.a aVar = this.f300646a;
        CompositeClause compositeClauseC = ((wud.b) aVar).c(stakingInterestRateA, true, null);
        if (zQ || z) {
            return new CellDetailsActionDelegate.Model("EARN_CELL_DETAILS_DELEGATE_LIST_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), compositeClauseC, null, false, true, null, null, new TiersRateItemMapper$NoTiersParcel(stakingProduct, bVar), 0, 0, 0, 0, 4192100);
        }
        if (zF) {
            return new CellDetailsActionDelegate.Model("EARN_CELL_DETAILS_DELEGATE_LIST_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), compositeClauseC, null, false, true, null, new x5(), new TiersRateItemMapper$EarnRateParcel(stakingProduct, dVar), 0, 0, 0, 0, 4191588);
        }
        if (!zK) {
            return new CellDetailsActionDelegate.Model("EARN_CELL_DETAILS_DELEGATE_LIST_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_arrow_upgrade, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), compositeClauseC, null, false, true, null, new y5(), new TiersRateItemMapper$EarnRateParcel(stakingProduct, dVar), 0, 0, 0, 0, 4191588);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.staking_tier_rates_item_up_to, u.c(((wud.b) aVar).c(stakingInterestRate, true, null)), null, 12);
        return new CellDetailsActionDelegate.Model("EARN_CELL_DETAILS_DELEGATE_LIST_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_arrow_upgrade, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), textLocalisedClause2, null, false, true, null, new y5(), new TiersRateItemMapper$EarnRateParcel(stakingProduct, dVar), 0, 0, 0, 0, 4191588);
    }
}
