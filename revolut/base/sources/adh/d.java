package adh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterValueId;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final Clause a(InstrumentsCollectionFilterValueId instrumentsCollectionFilterValueId) {
        Intrinsics.checkNotNullParameter(instrumentsCollectionFilterValueId, "<this>");
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsIssuerGovernment.f95306a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_issuer_government, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsIssuerCorporate.f95304a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_issuer_corporate, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsCreditQualityInvestmentGrade.f95303a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_credit_quality_investment_grade, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsCreditQualityHighYield.f95302a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_credit_quality_high_yield, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsMaturityTypeFixed.f95308a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_type_fixed, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsMaturityTypeCallable.f95307a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_type_callable, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsMaturityTypePerpetual.f95309a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_type_perpetual, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsCouponTypeFixed.f95299a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_coupon_type_fixed, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsCouponTypeFloating.f95300a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_coupon_type_floating, null, null, 14);
        }
        if (Intrinsics.f(instrumentsCollectionFilterValueId, InstrumentsCollectionFilterValueId.BondsCouponTypeZero.f95301a)) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_coupon_type_zero, null, null, 14);
        }
        if (instrumentsCollectionFilterValueId instanceof InstrumentsCollectionFilterValueId.BondsIssuerCountry) {
            return new CountryClause(((InstrumentsCollectionFilterValueId.BondsIssuerCountry) instrumentsCollectionFilterValueId).f95305a, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause b(InstrumentsCollectionFilterId instrumentsCollectionFilterId) {
        Intrinsics.checkNotNullParameter(instrumentsCollectionFilterId, "<this>");
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.ISSUER) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_issuer_title, null, null, 14);
        }
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.CREDIT_QUALITY) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_credit_quality_title, null, null, 14);
        }
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.YIELD_TO_MATURITY) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_yield_to_maturity_title, null, null, 14);
        }
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.MATURITY_TYPE) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_type_title, null, null, 14);
        }
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.MATURITY) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_title, null, null, 14);
        }
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.COUPON_TYPE) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_coupon_type_title, null, null, 14);
        }
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.ISSUER_COUNTRY) {
            return new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_issuer_country_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final InstrumentsCollectionFilter.ListFilter.Value c(InstrumentsCollectionFilter.ListFilter.Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        boolean z = !value.f95293b;
        InstrumentsCollectionFilterValueId id10 = value.f95292a;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new InstrumentsCollectionFilter.ListFilter.Value(id10, z);
    }
}
