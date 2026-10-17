package m1i;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f201536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f201537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4b.f f201538c;

    public h0(gte.a featureToggleInteractor, i4b.f cryptoSpareChangeFeatureChecker, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeFeatureChecker, "cryptoSpareChangeFeatureChecker");
        this.f201536a = stakingInterestRateFormatter;
        this.f201537b = featureToggleInteractor;
        this.f201538c = cryptoSpareChangeFeatureChecker;
    }

    public static TextLocalisedClause a(dj0.d dVar, dj0.d dVar2, wd6.e eVar) {
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
        MoneyClause moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
        MoneyClause moneyClause2 = new MoneyClause(dVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
        int i = g0.f201534a[eVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.exchange_result_success_title_buy_format, zhm.v.k(moneyClause, moneyClause2), null, 12);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.exchange_result_success_title_sell_format, zhm.v.k(moneyClause2, moneyClause), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
