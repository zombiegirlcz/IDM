package adh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zzg.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public static final int a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int i = e.f3352a[sVar.ordinal()];
        if (i == 1) {
            return R$drawable.uikit_icn_24_arrow_thin_up;
        }
        if (i == 2) {
            return R$drawable.uikit_icn_24_arrow_thin_down;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause b(InstrumentsCollectionSortOption instrumentsCollectionSortOption) {
        Intrinsics.checkNotNullParameter(instrumentsCollectionSortOption, "<this>");
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.AlphabeticalOrder) {
            return new TextLocalisedClause(R$string.wealth_trading_assets_sorting_alphabetical, null, null, 14);
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.MostOwned) {
            return new TextLocalisedClause(R$string.wealth_trading_assets_sorting_mostOwned, null, null, 14);
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.RemainingYears) {
            return new TextLocalisedClause(R$string.wealth_trading_assets_sorting_remainingYears, null, null, 14);
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.YieldToMaturity) {
            return new TextLocalisedClause(R$string.wealth_trading_assets_sorting_yieldToMaturity, null, null, 14);
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.MostTraded) {
            return new TextLocalisedClause(R$string.wealth_trading_assets_sorting_most_traded, null, null, 14);
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.PriceChange1Day) {
            return new TextLocalisedClause(R$string.wealth_trading_assets_sorting_price_change_1d, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
