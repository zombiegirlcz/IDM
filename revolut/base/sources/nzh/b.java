package nzh;

import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature_crypto_order_flow.impl.order_summary.models.ExchangeStakingData;
import com.revolut.feature_exchange.api.R$string;
import i4b.f;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.u1;
import nii.v1;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f221063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ttd.a f221064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f221065c;

    public b(gte.a featureToggleInteractor, f cryptoSpareChangeFeatureChecker, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeFeatureChecker, "cryptoSpareChangeFeatureChecker");
        this.f221063a = featureToggleInteractor;
        this.f221064b = stakingInterestRateFormatter;
        this.f221065c = cryptoSpareChangeFeatureChecker;
    }

    public final Pair a(AccountId accountId, boolean z, ExchangeStakingData exchangeStakingData, boolean z3) {
        Pair pair;
        StakingAvailability stakingAvailability;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        boolean z4 = accountId instanceof AccountId.Personal;
        u1.b bVar = u1.b.f216225a;
        if (!z4) {
            return new Pair(bVar, "ID_NO_BUTTON");
        }
        StakingProduct stakingProduct = (exchangeStakingData == null || (stakingAvailability = exchangeStakingData.f96800b) == null) ? null : stakingAvailability.f88058a;
        if (stakingProduct == null || !this.f221063a.a(StakingApi$FeatureToggles.StakeBlocked.f88057c)) {
            pair = (z3 && this.f221065c.i()) ? new Pair(new TextLocalisedClause(R$string.fx_orders_enable_spare_change, null, null, 14), "ID_BUTTON_SET_CRYPTO_SPARE_CHANGE") : z ? new Pair(new TextLocalisedClause(R$string.fx_orders_set_recurring_buy, null, null, 14), "ID_BUTTON_SET_CRYPTO_RECURRING_BUY") : null;
        } else {
            List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_arrow_upgrade, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.fx_orders_stake, u.c(((wud.b) this.f221064b).c(stakingProduct.f88087b.f88060a, true, null)), null, 12));
            m70.a.t(t0.f186434a);
            pair = new Pair(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), "ID_BUTTON_STAKE");
        }
        return pair == null ? new Pair(bVar, "ID_NO_BUTTON") : new Pair(new v1((Clause) pair.f186385a, null), (String) pair.f186386b);
    }
}
